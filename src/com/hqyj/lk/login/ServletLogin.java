package com.hqyj.lk.login;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @AUTHOR LK
 * @CREATE 2021-08-27-16:23
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletLogin....");
		//获取httpSession
		HttpSession session = request.getSession();
		// 设置编码格式避免乱码问题
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String checkCode = request.getParameter("checkCode");
		System.out.println("username:"+username+" password:"+password);
		System.out.println(checkCode);
		Object checkCode1 = session.getAttribute("checkCode");
		System.out.println(checkCode1);
		if ((String.valueOf(checkCode1).toUpperCase()).equals(checkCode.toUpperCase())) {
			//从数据库查询登录
			//创建连接池实例
			ComboPooledDataSource ds = new ComboPooledDataSource();
			//设置数据库的驱动
			try {
				ds.setDriverClass("com.mysql.jdbc.Driver");
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			//设置数据库的地址
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
			//设置连接数据库的用户名
			ds.setUser("root");
			//设置连接数据库的密码
			ds.setPassword("root");
			//设置连接池的初始连接数
			ds.setInitialPoolSize(6);
			//设置连接池最多有多少连接数
			ds.setMaxPoolSize(40);
			//设置连接池中最少连接数
			ds.setMinPoolSize(2);
			//设置连接池缓存Statement的最大数
			ds.setMaxStatements(180);
			try {
				Connection con = ds.getConnection();
				//  安全的SQL查询 ,一般查询场景
				String sql = "SELECT * FROM custom WHERE name = ? and password = ?";
				PreparedStatement pre = con.prepareStatement(sql);
				pre.setString(1, username);
				pre.setString(2, password);
				ResultSet rs = pre.executeQuery();
				if (rs.next()) {
					RequestDispatcher successLogin = request.getRequestDispatcher("/success.jsp");
					session.setAttribute("success","恭喜登录成功！");
					successLogin.forward(request, response);

					System.out.println("恭喜登录成功！");
				} else {
					RequestDispatcher failLogin = request.getRequestDispatcher("/fail.jsp");
					session.setAttribute("error","2");
					System.out.println("用户名或密码错误！");
					failLogin.forward(request, response);
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			RequestDispatcher failLogin = request.getRequestDispatcher("/fail.jsp");
			System.out.println("验证码错误");
			session.setAttribute("error","1");
			failLogin.forward(request, response);
		}


	}


}