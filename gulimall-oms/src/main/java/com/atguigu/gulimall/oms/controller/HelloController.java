package com.atguigu.gulimall.oms.controller;

import com.atguigu.gulimall.oms.feign.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xupeiwu
 * @create 2019-08-02 18:42
 */
@RestController
public class HelloController {
    @Autowired
    WorldService worldService;


    @GetMapping("/hello")
    public String hello(){
        String msg = "";
        msg = worldService.world();
       return  "hello"+msg;
    }
}
