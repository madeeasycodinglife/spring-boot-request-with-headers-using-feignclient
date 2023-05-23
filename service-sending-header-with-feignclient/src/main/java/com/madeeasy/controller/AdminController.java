package com.madeeasy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/")
    public String welcome(HttpServletRequest request){
        System.out.println("request = " + request.getHeader("hello"));
        return "hi from service2 being called";
    }

    /**
     * The @RequestHeader annotation is used to bind the value of the "hello" header from the incoming
     * HTTP request to the headerValue parameter of the getHeaderValue method. The value of the header
     * will be automatically passed to the method when a request is made to the /example endpoint.
     */
    @GetMapping("/test")
    public String test(@RequestHeader("hello") String requestHeader){
      return " '/test' value : " +requestHeader;
    }
}
