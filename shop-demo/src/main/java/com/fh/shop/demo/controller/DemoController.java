package com.fh.shop.demo.controller;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.demo.biz.DemoService;
import com.fh.shop.po.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @DeleteMapping("/del/{id}")
    public ServerResponse delete(@PathVariable("id") long id) {
        return demoService.deletes(id);

    }

    @PostMapping("add")
    public ServerResponse add(Brand brand) {
        return demoService.add(brand);
    }

    @PutMapping("/update")
    public ServerResponse update(Brand brand) {
        return demoService.update(brand);
    }

    @GetMapping("find")
    public ServerResponse<Brand> find(@RequestParam("id") Long id) {
       /* ServerResponse serverResponse = demoService.find(id);
        Object data = serverResponse.getData();*/
        ServerResponse<Brand> serverResponse = demoService.find(id);
        Brand brand = serverResponse.getData();

        String brandName = brand.getBrandName();
        System.out.println(brandName);
        return serverResponse;
    }
    public ServerResponse findList(){

        return demoService.findList();
    }

}
