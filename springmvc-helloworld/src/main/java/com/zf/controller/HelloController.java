package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhengfan
 * @create 2020-09-24 16:06
 * @Controller 这是一个组件
 *
 *
 * hello-world 运行流程
 *    1 客户端点击链接 发送 hello请求
 *    2 来到tomcat服务器
 *    3 前端控制器收到所有的请求
 *    4 看请求地址和 @RequestMapping标注的哪个匹配 来找到到底使用哪个类哪个方法处理
 *    5 前端控制器找到了目标处理器和目标方法 直接利用反射执行目标方法
 *    6 方法执行完成会有一个返回值 springmvc会认为这么返回值就是将要去的页面地址
 *    7 拿到方法的返回值之后 用视图解析器进行拼串得到完整的页面地址
 *    8 拿到这个页面地址 前端控制器帮我们转发页面
 *
 * 3  在前端控制器 如果不配置 配置文件的位置 默认是去找 /WEB-INF/
 * 前端控制器名-servlet.xml
 *
 */
@Controller
public class HelloController {

    //@RequestMapping 告诉springmvc 这个方法处理什么请求
    @RequestMapping("/hello")
    public  String hello() {
        System.out.println("正在处理请求中");
        // return "/WEB-INF/pages/success.jsp" 太麻烦 直接在spring配置文件配置视图解析器
        return  "success";
    }
}
