/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-22 09:36:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class temp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>anyMate</title>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  background-color: #f4f4f4;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar {\n");
      out.write("  width: 200px;\n");
      out.write("  background-color: #007bff;\n");
      out.write("  color: white;\n");
      out.write("  padding: 20px;\n");
      out.write("  height: 100vh;\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  z-index: 1; /* Add this to ensure sidebar is on top */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a {\n");
      out.write("  display: block;\n");
      out.write("  padding: 10px 15px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: white;\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a:hover {\n");
      out.write("  background-color: #0062cc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("  margin-left: 220px; /* Add this to create space for sidebar */\n");
      out.write("  padding: 20px;\n");
      out.write("  height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content h1 {\n");
      out.write("  margin-top: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- Include jQuery -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"sidebar\">\n");
      out.write("    <a href=\"admin?command=view_transaction\" onclick=\"showContent('dashboard')\">\n");
      out.write("      <i class=\"fas fa-home\"></i> Dashboard\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#\" onclick=\"showContent('message')\">\n");
      out.write("      <i class=\"fas fa-comments\"></i> Message\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#\" onclick=\"showContent('users')\">\n");
      out.write("      <i class=\"fas fa-users\"></i> Users\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#\" onclick=\"showContent('rewards')\">\n");
      out.write("      <i class=\"fas fa-gift\"></i> Rewards\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#\" onclick=\"showContent('reports')\">\n");
      out.write("      <i class=\"fas fa-chart-pie\"></i> Reports\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#\" onclick=\"showContent('settings')\">\n");
      out.write("      <i class=\"fas fa-cog\"></i> Settings\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <h1>anyMate</h1>\n");
      out.write("    <div id=\"content-container\"></div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    function showContent(content) {\n");
      out.write("      let contentContainer = document.getElementById(\"content-container\");\n");
      out.write("      contentContainer.innerHTML = \"\";\n");
      out.write("\n");
      out.write("      let url = \"\";\n");
      out.write("\n");
      out.write("      if (content === \"dashboard\") {\n");
      out.write("    	  url = \"viewTransactions.jsp\";\n");
      out.write("      } else if (content === \"message\") {\n");
      out.write("        url = \"message.jsp\";\n");
      out.write("      } else if (content === \"users\") {\n");
      out.write("        url = \"users.jsp\";\n");
      out.write("      } else if (content === \"rewards\") {\n");
      out.write("        url = \"rewards.jsp\";\n");
      out.write("      } else if (content === \"reports\") {\n");
      out.write("        url = \"reports.jsp\";\n");
      out.write("      } else if (content === \"settings\") {\n");
      out.write("        url = \"settings.jsp\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (url) {\n");
      out.write("        $.ajax({\n");
      out.write("          url: url,\n");
      out.write("          method: 'GET',\n");
      out.write("          success: function(data) {\n");
      out.write("            contentContainer.innerHTML = data;\n");
      out.write("          },\n");
      out.write("          error: function() {\n");
      out.write("            contentContainer.innerHTML = \"<h2>Error loading content</h2>\";\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
