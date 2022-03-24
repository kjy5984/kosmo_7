<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> /WEB-INF/views/ re / request.jsp</title>
</head>
<body>

<h2> request.do에 의한 뷰페이지 입니다 </h2>

사용자 아이디 : ${param.id }<br/>
사용자 명 : ${param.name }<br/>
사용자 나이 : ${param.age }<br/>

<hr/>
<!-- vo는 여기서는 못씀/ 화면에 아무것도 안나옴 -->
사용자 아이디 : ${vo.id }<br/>
사용자 명 : ${vo.name }<br/>
사용자 나이 : ${vo.age }<br/>

<hr/>
<!-- 스프링은 클래스명의 소문자로 객체 자동 생성 -->
사용자 아이디 : ${memberVO.id }<br/>
사용자 명 : ${memberVO.name }<br/>
사용자 나이 : ${memberVO.age }<br/>

</body>
</html>