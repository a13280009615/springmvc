package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhengfan
 * @create 2020-09-24 18:38
 *
 * 如何 从页面发送put  delete 请求  spring提供了对 rest 风格的支持
 * spring mvc 中有一个 filter 他可以把普通的请求转化为规定的请求
 * HiddenHttpMethodFilter
 *在页面中 创建一个post 方式的表单
 * input  name="_method" value="请求的方式" 请求的方式不区分大小写
 *
 * 高版本的 tomcat 不支持delete  put请求   在jsp页面 添加一个 isErrorPage="true"
 */
@Controller
public class BookController {

    /**
     * 添加图书
     * @return 返回的页面信息
     */
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public  String addBook(){
        System.out.println("添加了新的图书");
        return  "success";
    }

    /**
     *  删除图书信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public  String deleteBook(@PathVariable("id") Integer id){
        System.out.println("删除的图书id" + id);
        return  "success";
    }

    /**
     * 修改图书信息
     * @param id
     * @return
     */

    @RequestMapping(value = "/book/{id}",method = RequestMethod.PUT)
    public  String updateBook(@PathVariable("id") Integer id){
        System.out.println("修改的图书id" + id);
        return  "success";
    }

    /**
     *
     *  获取图书信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/book/{id}",method = RequestMethod.GET)
    public  String getBook(@PathVariable("id") Integer id){
        System.out.println("获取的图书id" + id);
        return  "success";
    }
}
