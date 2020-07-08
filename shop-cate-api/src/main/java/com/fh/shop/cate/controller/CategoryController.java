package com.fh.shop.cate.controller;

import com.fh.shop.cate.biz.ICategoryService;
import com.fh.shop.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/api/category")
@Controller
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("findAllCategory")

    @ResponseBody

    public ServerResponse findAllCategory() {
        return categoryService.findAllCateList();
    }
}
