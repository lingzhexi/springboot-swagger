package com.lzx.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: StormLing
 * @Description:
 * @Date: Created in 15:20 2020/7/11/0011
 * @Modified By:
 */
@RestController
@Api(tags = "用户管理相关接口")
public class TestController {
    @GetMapping("")
    @ApiOperation("根据id查询用户的接口")
    public String test(){
        return "hello swagger";
    }
}
