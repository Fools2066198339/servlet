package com.hqyj.lk.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-30-9:13
 */
@WebServlet("/cookieDemo1")
public class cookieDemo1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cookieDemo1....");
		//创建一个cookie对象,数据类型:名值对(String)
		Cookie cookie = new Cookie("username","liukui" );
		//设置cookies存活时长:20秒
		cookie.setMaxAge(20);
		//使用response发送到浏览器
		response.addCookie(cookie);
	}
}
