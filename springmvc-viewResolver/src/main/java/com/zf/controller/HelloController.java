package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-09-26 12:37
 *
 * 有前缀的 转发和重定向不会经过视图解析器解析
 */
@Controller
public class HelloController {


    /**
     *  如果想跳转到 hello.jsp
     * @return
     */
    @RequestMapping("/hello")
    public  String hello(){
        return  "../../hello";
    }

    /**
     *
     * forward: 转发到一个页面
     *  /hello.jsp  当前项目下
     *  也可以转发到一个请求
     * @return  有forward 的不会用视图解析器解析
     */

    @RequestMapping("handle1")
    public  String handle1(){
        System.out.println("handle1方法执行了");
        return  "forward:/hello.jsp";
    }


    @RequestMapping("handle2")
    public  String handle2(){
        System.out.println("handle2方法执行了");
        return  "forward:/handle1";
    }

    /**
     *   重定向 redirect:
     *
     *   原生的servlet  需要加上项目名才能访问
     *
     *   springMVC中 /就是代表从当前项目下
     * @return
     */

    @RequestMapping("handle3")
    public  String handle3(){
        System.out.println("handle2方法执行了");
        return  "redirect:/hello.jsp";
    }
}
