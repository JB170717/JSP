<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="jstl_if.jsp" method="post">
		이름:<input type="text" name="name"><br>
		나이:<input type="number" name="age"><br>
		<input type="submit" value="확인"><br>
	</form>
	
	<h3>choose문장 확인</h3>	
	<form action="jstl_choose.jsp" method="post">
		이름:<input type="text" name="name"><br>
		나이:<input type="number" name="age"><br>
		<input type="submit" value="확인"><br>
	</form>	

</body>
</html>