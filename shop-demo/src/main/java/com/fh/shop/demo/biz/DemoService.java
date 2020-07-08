package com.fh.shop.demo.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.po.Brand;

public interface DemoService {
    ServerResponse add(Brand brand);

    ServerResponse deletes(long id);

    ServerResponse<Brand> find(Long id);

    ServerResponse update(Brand brand);

    ServerResponse findList();

}
