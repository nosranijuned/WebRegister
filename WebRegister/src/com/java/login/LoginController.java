package com.java.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		String qry = "select * from test.user where uname = "+uname;
		
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/sample","atcs","atcs@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
