package com.madeeasy.controller;

import com.madeeasy.feign.UserFeignClient;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserFeignClient userFeignClient;
    @GetMapping("/")
    public String welcome(HttpServletRequest request){
        String value = request.getHeader("hello");
        String welcome = userFeignClient.welcome(value);
        String test = userFeignClient.testModified(value);
        return "hello "+welcome+"test  "+test;
    }
}
