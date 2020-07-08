package com.fh.shop.area.biz;

import com.fh.shop.common.ServerResponse;

public interface AreaService {
    ServerResponse findAreaList(Long id);

    ServerResponse findAreaTree();

}
