package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.basic.model.MemberVO;

@Controller
@RequestMapping("/re") // "/re"은 계속 반복되므로 클래스에 매핑 걸어줌
public class RequestMappingController {
	
	@RequestMapping(value = {"a.do", "b.do"})
	public String test() {
		System.out.println("a.do 나 b.do 요청됨");
	
	//뷰페이지 지정
	/*
	ModelAndView mv = new ModelAndView();
	mv.setViewName("hello"); // WEB-INF/views + XXXX + .jsp
	return mv;
	 */

	//**********************
	//뷰페이지만 지정할 때 => 리턴값이 String인 경우
	//					뷰페이지로 문자열을 전송하는 것이 아니라 뷰페이지명을 스프링한테 지정
		
	return "hello"; //리턴되는 자료형이 String
	
	}
	
	//***********************
	// 리턴값이 void 인 경우 : 요청명과 동일한 뷰페이지를 지정
	// 요청명 : re/c.do
	// 뷰페이지명 (자동) : /WEB-INF/views +  re/c  + .jsp
	@RequestMapping(value="c.do", params= {"id=kim"})
	public void test2(String id) { //<==(String id) 여기가 사용자 파라메터 받는 곳
		System.out.println("c.do 요청됨");
		System.out.println("사용자로부터 파라메터" + id);
	}
	
	@RequestMapping(value="request.do", method=RequestMethod.GET) //method => get, post 방식지정
	public void test3( @ModelAttribute("vo") MemberVO vo) { //스프링이 변수명을 vo를 잡음 (특별한 경우 아니면 안씀)
		System.out.println("request.do 요청됨 + get 방식");
		// 추후에 DB 입력할 예정
		System.out.println("사용자 이름 : " + vo.getName());
	}
	
	@RequestMapping(value="request.do", method=RequestMethod.POST) //method => get, post 방식지정
	public void test4(MemberVO memberVO) {
		System.out.println("request.do 요청됨 + post 방식");
		
	}
	
	
}
