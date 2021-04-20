package com.oss.myapp;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String login(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String result = "fail";
		
		if(id.equals("id") && pwd.equals("pwd")) {
			result = "success";
		}
		
		return result;
	}
}

