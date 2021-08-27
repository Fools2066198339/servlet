package com.hqyj.lk.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-14:41
 */
@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("username="+username);
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String element = parameterNames.nextElement();
			String parameter = request.getParameter(element);
			System.out.println(element+"="+parameter);
		}
		String[] parameterValues = request.getParameterValues("roles");
		for (String parameterValue : parameterValues) {
			System.out.println("roles:"+parameterValue);
		}
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey()+":"+ Arrays.toString(entry.getValue()));
		}
	}
}
