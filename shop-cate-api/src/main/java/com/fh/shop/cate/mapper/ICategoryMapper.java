package com.fh.shop.cate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.shop.cate.po.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICategoryMapper extends BaseMapper<Category> {
}
