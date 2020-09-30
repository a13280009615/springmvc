package com.zf.viewresolver;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author 郑凡
 * @create 2020-09-30 16:12
 */
public class MyViewResolver implements ViewResolver, Ordered {

    /**
     * 根据视图名 返回视图对象
     * @param viewName
     * @param locale
     * @return
     * @throws Exception
     */


    private Integer order;

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        // 处理返回值带 美女 前缀的

        if (viewName.startsWith("meinv:")){
           return  new MyView();
        }else {
            return null;
        }
    }

    @Override
    public int getOrder() {
        return order;
    }

    //改变视图解析器的优先级
    public void  setOrder(Integer order){
       this.order = order;
    }
}
