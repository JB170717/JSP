/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-02-27 04:36:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<title> 로그인 | 투어리스트인투어 </title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/common.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/common.js\"></script>  \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.smooth-scroll.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("// 현재 페이지에만 적용\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	$('.switch').click(function(){			// 로그인 유지 작동\r\n");
      out.write("		$(this).toggleClass(\"switchOn\");\r\n");
      out.write("	});\r\n");
      out.write("	$('.quick_area').hide();				// 우측 빠른 실행 메뉴 숨김 \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- wrap -->\r\n");
      out.write("<div id=\"wrap\" class=\"s_point\">\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"container\" id=\"layout0\">\r\n");
      out.write("		\r\n");
      out.write("		<!-- bodytext_area -->\r\n");
      out.write("		<div class=\"bodytext_area box_inner\">\r\n");
      out.write("			<!-- login-wrap -->\r\n");
      out.write("			<div class=\"login_wrap\">\r\n");
      out.write("				<h1 class=\"loginTit\"><a href=\"#\"><img src=\"../img/tit_login.png\" alt=\"TOURIST IN TOUR\" /></a></h1>\r\n");
      out.write("				\r\n");
      out.write("				<form action=\"loginForm.users\" method=\"post\">\r\n");
      out.write("				<ul class=\"login_list\">\r\n");
      out.write("					\r\n");
      out.write("					<li style=\"padding: 0;\"><input type=\"text\" placeholder=\"아이디\" style=\"width:100%;\" name=\"id\"></li>\r\n");
      out.write("					<li style=\"padding: 0;\"><input type=\"password\" placeholder=\"비밀번호\" style=\"width:100%;\" name=\"pw\"></li>\r\n");
      out.write("					<li style=\"padding: 0; display: flex; justify-content: center;\" >\r\n");
      out.write("						<a href=\"join.users\" style=\"color:#000; padding: 0 10px;\">회원가입</a>\r\n");
      out.write("						<input type=\"submit\" style=\"border:none;background-color: transparent;color:#000\" value=\"로그인\">\r\n");
      out.write("						<!-- <a href=\"#\" style=\"color:#000;  padding: 0 10px;\">로그인</a> -->\r\n");
      out.write("					\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("					</li>					\r\n");
      out.write("				</ul>\r\n");
      out.write("				</form>\r\n");
      out.write("				\r\n");
      out.write("				<ul class=\"login_list\">\r\n");
      out.write("\r\n");
      out.write("					<li class=\"kakao\"><a href=\"javascript:;\"><strong>카카오톡</strong> 로그인</a></li>\r\n");
      out.write("					<li class=\"naver\"><a href=\"javascript:;\"><strong>네이버</strong> 로그인</a></li>\r\n");
      out.write("					<li class=\"facebook\"><a href=\"javascript:;\"><strong>페이스북</strong> 로그인</a></li>\r\n");
      out.write("					<li class=\"cellphone\"><a href=\"javascript:;\"><strong>이메일 주소</strong> 로그인</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<div class=\"btnonoff_line\">\r\n");
      out.write("					<div class=\"switch\"></div>\r\n");
      out.write("					<p>\r\n");
      out.write("					    <a href=\"#\" class=\"btn_onoff\" onclick=\"return false;\">로그인 유지</a>\r\n");
      out.write("					    \r\n");
      out.write("					</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("        				\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //login-wrap -->\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- //bodytext_area -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //container -->\r\n");
      out.write("\r\n");
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
      out.write("<!-- //wrap -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
