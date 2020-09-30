package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 郑凡
 * @create 2020-09-30 15:44
 *
 *   导入标签库
 *         <dependency>
 *             <groupId>org.apache.taglibs</groupId>
 *             <artifactId>taglibs-standard-impl</artifactId>
 *             <version>1.2.5</version>
 *         </dependency>
 *         <dependency>
 *             <groupId>org.apache.taglibs</groupId>
 *             <artifactId>taglibs-standard-spec</artifactId>
 *             <version>1.2.5</version>
 *         </dependency>
 *
 *   编写  i18n.properties文件
 *
 *   页面直接使用
 */
@Controller
public class I18nController {

    //如果所有的请求 只是通过 mvc 转发 只需要在 mvc配置文件中
    @RequestMapping("/sdasdd ")
    public  String  wcl(){
      return  "null";
    }

}
