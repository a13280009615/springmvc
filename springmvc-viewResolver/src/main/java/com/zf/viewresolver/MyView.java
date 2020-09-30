package com.zf.viewresolver;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author 郑凡
 * @create 2020-09-30 16:19
 *
 * 自定义视图
 */
public class MyView  implements View {

    /**
     * 返回的数据内容类型
     * @return
     */
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("之前的保存的数据是"+model);

        response.setContentType("text/html");
        response.getWriter().write("哈哈<h1>即将展现精彩内容</h1>");
        List<String> images = (List<String>) model.get("images");

        for (String str : images) {
            response.getWriter().write("<a>下载"+str+".png</a>");
        }
    }
}
