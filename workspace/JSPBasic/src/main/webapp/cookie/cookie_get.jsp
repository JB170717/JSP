<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키를 찾아쓰는 방법
	//쿠키는 매 요청마다 request에 담겨서 넘어옵니다.
	
	Cookie[] cookies=request.getCookies();
	//쿠키가 브라우저에 없으면 null이 됩니다.
	//그러므로 조건을 쓸떄 쿠키가 null이 아닌 조건에서 사용해야합니다.
	if(cookies != null){
		
		for(Cookie coo:cookies){
			
			String cooname=coo.getName();
			if(cooname.equals("user_id")){
				String cooValue = coo.getValue();
				out.println("user_id쿠키의 값:"+cooValue);
			}
		}
		
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