package com.fh.shop.demo.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.demo.feign.BrandFeignClient;
import com.fh.shop.po.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private BrandFeignClient brandFeignClient;

    @Override
    public ServerResponse add(Brand brand) {
        ServerResponse response=brandFeignClient.addBrand(brand);
        return response;
    }

    @Override
    public ServerResponse deletes(long id) {
        ServerResponse serverResponse = brandFeignClient.deleteBrand(id);
        return serverResponse;
    }

    @Override
    public ServerResponse<Brand> find(Long id) {
        ServerResponse<Brand> byId = brandFeignClient.findById(id);

        return byId;
    }

    @Override
    public ServerResponse update(Brand brand) {
        return brandFeignClient.update(brand);
    }

    @Override
    public ServerResponse findList() {
        ServerResponse<List<Brand>> allBrand = brandFeignClient.findAllBrand();
        List<Brand> brandList = allBrand.getData();
        for (Brand brand:brandList){
            System.out.println(brand.getBrandName()+":"+brand.getId());
        }
        return allBrand;
    }
}
