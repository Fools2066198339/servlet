package com.hqyj.lk.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-28-9:29
 */
@WebServlet("/responseDemo1")
public class responseDemo1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置状态码
		//response.setStatus(302);
		// 设置响应头location，响应头值是重定向url
		//response.setHeader("location","http://www.baidu.com/");
		// 获取当前路径
		//String contextPath = request.getContextPath();
		//response.setHeader("location",contextPath+"/");
		// 设置重定向的api与前两部一样
		response.sendRedirect("http://www.baidu.com/");
	}
}
