package com.hqyj.lk.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-9:14
 */
@WebServlet("/ServletDemo2")
public class ServletDemo2 extends GenericServlet {
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("ServletDemo2初始化");
	}
}
