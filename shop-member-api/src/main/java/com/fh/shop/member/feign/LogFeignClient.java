package com.fh.shop.member.feign;

import com.fh.shop.common.ServerResponse;

import com.fh.shop.po.Log;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "shop-log-api")
public interface LogFeignClient {
    @PostMapping("/api/log/addLog")
    public ServerResponse addLog(@RequestBody Log log);



}
