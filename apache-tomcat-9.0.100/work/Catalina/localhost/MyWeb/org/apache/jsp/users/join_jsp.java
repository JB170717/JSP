/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-02-27 05:47:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1740383130000L));
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/course/JSP/apache-tomcat-9.0.100/wtpwebapps/MyWeb/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1740548976000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1740364022000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("	<title> 투어리스트인투어 </title>\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\r\n");
      out.write("	<meta charset=\"utf-8\" />\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/swiper.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/common.css\">\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/rollmain.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.easing.js\"></script>	\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/common.js\"></script>  \r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.smooth-scroll.min.js\"></script> \r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/swiper.min.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- 데이트피커 -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\r\n");
      out.write("	<script src=\"https://code.jquery.com/ui/1.13.2/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- wrap -->\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("	<header id=\"header\">\r\n");
      out.write("		<div class=\"header_area box_inner clear\">	\r\n");
      out.write("			<h1><a href=\"javascript:;\">Tourist in tour</a></h1>\r\n");
      out.write("			<p class=\"openMOgnb\"><a href=\"#\"><b class=\"hdd\">메뉴열기</b> <span></span><span></span><span></span></a></p>\r\n");
      out.write("			<!-- header_cont -->\r\n");
      out.write("			<div class=\"header_cont\">\r\n");
      out.write("				<ul class=\"util clear\">\r\n");
      out.write("					\r\n");
      out.write("					");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/users/join.users\">회원가입</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>	\r\n");
      out.write("				<nav>\r\n");
      out.write("				<ul class=\"gnb clear\">\r\n");
      out.write("					<li><a href=\"javascript:;\" class=\"openAll1\">여행정보</a>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"gnb_depth gnb_depth2_1\">\r\n");
      out.write("                            <ul class=\"submenu_list\">\r\n");
      out.write("                                <li><a href=\"javascript:;\">국내</a></li>\r\n");
      out.write("                                <li><a href=\"javascript:;\">해외</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"javascript:;\" class=\"openAll2\">고객센터</a>\r\n");
      out.write("				        <div class=\"gnb_depth gnb_depth2_2\">\r\n");
      out.write("                            <ul class=\"submenu_list\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/notice/list.board\">문의내역보기</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/notice/regist.board\">문의하기</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"javascript:;\" class=\"openAll3\">상품투어</a>\r\n");
      out.write("                        <div class=\"gnb_depth gnb_depth2_3\">\r\n");
      out.write("                            <ul class=\"submenu_list\">\r\n");
      out.write("                                <li><a href=\"javascript:;\">프로그램 소개</a></li>\r\n");
      out.write("                                <li><a href=\"javascript:;\">여행자료</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"javascript:;\" class=\"openAll4\">티켓/가이드</a>\r\n");
      out.write("                        <div class=\"gnb_depth gnb_depth2_4\">\r\n");
      out.write("                            <ul class=\"submenu_list\">\r\n");
      out.write("                                <li><a href=\"javascript:;\">항공</a></li>\r\n");
      out.write("                                <li><a href=\"javascript:;\">호텔</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("				<p class=\"closePop\"><a href=\"javascript:;\">닫기</a></p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //header_cont -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("	required - 태그가 필수값이 된다\r\n");
      out.write("	pattern - 정규표현식을 활용한 유효성검사\r\n");
      out.write("	\r\n");
      out.write("	checked - 체크박스의 값을 미리 체크함\r\n");
      out.write("	selected - 셀렉트태그의 값을 미리 선택함\r\n");
      out.write("	readonly - 인풋태그의 읽기만 허용\r\n");
      out.write("	disabled - 인풋태그의 사용을 금지		\r\n");
      out.write("	 -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"container\">\r\n");
      out.write("		<!-- location_area -->\r\n");
      out.write("		<div class=\"location_area member\">\r\n");
      out.write("			<div class=\"box_inner\">\r\n");
      out.write("				<h2 class=\"tit_page\">TOURIST <span class=\"in\">in</span> TOUR</h2>\r\n");
      out.write("				<p class=\"location\">MEMBER <span class=\"path\">/</span> 회원가입</p>\r\n");
      out.write("				<ul class=\"page_menu clear\">\r\n");
      out.write("					<li><a href=\"javascript:;\" class=\"on\">회원가입</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>	\r\n");
      out.write("		<!-- //location_area -->\r\n");
      out.write("\r\n");
      out.write("		<!-- bodytext_area -->\r\n");
      out.write("		<div class=\"bodytext_area box_inner\">\r\n");
      out.write("			<!-- appForm -->\r\n");
      out.write("			<form action=\"joinForm.users\" class=\"appForm\" method=\"post\">\r\n");
      out.write("				<fieldset>\r\n");
      out.write("					<legend>상담문의 입력 양식</legend>\r\n");
      out.write("					<p class=\"info_pilsoo pilsoo_item\">필수입력</p>\r\n");
      out.write("					<ul class=\"app_list\">\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("                            <label for=\"email_lbl\" class=\"tit_lbl pilsoo_item\">이메일</label>\r\n");
      out.write("                            <div class=\"app_content email_area\">\r\n");
      out.write("                                <input type=\"text\" class=\"w160\" id=\"email_lbl\" title=\"이메일 주소\" name=\"email_prev\" required/>\r\n");
      out.write("                                <span class=\"ico_space\">@</span>\r\n");
      out.write("                                <input type=\"text\" class=\"w160\" id=\"email_next\" title=\"이메일 제공업체 입력\" name=\"email_next\" required/>										\r\n");
      out.write("                                <div class=\"select_common\">\r\n");
      out.write("                                    <select title=\"이메일 제공업체 목록\" id=\"select_email\">\r\n");
      out.write("                                        <option value=\"\">직접입력</option>\r\n");
      out.write("                                        <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("                                        <option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>	\r\n");
      out.write("                                <span class=\"ico_space\" style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>									\r\n");
      out.write("                            </div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("							<label for=\"name_lbl\" class=\"tit_lbl pilsoo_item\">작성자명</label>\r\n");
      out.write("							<div class=\"app_content\"><input type=\"text\" class=\"w100p\" id=\"name_lbl\" placeholder=\"이름을 입력해주세요\" name=\"name\" required/></div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("							<label for=\"pwd_lbl\" class=\"tit_lbl pilsoo_item\">비밀번호</label>\r\n");
      out.write("							<div class=\"app_content\"><input type=\"password\" class=\"w100p\" id=\"pwd_lbl\" placeholder=\"비밀번호를 입력해주세요\" name=\"pw\" required/></div>\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<!-- <li class=\"clear\">\r\n");
      out.write("							<label for=\"pwd2_lbl\" class=\"tit_lbl pilsoo_item\">비밀번호 확인</label>\r\n");
      out.write("							<div class=\"app_content\"><input type=\"password\" class=\"w100p\" id=\"pwd2_lbl\" placeholder=\"비밀번호를 다시 한번 입력해주세요\" /></div>\r\n");
      out.write("						</li> -->\r\n");
      out.write("						\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("							<label for=\"phone_lbl\" class=\"tit_lbl pilsoo_item\">연락처</label>\r\n");
      out.write("							<div class=\"app_content\"><input type=\"tel\" class=\"w100p\" id=\"phone_lbl\" placeholder=\"휴대폰 번호를 입력하세요\" name=\"phone\" pattern=\"[0-9]{3}-[0-9]{4}-[0-9]{4}\"/></div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("							<span class=\"tit_lbl\">성별</span>\r\n");
      out.write("							<div class=\"app_content radio_area\">\r\n");
      out.write("								<input type=\"radio\" class=\"css-radio\" id=\"mmm_lbl\" name=\"gender\" value=\"M\" checked><label for=\"mmm_lbl\">남</label>\r\n");
      out.write("								<input type=\"radio\" class=\"css-radio\" id=\"www_lbl\" name=\"gender\" value=\"F\"><label for=\"www_lbl\">여</label>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("                            <span class=\"tit_lbl\">SNS 수신동의</span>\r\n");
      out.write("							<div class=\"app_content checkbox_area\">\r\n");
      out.write("								<input type=\"checkbox\" class=\"css-checkbox\" id=\"agree_lbl\" name=\"sns_yn\" value=\"Y\" checked><label for=\"agree_lbl\">동의함</label>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("<!-- 						\r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("                            <span class=\"tit_lbl\">이메일 수신동의</span>\r\n");
      out.write("							<div class=\"app_content checkbox_area\">\r\n");
      out.write("								<input type=\"checkbox\" class=\"css-checkbox\" id=\"agree_lb2\" name=\"agree2\"><label for=\"agree_lb2\">동의함</label>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						 -->\r\n");
      out.write("<!-- 						 \r\n");
      out.write("						<li class=\"clear\">\r\n");
      out.write("							<label for=\"content_lbl\" class=\"tit_lbl\">문의내용</label>\r\n");
      out.write("							<div class=\"app_content\"><textarea id=\"content_lbl\" class=\"w100p\" placeholder=\"간단한 상담 요청 사항을 남겨주시면 보다 상세한 상담이 가능합니다.\r\n");
      out.write("전화 상담 희망시 기재 부탁드립니다.\"></textarea></div>\r\n");
      out.write("						</li>\r\n");
      out.write("						 -->\r\n");
      out.write("					</ul>\r\n");
      out.write("					<p class=\"btn_line\"><input type=\"submit\" class=\"btn_baseColor\" value=\"등록\"></p>	\r\n");
      out.write("				</fieldset>\r\n");
      out.write("			</form>\r\n");
      out.write("			<!-- //appForm -->\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- //bodytext_area -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //container -->\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"foot_area box_inner\">\r\n");
      out.write("			<ul class=\"foot_list clear\">\r\n");
      out.write("				<li><a href=\"javascript:;\">이용약관</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\">개인정보취급방침</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<h2>투어리스트인투어</h2>\r\n");
      out.write("            <p class=\"addr\">서울특별시 종로구 혜화동 9길 청운빌딩 5층 <span class=\"gubun\">/</span>        \r\n");
      out.write("				<span class=\"br_line\">대표전화 <span class=\"space0\">02-1234-5678</span> <span class=\"gubun\">/</span>        \r\n");
      out.write("					<span class=\"br_line\">E-mail : <span class=\"space0\"> titour@touristintour.com</span></span>\r\n");
      out.write("				</span>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p class=\"copy box_inner\">Copyright(c) TouristInTour all right reserved</p>\r\n");
      out.write("			<ul class=\"snslink clear\">\r\n");
      out.write("				<li><a href=\"javascript:;\">blog</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\">facebook</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\">instargram</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 사이드 메뉴 -->\r\n");
      out.write("<h2 class=\"hdd\">빠른 링크 : 전화 문의,카카오톡,오시는 길,꼭대기로</h2>\r\n");
      out.write("<div class=\"quick_area\">\r\n");
      out.write("	<ul class=\"quick_list\">\r\n");
      out.write("		<li><a href=\"tel:010-7184-4403\"><h3>전화 문의</h3><p>010-1234-5678</p></a></li>\r\n");
      out.write("		<li><a href=\"javascript:;\"><h3>카카오톡 <em>상담</em></h3><p>1:1상담</p></a></li>\r\n");
      out.write("		<li><a href=\"javascript:;\"><h3 class=\"to_contact\">오시는 길</h3></a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<p class=\"to_top\"><a href=\"#layout0\" class=\"s_point\">TOP</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		var emailNext = document.getElementById(\"email_next\");\r\n");
      out.write("		var selectEmail = document.getElementById(\"select_email\");\r\n");
      out.write("		selectEmail.addEventListener('change' ,function() {\r\n");
      out.write("			emailNext.value = selectEmail.value;\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("						");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("						");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("					");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /include/header.jsp(41,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userDTO == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("							<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/users/login.users\">로그인</a></li>						\r\n");
        out.write("						");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("							<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/users/mypage.users\">마이페이지</a></li>	\r\n");
        out.write("						");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
