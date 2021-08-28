package com.hqyj.lk.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-28-9:29
 */
@WebServlet("/responseDemo2")
public class responseDemo2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 设置输出流的缓冲区编码
		response.setCharacterEncoding("gbk");
		// 设置Content-tyPE,告诉浏览器想在响应体数据的格式和编码
		//response.setHeader("content-type","text/html;character=utf-8");
		response.setContentType("text/html;character=utf-8");
		// 获取字符输出流
		PrintWriter writer = response.getWriter();
		// 使用流对象写入数据
		writer.write("你好  hello response");
	}
}
