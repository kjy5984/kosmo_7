package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.basic.model.MemberList;
import com.javaclass.basic.model.MemberVO;



@Controller
public class ListController {
	
	@RequestMapping("multiInsert.do")
	public String test(MemberList memberList) {
		// 각각의 입력값 출력
		for(MemberVO vo : memberList.getList()) {
			System.out.println(vo.getId() + "[" + vo.getName() + "]" + vo.getAge());
		}
		
		return "03_List";
	}
	
}
