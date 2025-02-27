<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
	<div id="container">
		<!-- location_area -->
		<div class="location_area customer">
			<div class="box_inner">
				<h2 class="tit_page">TOURIST <span class="in">in</span> TOUR</h2>
				<p class="location">고객센터 <span class="path">/</span> 공지사항</p>
				<ul class="page_menu clear">
					<li><a href="#" class="on">공지사항</a></li>
					<li><a href="#">문의하기</a></li>
				</ul>
			</div>
		</div>	
		<!-- //location_area -->

		<!-- bodytext_area -->
		<div class="bodytext_area box_inner">			
			<ul class="bbsview_list">
				<li class="bbs_title">${dto.title }</li>
				<li class="bbs_hit">작성일 : <span>${dto.regdate }</span></li>
				<li class="bbs_date">작성자 : <span>${dto.email}</span></li>
				<li class="bbs_content">
					<div class="editer_content">
					   ${dto.content }
                    </div>
				</li>
			</ul>
			<p class="btn_line txt_right">
				<c:if test="${sessionScope.userDTO.email == dto.email }">
					<a href="delete.board?bno=${dto.bno }&email=${dto.email}" class="btn_bbs">글삭제</a>
					<a href="modify.board?bno=${dto.bno }&email=${dto.email}" class="btn_bbs">글수정</a>
				</c:if>
				
				<a href="list.board" class="btn_bbs">목록</a>
			</p>
			<ul class="near_list mt20">
				<li><h4 class="prev">이전글</h4><a href="getContent.board?bno=${dto.prevNo ==0 ? dto.bno : dto.prevNo  }">${dto.prevTitle }</a></li>		
				<li><h4 class="next">다음글</h4><a href="getContent.board?bno=${dto.nextNo ==0 ? dto.bno :dto.nextNo}">${dto.nextTitle }</a></li>
			</ul>
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

	<%@include file="../include/footer.jsp" %>
