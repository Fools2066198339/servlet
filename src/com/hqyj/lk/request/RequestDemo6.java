package com.hqyj.lk.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-15:35
 */
@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("requestDemo6....");
		// 获取域共享变量和值
		Object user = request.getAttribute("user");
		System.out.println(user);
	}
}
