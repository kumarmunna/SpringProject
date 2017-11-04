package com.telusko.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.services.AddService;

@Controller
public class AddController {

		@RequestMapping("/add")
		public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
			System.out.println(" I m here ");
			
			AddService as = new AddService();
			int a = Integer.parseInt(request.getParameter("t1"));
			int b =Integer.parseInt(request.getParameter("t2"));
			int sum= as.add(a, b);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display");
			mv.addObject("result",sum);
			
			return mv;
		}
}
