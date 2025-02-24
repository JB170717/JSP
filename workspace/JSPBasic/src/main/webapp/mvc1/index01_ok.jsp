<%@page import="com.hr.model.DepartmentDTO"%>
<%@page import="com.hr.model.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//여기는 vc역할을 하고있음 view(화면처리)와 controller역할들 둘다 하고있다
	//controller역할...
	String departmentID = request.getParameter("departmentID");	
	//model로 연결 
	
	//DAO객체 생성
	DepartmentDAO dao =DepartmentDAO.getInstance();
	//부서정보
	DepartmentDTO dto = dao.getDepartmentInfo(departmentID);

	//dto를 request에 저장함
	request.setAttribute("dto", dto);
	
	//만약에 dto안에 값이 null이다?
	//dto에 값이 있으면, 부서정보페이지로 이동, 없으면 다시 원본페이지로 이동	
	
	if(dto.getDepartmentName()==null){
	//view역할을 하게 만들어봄	
%>		
	<script>
		alert("부서정보가 없습니다"); //알림창하나띄우고
		history.back(); //뒤로가기
	</script>	
<% 	}else{
		request.getRequestDispatcher("index01_result.jsp").forward(request, response);
	}
	
	
		
%>


