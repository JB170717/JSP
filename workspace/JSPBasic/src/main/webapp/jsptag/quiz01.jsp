<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="javax.el.ListELResolver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<String> list = Arrays.asList("a","b","c","d");
	%>

	<h3>구구단 3단을 out.println으로 세로 출력</h3>

	<% 
		for(int i=1;i<10;i++){ 
			out.println("3 x "+i+"="+3*i+"<br>");
		}
	%>
	<h3>구구단 2~9단 까지 표현식을 세로 출력</h3>
	
	<% for(int i=2;i<10;i++){ %>
		<hr>
		<% for(int j=1; j<10;j++){ %>
			<b><%=i%>x<%=j%>=<%=i*j %></b><br>
		<% }%>
	<%}%>
	
	<h3>select태그에 option태그를 반복문으로 생성</h3>

	<select name="aa">
		<%for(String s:list){%>
			<option><%=s%></option>
		<% }%>
	</select>
	
	<h3>tr을 반복으로 10회 출력</h3>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>	
		
		<%for(int i=1;i<=10;i++){ %>
			<tr>
				<th><%=i %></th>
				<th>홍길동</th>
				<th>서울시</th>
			</tr>
		<%}%>		
	</table>

</body>
</html>