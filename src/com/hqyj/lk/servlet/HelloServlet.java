package com.hqyj.lk.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-26-14:06
 */
public class HelloServlet implements Servlet {
	//ctrl + i 快速实现
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		//servlet初始化
		System.out.println("servlet初始化了");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("hello  servlet");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("helloServlet被销毁了");
	}
}
