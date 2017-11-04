package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.dao.AddUserDao;
import com.telusko.dao.AddUserDetails;

@Controller
public class userDetilsController {

	@Autowired
	AddUserDao addUserDao;
	
	
	
	@RequestMapping("/addUDetails")
	public String addUserDetails(@ModelAttribute AddUserDetails addUserDetails,ModelMap model ){
		
		addUserDao.addUserDetails(addUserDetails);
		//addUserDao.addUserDetails(addUserDetails);
		//System.out.println("User name: "+addUserDao.toString());
		//System.out.println("User name: "+model);
		model.addAllAttributes(model);
		return "endPage";
	}
	
	@RequestMapping("/checklog")
	public String checkloging(){
		
		return "endPage";
	}
}
