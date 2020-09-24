package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhengfan
 * @create 2020-09-25 上午1:56
 */
@Controller
public class Hello {

    @RequestMapping("/hello")
    public String  hello(){
        return "success";
    }
}
