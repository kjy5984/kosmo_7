<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> /WEB-INF/views/ 04_paramResult.jsp </title>
</head>
<body>

<h4>여기는 파라미터값을 출력</h4>

아이디 : ${param.id } <br/> 
나이 : ${param.age }<br/>

<hr/>
<!-- paramForm.do 요청 후의 사용자 입력값을 출력 -->
<!-- memberVO 스프링이 자동으로 생성한 객체(변수명) -->
아이디 : ${memberVO.id } <br/> 
이름 : ${memberVO.name} <br/>
나이 : ${memberVO.age }<br/>

<hr/> 
${sessionScope.login} 로그인 중입니다.

</body>
</html>