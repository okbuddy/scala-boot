package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootjava {
    @RequestMapping(value="/hellojava",method =RequestMethod.GET)
    public String hello1(){
        return "hello java boot";
    }
}
