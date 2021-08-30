package com.hqyj.lk.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-30-14:39
 */
@WebServlet("/sessionDemo2")
public class SessionDemo2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SessionDemo2.....");
		//获取httpSession
		HttpSession session = request.getSession();
		//使用session共享数据
		Object username = session.getAttribute("username");
		System.out.println("username"+username);
	}
}
