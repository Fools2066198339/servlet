package com.hqyj.lk.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-13:44
 */
@WebServlet("/requestDemo2")
public class RequestDemo1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
		//String username = request.getParameter("username");
		//System.out.println(username);
		// 获取所有的请求头的名字
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String element = headerNames.nextElement();
			//更具请求头的名字返回请求头的值
			String header = request.getHeader(element);
			System.out.println(element+":"+header);
		}


	}
}
