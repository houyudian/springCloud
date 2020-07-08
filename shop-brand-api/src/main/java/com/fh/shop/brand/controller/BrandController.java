package com.fh.shop.brand.controller;

import com.fh.shop.brand.biz.BrandService;
import com.fh.shop.brand.po.Brand;
import com.fh.shop.common.ServerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brand")
@CrossOrigin("*")
@Api(tags = "品牌接口")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @ApiOperation("品牌")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nonce", value = "唯一随机数", dataType = "string", required = true, paramType = "header"),
            @ApiImplicitParam(name = "time", value = "当前时间", dataType = "string", required = true, paramType = "header"),
            @ApiImplicitParam(name = "sign", value = "签名", dataType = "string", required = true, paramType = "header"),
    })
    @RequestMapping(value = "findReconmendBrand", method = RequestMethod.GET)
    public ServerResponse findReconmendBrand() {
        return brandService.findReconmendBrand();
    }

    @ApiOperation("品牌展示")
    @GetMapping("findAllBrand")
    public ServerResponse findAllBrand() {
        return brandService.findAllBrand();
    }

    @PostMapping("addBrand")
    public ServerResponse addBrand(@RequestBody Brand brand) {
        return brandService.addBrand(brand);
    }

    @PutMapping("update")
    public ServerResponse update(@RequestBody Brand brand) {
        return brandService.update(brand);

    }

    @GetMapping("findById")
    public ServerResponse<Brand> findById(@RequestParam("id") Long id) {
        return brandService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ServerResponse deleteBrand(@PathVariable("id") Long id) {
        return brandService.deleteBrand(id);
    }

}
