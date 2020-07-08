package com.fh.shop.goods.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.goods.po.Goods;

import java.util.List;

public interface GoodsService {

    ServerResponse findHotList();

    ServerResponse queryGoodsList();

    public List<Goods> stockLess();
}
