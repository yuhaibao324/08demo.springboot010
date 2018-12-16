package com.huangdapangzi.springbootservlet.annotation;

/**
 * Created by 黄大胖子
 * 2018/6/6 13:00
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")  //标记为servlet，以便启动器扫描。
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("firstServlet.\n<br>");
        resp.getWriter().append( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        System.out.println( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        resp.setIntHeader("refresh", 1);
    }

}

