package com.hqyj.lk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-26-16:59
 */
//@WebServlet({"/ServletDemo41","/ServletDemo42","/ServletDemo43"})
//@WebServlet("*.do")//任何以do结尾的都可以访问
//@WebServlet("*.do")//任何以do结尾的都可以访问
//@WebServlet("/demo/ServletDemo4")
//@WebServlet("/*")	//匹配所有urlPatterns通配优先级较低
//@WebServlet("/")
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
	}
}
