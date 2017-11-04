package com.telusko.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.services.loginService;

@Controller
public class loginController {

	ModelAndView mv = new ModelAndView();
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("t1");
		String password = request.getParameter("t2");
		
		//calling service to check the login credentials.
		loginService logS = new loginService();
		boolean status = logS.checkLogin(userName, password);
		System.out.println("login status:"+ status);
		mv.addObject("success",status);
		mv.setViewName("display");
		return mv;
	}
}
