<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1.첫번째 페이지에서 넘어온 id,pw를 받습니다.
	2. id, pw가 동일하면 로그인 성이라고 간주하고,
	quiz01_welcome 페이지로 리다이랙트
	3.둘중 하나라도 틀렸으면 quiz01_fail페이지로 리다이랙트
	*/
	request.setCharacterEncoding("utf-8");
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String myid="aaa123";
	String mypw="1234";	
	
	if(!id.equals(myid)){
		response.sendRedirect("quiz01_fail.jsp");
	}else{
		if(pw.equals(mypw)){
			response.sendRedirect("quiz01_welcome.jsp");
		}else{
			response.sendRedirect("quiz01_fail.jsp");
		}
	}

%>    
    
