package com.deepter.blog.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="home")
	public String toHome(HttpSession session,Map<String, Object> map,Model model){
		System.out.println(session.getId());
		model.addAttribute("name", "Session的名字是：");
		map.put("sessionId", session.getId());
		return "home";
	}
}
