package com.hqyj.lk.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-30-9:13
 */
@WebServlet("/cookieDemo3")
public class cookieDemo3 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cookieDemo3....");
		//创建变量，假定用户第一次访问
		boolean isFirstVisit = true;
		response.setContentType("text/html;charset=utf-8");

		//获取全部cookies
		Cookie[] cookies = request.getCookies();
		//判断为空
		if (cookies != null) {
			//遍历数组，找名字叫lastVisit
			for (Cookie cookie : cookies) {
				//获取cookies的name
				String name = cookie.getName();
				if ("lastVisit".equals(name)) {
					//不是第一次访问
					isFirstVisit = false;
					//cookies的value是上访问时间
					String value = cookie.getValue();
					//对之前url进行解码
					String decodeString = URLDecoder.decode(value, "utf-8");
					response.getWriter().write("欢迎回来，您上次访问时间为:" + decodeString);

				}
			}
		}
		//判断是否是第一次访问
		if (isFirstVisit) {
			response.getWriter().write("这是您第一次访问");
		}
		//不论是否是第一次访问，都需要记录访问时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//格式化当前时间
		String now = sdf.format(new Date());
		//对时间字符串进行URL编码
		String encodeString = URLEncoder.encode(now, "UTF-8");
		System.out.println(encodeString);
		//创建一个记录当前时间的cookie
		Cookie cookie = new Cookie("lastVisit", encodeString);
		//让cookie保存30天
		cookie.setMaxAge(30*24*60*60);
		//让浏览器保存cookie
		response.addCookie(cookie);
	}
}
