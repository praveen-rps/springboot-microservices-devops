package com.examples.coforge.fismvcexample.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("home","name","praveen");
	}
	
	
	@RequestMapping(value="/validate")
	public ModelAndView test1(HttpServletRequest request) throws Exception{
		String uid = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal","root","root");
		Statement pst = con.createStatement();
		ResultSet rs = pst.executeQuery("select * from fisusers");
		boolean isFound=false;
		while(rs.next()) {
			if(uid.equals(rs.getString(1)) && passwd.equals(rs.getString(2)))
			{
				isFound=true;
				break;
			}
		}
		if(isFound)
			return new ModelAndView("success","username",uid);
		else
			return new ModelAndView("fail","username",uid);
		
		
	}
}
/*
View --->
view,object,value

*/