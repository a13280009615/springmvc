package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhengfan
 * @create 2020-09-24 17:00
 * @RequestMapping 标注在类上 就表示为当前类上所有的方法指定一个基准的路径
 */
@RequestMapping("/haha")
@Controller
public class RequestMappingController {

    @RequestMapping("/handle01")
    public String handle01(){
        System.out.println("RequestMappingController ...handle01");
        return "success";
    }

    /**
     *  method:
     *    限定请求方式  RequestMethod枚举类定义了所有 http协议中的请求方式
     *  consumes: 只接受内容类型是那种的请求 规带请求头中的 content type
     *  produces: 告诉游览器返回的内容的类型是什么 给响应头中加上Context-type
     * @return
     */
    @RequestMapping(value = "/handle02",method = RequestMethod.POST )
    public String handle02(){

        return "success";
    }

    /**
     *  params:
     *      params = {"username"}
     *      param1: 表示请求的时候必须带上一个 param1的参数
     *     !param1: 表示请求的时候必须不能携带名为param1的参数
     *     param1=123： 表示请求的时候必须是param1且值为123的参数
     *     param1!=123： 表示请求的时候携带param1且值不能为123的参数
     *     可以使用多规则 多个规则逗号隔开
     * @return
     */
    @RequestMapping(value = "/handle03",params = {"username"})
    public String handle03(){

        return "success";
    }

    /**
     * 请求参数 和param参数一样的规则
     * 谷歌
     * @return
     */
    @RequestMapping(value = "/handle04",headers = {"User-Agent!=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36"})
    public String handle04(){
        System.out.println("handle04");
        return "success";
    }


}
