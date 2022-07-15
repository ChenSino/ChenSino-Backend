package com.chensino.chensino.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 204506
 * @Description demo
 * @create 2022-07-15 14:43
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("test")
    public String test(){
        return "Hello spring";
    }

}
