package com.fh.shop.cate.biz;

import com.alibaba.fastjson.JSONObject;
import com.fh.shop.cate.mapper.ICategoryMapper;
import com.fh.shop.cate.po.Category;
import com.fh.shop.common.RedisUtil;
import com.fh.shop.common.ServerResponse;
import com.fh.shop.common.SystemConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryMapper categoryMapper;

    @Override
    public ServerResponse findAllCateList() {

        String cate = RedisUtil.get(SystemConstant.CATE_LIST_KEY);

        if (StringUtils.isNotEmpty(cate)) {
            List<Category> categories = JSONObject.parseArray(cate, Category.class);
            RedisUtil.expire(SystemConstant.CATE_LIST_KEY, SystemConstant.CATE_EXPIRE);
            return ServerResponse.success(categories);
        }

        List<Category> categorieList = categoryMapper.selectList(null);
        String s = JSONObject.toJSONString(categorieList);
        RedisUtil.setEx(SystemConstant.CATE_LIST_KEY, s, SystemConstant.CATE_EXPIRE);

        return ServerResponse.success(categorieList);
    }
}
