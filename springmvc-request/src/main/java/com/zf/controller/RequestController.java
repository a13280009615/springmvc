package com.zf.controller;

import com.zf.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * @author zhengfan
 * @create 2020-09-25 上午12:13
 *
 * springMvc 如何获取请求参数
 */
@Controller
public class RequestController {

    /***
     *  mvc 如何获取参数
     *  默认情况下获取请求参数
     *    直接给方法入参写上一个和请求参数相同的变量 这个变量就来接收请求参数的值
     *     带就有值  没有就为null
     * @return
     */
    @RequestMapping("/handle")
    public String handle(String username){
        System.out.println(username);
        return  "success";
    }


    /***
     * @RequestParam  用来获取请求参数的 该注解是标注的参数 默认是必须要带的
     *     @RequestParam("user") String username =username  = request.getParameter("user");
     *   value: 指定要获取的参数的 key
     *   required: 是否是必须的  默认是 true
     *   defaultValue: 指定一个 默认值
     * @PathVariable 和 @RequestParam 的区别
     * 前者是从路径中占位符的值   后者是获取参数的值

     */
    @RequestMapping("/handle2")
    public String handle2(@RequestParam(value = "user",required = false,defaultValue = "hahaha") String username){
        System.out.println(username);
        return  "success";
    }

    /**
     * @RequestHeader 用来获取请求头的参数 如果这个请求头中没有这个参数就会报错
     *   和 @RequestParam 一样
     */
    @RequestMapping("/handle3")
    public String handle3(@RequestHeader("User-Agent") String userAgent){
        System.out.println(userAgent);
        return  "success";
    }

    /**
     *   之前获取cookie
     *  Cookie [] cookies =  request.getCookies();
     *  for(Cookie cookie: cookies){
     *      if(cookie.getName().equals("JSESSIONID")){
     *          cookie.getValue();
     *      }
     *  }
     *
     * 基本 和 请求头 和 请求参数一样
     */
    @RequestMapping("/handle4")
    public String handle4(@CookieValue("JSESSIONID") Long id){

        System.out.println(id);
        return  "success";
    }


    /**
     *  如果我们的请求参数 是pojo  springMVC 会自动为这个pojo进行赋值
     *  将POJO的每一个属性从 request参数中尝试获取出来 并封装
     *  还可以及联封装属性
     *  请求参数的参数名和对象中的属性名一一对应就可以
     *  请求数据的时候有可能乱码
     *
     *  请求乱码
     *     get请求  改server.xml  8080 加一个属性 URIEncoding="UTF-8"
     *     post请求  在第一次获取请求参数之前设置 request.setCharacterEncoding("UTF-8");
     *     springMVC已经提供好了 这个filter  CharacterEncodingFilter
     *  响应乱码
     *  response.setContentType("text/html;charset=utf-8");
     */
    @RequestMapping("/book")
    public String save(Book book){
        System.out.println(book);
        return  "success";
    }

    /**
     *  springMVC 可以直接写原生的api
     *  HttpServletRequest
     *  HttpServletResponse
     *  HttpSession
     *  java.security.Principal  bs 安全相关的
     *  Locale  国际化相关的区域信息
     *  InputStream   ServletInputStream inputStream = request.getInputStream();
     *  OutputStream   ServletOutputStream outputStream = response.getOutputStream();
     *  Reader    BufferedReader reader = request.getReader();
     *  Writer  PrintWriter writer = response.getWriter();
     */
    @RequestMapping("/req")
    public String handleRequest(HttpSession session, HttpServletRequest request, HttpServletResponse response){
    request.setAttribute("reqScope","haha");
    session.setAttribute("seScope","hehe");

        return "success";
    }
}
