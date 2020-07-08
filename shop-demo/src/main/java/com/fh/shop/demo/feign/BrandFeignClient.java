package com.fh.shop.demo.feign;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.po.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "shop-brand-api")
public interface BrandFeignClient {
    @PostMapping("/api/brand/addBrand")
    public ServerResponse addBrand(@RequestBody Brand brand);

    @GetMapping("/api/brand/findAllBrand")
    public ServerResponse<List<Brand>> findAllBrand();

    @PutMapping("/api/brand/update")
    public ServerResponse update(@RequestBody Brand brand);

    @GetMapping("/api/brand/findById")
    public ServerResponse<Brand> findById(@RequestParam("id") Long id);

    @DeleteMapping("/api/brand/delete/{id}")
    public ServerResponse deleteBrand(@PathVariable("id") Long id);
}
