package com.hqyj.lk.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-28-14:28
 */
@WebServlet("/contextDemo4")
public class ContextDemo4 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取servletContext对象
		ServletContext servletContext = request.getServletContext();

		//获取b.txt真实路径
		String realPath1 = servletContext.getRealPath("/b.txt");
		System.out.println(realPath1);
		String realPath2 = servletContext.getRealPath("/WEB-INF/a.txt");
		System.out.println(realPath2);
		String realPath3 = servletContext.getRealPath("/WEB-INF/classes/c.txt");
		System.out.println(realPath3);

		BufferedReader bufferedReader =
				new BufferedReader(new FileReader(realPath1));
		String line = bufferedReader.readLine();
		System.out.println(line);

	}
}
