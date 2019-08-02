package com.atguigu.gulimall.oms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xupeiwu
 * @create 2019-08-02 18:48
 */

@FeignClient(name="gulimall-pms")
public interface WorldService {
    @GetMapping("/world")
    public String  world();
}
