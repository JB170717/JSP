<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String date=request.getParameter("date"); //input태그의 name값 //클라이언트에서 보낸 정보들
	String msg =request.getParameter("msg");
	//checkbox는 values로 받습니다.
	String[] agree = request.getParameterValues("agree"); //여러값을 받을떄..


%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	날짜:<%=date %> <br>
	메세지:<%=msg %> <br>
	동의항목:<%=Arrays.toString(agree) %> <br>
</body>
</html>