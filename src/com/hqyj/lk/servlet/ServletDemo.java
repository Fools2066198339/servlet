package com.hqyj.lk.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-26-16:59
 */
@WebServlet(urlPatterns = "/ServletDemo")
public class ServletDemo implements Servlet {


	@Override
	public void init(ServletConfig servletConfig) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		//servlet初始化
		System.out.println("ServletDemo初始化了");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}
}
