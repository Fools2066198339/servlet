package com.hqyj.lk.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-14:28
 */
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求体信息
		//获取请求体中的字符信息，可以使用getReader()获取流对象
		BufferedReader reader = request.getReader();
		//使用该字符流对象获取字符信息
		String line =null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
