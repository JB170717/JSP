<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id =request.getParameter("id");
	String pw =request.getParameter("pw");
	
	//id=qwer이고 pw=1234면 "로그인성공"
	if(id.equals("qwer")&&pw.endsWith("1234")){
		
		//현재 로그인이 되어 있는 사람의 정보
		session.setAttribute("user_id", id);
		
		response.sendRedirect("login_welcome.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>