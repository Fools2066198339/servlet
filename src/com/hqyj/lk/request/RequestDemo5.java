package com.hqyj.lk.request;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/requestDemo5")
public class RequestDemo5 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("requestDemo5....");
		// 设置域共享变量和值
		request.setAttribute("user", "liukui");
		// 获取请求转发器
		RequestDispatcher requestDemo5 = request.getRequestDispatcher(
				"/requestDemo6");
		// 使用请求转发器做请求转发
		requestDemo5.forward(request,response);
	}
}
