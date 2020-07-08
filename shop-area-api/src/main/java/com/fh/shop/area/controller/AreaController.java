package com.fh.shop.area.controller;


import com.fh.shop.area.biz.AreaService;
import com.fh.shop.common.ServerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/area")
@RestController
@CrossOrigin("*")
@Api(tags = "地区接口")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping
    @ApiOperation("地区展示")
    public ServerResponse findAreaList(@RequestParam Long id) {
        return areaService.findAreaList(id);
    }

    @GetMapping("areaTree")
    @ApiOperation("地区数展示")
    public ServerResponse areaTree() {
        return areaService.findAreaTree();
    }

}
