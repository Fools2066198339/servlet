package com.hqyj.lk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-9:19
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ServletDemo3..doGet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ServletDemo3..doPost..");
	}

	@Override
	protected void service(HttpServletRequest request,
						   HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);


	}
}
