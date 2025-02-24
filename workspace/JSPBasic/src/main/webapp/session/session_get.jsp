<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션에 저장된 값 확인
	String my_id = (String)session.getAttribute("my_id"); //세션의 찾을 이름 //object니깐 class캐스팅 해줘야대
	String my_name = (String)session.getAttribute("my_name");
	
	//시간도 확인할수 있다.
	int time = session.getMaxInactiveInterval(); //시간값확인하기
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%=my_id %><br>
	<%=my_name %><br>
	
	세션의 유효시간: <%=time %><br>
	
	<a href="session_remove.jsp">세션삭제하기</a>
	
</body>
</html>