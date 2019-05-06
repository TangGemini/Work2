package com.gemini.controller;

import com.alibaba.fastjson.JSONObject;
import com.gemini.entity.User;
import com.gemini.service.LoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("content-type","text/html;charset=UTF-8");

        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");

        User user=new User();
        user.setName(name);
        user.setPwd(pwd);
        LoService ts=new LoService();

        boolean ifSucceed=ts.loginService(user);

        JSONObject result = new JSONObject();

        if (ifSucceed==true){
            result.put("success",ifSucceed);
        }else {
            result.put("success",ifSucceed);
            result.put("errMsg","密码错误");
        }

        response.getWriter().print(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
