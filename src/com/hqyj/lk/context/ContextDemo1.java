package com.hqyj.lk.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-28-14:28
 */
@WebServlet("/contextDemo1")
public class ContextDemo1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取servletContext对象
		ServletContext servletContext = request.getServletContext();
		System.out.println(servletContext);
		Object user = servletContext.getAttribute("user");
		System.out.println(user);

	}
}
