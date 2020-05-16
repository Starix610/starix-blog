package com.starix.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Starix
 * @date 2020-05-03 20:49
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

}
