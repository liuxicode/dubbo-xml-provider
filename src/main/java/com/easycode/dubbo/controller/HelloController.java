package com.easycode.dubbo.controller;

import com.easycode.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xi.liu1
 * @version 0.0.1
 * @time 2019/7/12 13:38
 * @Desc description
 * @email xi.liu1@dmall.com
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/h")
    public String h(@RequestParam("name") String name){

        return helloService.hello(name);

    }

}
