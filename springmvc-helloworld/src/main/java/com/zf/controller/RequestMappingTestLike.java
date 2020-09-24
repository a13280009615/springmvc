package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhengfan
 * @create 2020-09-24 17:39
 *
 * ant风格的 模糊匹配
 *
 * URL可以写模糊的通配符
 *    ?  代表任意一个字符
 *    *  代表任意多个字符和 一层路径
 *    **  代表 任意多层路径
 */
@Controller
public class RequestMappingTestLike {


    @RequestMapping("/antTest01")
    public String antTest01() {
        System.out.println("antTest01被调用了");
        return "success";
    }

    /**
     * 代表一个字符  0个和多个都不行
     *  模糊和精确匹配情况下 精确优先
     */
    @RequestMapping("/antTest0?")
    public String antTest02() {
        System.out.println("antTest02被调用了");
        return "success";
    }

    /**
     *  *  任意字符 也可以匹配一层路径
     * @return
     */

    @RequestMapping("/antTest0*")
    public String antTest03() {
        System.out.println("antTest03被调用了");
        return "success";
    }

    @RequestMapping("/a*/antTest")
    public String antTest04() {
        System.out.println("antTest04被调用了");
        return "success";
    }

    /**
     *   ** 任意层路径
     * @return
     */

    @RequestMapping("/a/**/antTest")
    public String antTest05() {
        System.out.println("antTest05被调用了");
        return "success";
    }

   //    路径占位符  占位符语法可以在任意路径的地方写一个{变量名} 只能占一层路径
    @RequestMapping("/user/{username}")
    public String  PathVariableTest(@PathVariable("username") String username){
        System.out.println("路径上的占位符"+username);
        return  "success";
    }
}
