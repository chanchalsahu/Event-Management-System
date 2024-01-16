package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  width: 80%;\n");
      out.write("  max-width: 600px;\n");
      out.write("  margin: 20px auto;\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  background-color: #007bff;\n");
      out.write("  color: white;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("  background-color: #0069d9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 20px;\n");
      out.write("  font-size: 24px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: white;\n");
      out.write("  background-color: #007bff;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form {\n");
      out.write("  padding: 20px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label {\n");
      out.write("  display: block;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-input {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-select {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  -webkit-appearance: none;\n");
      out.write("  -moz-appearance: none;\n");
      out.write("  appearance: none;\n");
      out.write("  background-image: url(\"data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='4' height='5' viewBox='0 0 4 5'%3E%3Cpath fill='%23333' d='M2 0L0 2h4zm0 5L0 3h4z'/%3E%3C/svg%3E\");\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-position: right 10px center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-actions {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: flex-end;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-actions button {\n");
      out.write("  margin-left: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
String myname=(String) session .getAttribute("name_key"); 
    
      out.write("\n");
      out.write("    \n");
      out.write("    <form action=\"AdminServlet\" method=\"post\">\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"buttons\">\n");
      out.write("   \n");
      out.write("    <button class=\"button\">BACK</button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"title\">Event Management System</div>\n");
      out.write("  <form1 class=\"form\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"form-label\" for=\"user-id\">User Id</label>\n");
      out.write("      <input class=\"form-input\" type=\"text\" id=\"user-id\" name=\"user-id\" placeholder=\"Enter your user id\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"form-label\" for=\"password\">Password</label>\n");
      out.write("      <input class=\"form-input\" type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\">\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"form-actions\">\n");
      out.write("      <button class=\"button\" type=\"reset\">Cancel</button>\n");
      out.write("      <button class=\"button\" type=\"submit\">Login</button>\n");
      out.write("    </div>\n");
      out.write("  </form1>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
