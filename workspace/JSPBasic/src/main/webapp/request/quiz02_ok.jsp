<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8"); //한글처리

	String name=request.getParameter("name");	
	double kg=Double.parseDouble(request.getParameter("kg"));
	double cm=Double.parseDouble(request.getParameter("cm"));	
	double bmi = kg/((cm/100)*(cm/100));
	
	String BMI="";
	if(bmi>=25){
		BMI="과체중";
	}else if(bmi<=18){
		BMI="저체중";
	}else{
		BMI="정상";
	}

%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	이름 : <%=name %><br>
	키 : <%=kg %><br>
	몸무게 : <%=cm %><br>
	BMI지수:<%=bmi %><br>
	<%=BMI %><br>
	
	
	
	
</body>
</html>