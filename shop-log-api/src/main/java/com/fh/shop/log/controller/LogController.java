package com.fh.shop.log.controller;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.log.biz.LogService;
import com.fh.shop.po.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/log")
@CrossOrigin("*")
public class LogController {
    @Autowired
    private LogService logService;
    @PostMapping("/addLog")
    public ServerResponse addLog(@RequestBody Log log){
        return logService.addLog(log);
    }

}
