package com.fh.shop.log.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.log.mapper.LogMapper;
import com.fh.shop.po.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
@Autowired
private LogMapper logMapper;
    @Override
    public ServerResponse addLog(Log log) {
        logMapper.insert(log);
        return ServerResponse.success();
    }
}
