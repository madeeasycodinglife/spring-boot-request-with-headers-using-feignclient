package com.madeeasy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "http://localhost:9095",name = "user-feign")
public interface UserFeignClient {
    @GetMapping("/")
    public String welcome(@RequestHeader("hello") String headerValue);

    @GetMapping("/test")
    public String  testModified(@RequestHeader("hello") String headerValue);
}
