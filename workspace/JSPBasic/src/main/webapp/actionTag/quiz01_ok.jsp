<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	앞에서 넘어온 국어, 수학점수의 평균을 구합니다.
	평균이 60점 이상이면 success페이지로 이동해서 
	
	"name님의 평균 xx점 합격입니다" 출력합니다.
	
	평균이 60미만이면 fail페이지로 이동해서
	"name님의 평균 xx점 불합격입니다" 출력합니다.
	조건- 세션을 사용하지 않음
	*/
	request.setCharacterEncoding("utf-8");
	
	int kor=Integer.parseInt(request.getParameter("kor"));
	int math=Integer.parseInt(request.getParameter("math"));
	String name = request.getParameter("name");
	
	double avg=(kor+math)/2;
	
	request.setAttribute("avg", avg);
	request.setAttribute("name", name);
	
	if(avg>=60){
		request.getRequestDispatcher("quiz01_success.jsp").forward(request, response);
	}else{
		request.getRequestDispatcher("quiz01.fail.jsp").forward(request, response);
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