<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한국어패치
	request.setCharacterEncoding("utf-8");
	
	//파라미터(입력데이터) 쭉받아준다
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String birth=request.getParameter("birth");
	String[] inter=request.getParameterValues("inter");
	String major=request.getParameter("major");
	String region=request.getParameter("region");
	String hello=request.getParameter("hello");


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	입력한 아이디: <%=id %><br>
	입력한 비밀번호: <%=pw %><br>
	생일: <%=birth %><br>
	선택한 관심사: <%=Arrays.toString(inter) %><br>
	선택한 전공: <%=major %><br>
	선택한 지역: <%=region %><br>
	자기소개: <%=hello %><br>

</body>
</html>