<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%@ include file="../include/header.jsp" %>
	
    <script>
    $( function() {
        $( "#datepicker_a" ).datepicker();
        $( "#datepicker_a" ).datepicker( "option", "dateFormat", "yy-mm-dd");
    });
    </script>

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
			<!-- appForm -->
			<form action="registForm.board" class="appForm" method="post">
				<fieldset>
					<legend>상담문의 입력 양식</legend>
					<p class="info_pilsoo pilsoo_item">필수입력</p>
					<ul class="app_list">
                        <li class="clear">
                            <label for="email_lbl" class="tit_lbl pilsoo_item">등록일</label>
                            <div class="app_content email_area">
                                <input type="text" id="datepicker_a" placeholder="날짜를 선택하세요" name="regdate"></p>
                            </div>
						</li>
						
						<li class="clear">
                            <label for="email_lbl" class="tit_lbl pilsoo_item">작성자</label>
                            <div class="app_content email_area">
								<input type="hidden" />
                                <input type="text" placeholder="작성자" name=email value="${sessionScope.userDTO.email }" required readonly/>

                            </div>
						</li>
						<li class="clear">
							<label for="name_lbl" class="tit_lbl pilsoo_item">제목</label>
							<div class="app_content"><input type="text" class="w100p" id="name_lbl" placeholder="제목을 입력하세요"/ name="title" required></div>
						</li>


						<li class="clear">
							<label for="content_lbl" class="tit_lbl">문의내용</label>
							<div class="app_content"><textarea id="content_lbl" class="w100p" placeholder="간단한 상담 요청 사항을 남겨주시면 보다 상세한 상담이 가능합니다.
전화 상담 희망시 기재 부탁드립니다." name="content"></textarea></div>
						</li>
					</ul>
					<p class="btn_line">
						<!-- 
                        <a href="javascript:;" class="btn_baseColor">글작성</a>
                        <a href="javascript:;" class="btn_baseColor">목록</a>
						-->
						<input type="submit" class="btn_baseColor" value ="문의하기">
						<button type="button" class="btn_baseColor" >글목록</button>
                    </p>	
				</fieldset>
			</form>
			<!-- //appForm -->
			
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

	<%@include file="../include/footer.jsp"%>
	