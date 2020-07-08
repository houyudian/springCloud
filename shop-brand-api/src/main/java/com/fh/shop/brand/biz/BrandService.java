package com.fh.shop.brand.biz;

import com.fh.shop.brand.po.Brand;
import com.fh.shop.common.ServerResponse;

public interface BrandService {
    ServerResponse findReconmendBrand();

    ServerResponse addBrand(Brand brand);

    ServerResponse findAllBrand();

    ServerResponse update(Brand brand);

    ServerResponse<Brand> findById(Long id);

    ServerResponse deleteBrand(Long id);

}
