package com.example.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuanjiangping
 */
@Controller
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "hello";
    }

}
