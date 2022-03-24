package com.javaclass.basic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.basic.model.MemberVO;

@Controller
public class ParamResultController {
	
	//**************
	// 세션이 필요하면 함수의 인자로 HttpSession session
	@RequestMapping("param.do")
	public String test(String id, String age) {
		System.out.println("04_paramResult" + id + "/" +age);
		
		return "04_paramResult";
	}
	
	@RequestMapping("paramForm.do")
	public String test2(MemberVO vo, HttpSession session) {
						//(MemberVO vo)
		System.out.println("04_paramResult" + vo.getId() + "/" + vo.getName() + "/" + vo.getAge());
											//vo.getId()
		
		// 추후에는 실제 DB의 값과 비교할 것임
		String dbId="0001";
		String dbName="홍길동";
		
		if(vo.getId().equals(dbId) && vo.getName().equals(dbName)) {
			//로그인 성공한 상태
			session.setAttribute("login", dbName);
		}
		
		return "04_paramResult";
	}
		 
		
}
