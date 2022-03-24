package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("start.do")
	public ModelAndView test() {
		System.out.println("start.do 요청되었습니다");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "오늘도우리조화이팅");
		mv.setViewName("hello"); //==> /WEB-INF/views/ + hello + .jsp
		return mv;
	}
	
	
}
