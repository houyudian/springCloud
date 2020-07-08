package com.fh.shop.log.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.po.Log;
public interface LogService {
    ServerResponse addLog(Log log);

}
