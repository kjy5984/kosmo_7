package com.javaclass.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.basic.model.MemberVO;

@Controller // 이 클래스가 컨트롤러 역할
public class ModelValueController {
	
	//변수선언 // 스프링 객체 자동주입
	@Autowired
	private MemberVO mem;
	
	
	@RequestMapping("modelValue.do")
	public ModelAndView test() {
		System.out.println("modelValue.do 요청됨");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("01_modelValue");
		mv.addObject("vo", mem);
		
		return mv;
		
		
	}
	
	
}
