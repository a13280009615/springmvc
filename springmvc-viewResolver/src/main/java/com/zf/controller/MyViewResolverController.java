package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郑凡
 * @create 2020-09-30 16:12
 *  自定义 视图解析器 和视图对象
 */
@Controller
public class MyViewResolverController {

    @RequestMapping("/handlePlus")
    public  String handlePlus(Model model){
        List<String> videos = new ArrayList<>();
        List<String> images = new ArrayList<>();
        videos.add("苍老师");
        videos.add("波多老师");

        images.add("白咲碧");
        images.add("小泽玛利亚");

        model.addAttribute("video",videos);
        model.addAttribute("images",images);
     return "meinv:/gaoqing";
    }
}


