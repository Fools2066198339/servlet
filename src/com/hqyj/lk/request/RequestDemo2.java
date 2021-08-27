package com.hqyj.lk.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-13:44
 */
@WebServlet("/requestDemo1")
public class RequestDemo2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 打印请求对象
		System.out.println(request);
		// 获取请求方式
		String method = request.getMethod();
		System.out.println(method);
		// 获取项目的虚拟路径
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		//获取请求的url
		StringBuffer requestURL = request.getRequestURL();
		System.out.println(requestURL);
		//获取请求的uri
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		//获取请求的queryString
		String queryString = request.getQueryString();
		System.out.println(queryString);
		//获取请求协议
		String protocol = request.getProtocol();
		System.out.println(protocol);
		String username = request.getParameter("username");
		System.out.println(username);
	}
}
