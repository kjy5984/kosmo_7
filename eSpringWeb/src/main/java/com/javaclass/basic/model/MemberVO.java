package com.javaclass.basic.model;

public class MemberVO {
	
	private String id;
	private String name;
	private int age;
	private boolean state;
	
	
	//boolean 세터,게터
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	//생성자
	public MemberVO() {	}
		
	public MemberVO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
		
	
	//세터게터
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
