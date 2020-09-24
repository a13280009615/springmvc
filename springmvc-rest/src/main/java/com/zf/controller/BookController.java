package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhengfan
 * @create 2020-09-24 18:38
 */
@Controller
public class BookController {

    @RequestMapping(value = "/book{id}")
    public  String addBook(@PathVariable("id") Integer id){
        System.out.println(id);
        return  "success";
    }

    public  String deleteBook(){
   return  "";
    }

    public  String updateBook(){
        return  "";
    }

    public  String getBook(){
        return  "";
    }
}
