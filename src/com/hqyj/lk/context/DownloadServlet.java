package com.hqyj.lk.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-28-14:28
 */
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求参数编码
		request.setCharacterEncoding("utf-8");
		//获取请求参数filename的值
		String filename = request.getParameter("filename");
		System.out.println(filename);
		//获取对应文件的虚拟路径
		String path = "/image/"+filename;
		//获取真实路径
		ServletContext servletContext = request.getServletContext();
		String realPath = servletContext.getRealPath(path);
		System.out.println(realPath);
		//设置响应头信息
		response.setHeader("content-disposition","attachment;filename="+filename);
		//通过servletContext对象获取文件的mimeType
		String mimeType = servletContext.getMimeType(filename);
		//服务器告诉浏览器响应头的格式
		response.setContentType(mimeType);

		BufferedInputStream bis =
				new BufferedInputStream(new FileInputStream(realPath));
		//使用response对象获取输入流
		ServletOutputStream outputStream = response.getOutputStream();
		byte[] buffer = new byte[1024*1024];
		int len;
		while ((len = bis.read(buffer)) != -1) {
			outputStream.write(buffer,0,len);
		}
		bis.close();
	}
}
