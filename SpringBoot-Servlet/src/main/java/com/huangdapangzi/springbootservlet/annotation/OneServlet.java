package com.huangdapangzi.springbootservlet.annotation;

import com.sun.xml.internal.ws.resources.HttpserverMessages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @创建人 steffens
 * @创建时间 2018/12/16
 * @描述 文件创建
 */
@WebServlet(name = "OneServlet", urlPatterns = "/OneServlet")
public class OneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        resp.getWriter().append("OneServlet.\n");
        resp.getWriter().append( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        resp.setIntHeader("refresh", 1);
    }
}