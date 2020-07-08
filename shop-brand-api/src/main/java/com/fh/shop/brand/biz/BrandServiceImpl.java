package com.fh.shop.brand.biz;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.shop.brand.mapper.BrandMapper;
import com.fh.shop.brand.po.Brand;
import com.fh.shop.common.RedisUtil;
import com.fh.shop.common.ServerResponse;
import com.fh.shop.common.SystemConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public ServerResponse findReconmendBrand() {
        String brandJson = RedisUtil.get(SystemConstant.BRAND_KEY);
        if (StringUtils.isNotEmpty(brandJson)) {
            List<Brand> brands = JSONObject.parseArray(brandJson, Brand.class);
            RedisUtil.expire(SystemConstant.BRAND_KEY, SystemConstant.BRAND_EXPIRE);
            return ServerResponse.success(brands);
        }
        QueryWrapper<Brand> brandQueryWrapper = new QueryWrapper<>();
        brandQueryWrapper.eq("isReconmend", SystemConstant.RECOMMEND_BRAND);
        brandQueryWrapper.orderByAsc("sort");
        List<Brand> brandList = brandMapper.selectList(brandQueryWrapper);

        brandJson = JSONObject.toJSONString(brandList);
        RedisUtil.setEx(SystemConstant.BRAND_KEY, brandJson, SystemConstant.BRAND_EXPIRE);
        return ServerResponse.success(brandList);
    }

    @Override
    public ServerResponse addBrand(Brand brand) {
        brandMapper.insert(brand);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse<List<Brand>> findAllBrand() {
        List<Brand> brands = brandMapper.selectList(null);
        return ServerResponse.success(brands);
    }

    @Override
    public ServerResponse update(Brand brand) {
        brandMapper.updateById(brand);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse<Brand> findById(Long id) {
        Brand brand = brandMapper.selectById(id);
        return ServerResponse.success(brand);
    }

    @Override
    public ServerResponse deleteBrand(Long id) {
        brandMapper.deleteById(id);
        return ServerResponse.success();
    }
}
