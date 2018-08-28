package com.mj.springcloudcustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hcmony on 2017/9/5.
 */
@FeignClient(value = "server-service")
public interface TestService {

   @RequestMapping("/test")
   public String test();

}