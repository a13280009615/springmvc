package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author zhengfan
 * @create 2020-09-25 上午2:04
 *
 * spring Mvc 除了 原生api 还能怎么样给页面传值
 *
 * 1 可以在方法处 传入map  model 或者 modelMap 给这些参数保存的所有数据都会放在请求域中可以在页面中获取
 *   关系
 *  map(interface)  model(interface)   modelMap(Class)
 *  最终都是BindingAwareModelMap在工作  相当于参数都被保存在 最终都是BindingAwareModelMap中都会放在
 *  请求域中
 *  modelMap  是 map 实现类
 *  BindingAwareModelMap  ExtendedModelMap 继承 ModelMap 实现了 Model 接口
 *
 *
 * 2 方法的返回值可以变成ModelAndView
 *   既包含视图信息 也包含模型数据(给页面带的数据) 数据是放在请求域中
 *
 *
 *  3springMVC 提供了一种给 session中保存数据的方式
 *  使用一个注解 @SessionAttributes 该注解只能标注在类上
 *  @SessionAttributes(value = {"msg"}) 给BindingAwareModelMap 或者modelAndView中保存的数据 同时从session中放一份
 *  value 指定保存数据时 要给session中放的key
 *  types 指定类型  只要保存的是该类型的数据  就会在session中放一份数据 可能会引发异常给 session中放数据
 *  使用原生api
 */
@SessionAttributes(value = "msg")
@Controller
public class OutputController {

    @RequestMapping("/handle1")
    public String handle(Map<String,Object> map){
        System.out.println(map.getClass());
        map.put("msg","你好");
        return "success";
    }

    /**
     * model 是个接口
     * @param model
     * @return
     */
    @RequestMapping("/handle2")
    public String handle2(Model model){
        System.out.println(model.getClass());
      model.addAttribute("msg","nihaohuai");
        return "success";
    }


    @RequestMapping("/handle3")
    public String handle3(ModelMap modelMap){
        System.out.println(modelMap.getClass());
        modelMap.addAttribute("msg","nihaohuai");
        return "success";
    }


    /**
     *
     * @return 可以为页面携带参数 modelAndView.setViewName();
     */
    @RequestMapping("/handle4")
    public ModelAndView handle4(){
        //之前的返回值我们就叫视图名 视图名和视图解析器会帮助我们拼接地址
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("msg","你好哦！");
        return modelAndView;
    }
}
