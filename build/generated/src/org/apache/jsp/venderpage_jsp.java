package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class venderpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a:hover {\n");
      out.write("                color: #f0f0f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a.active {\n");
      out.write("                font-weight: bold;\n");
      out.write("                background-color: #005cbf;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .vendor {\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 45%;\n");
      out.write("                margin: 2.5%;\n");
      out.write("                padding: 20px;\n");
      out.write("                border: 2px solid #90b01c;\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .vendor a {\n");
      out.write("                display: block;\n");
      out.write("                color: rgb(45, 25, 25);\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .vendor a:hover {\n");
      out.write("                color: #f0f0f0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a href=\"venderLogin.jsp\" class=\"active\">Home</a>\n");
      out.write("            <a href=\"vender.html\">Vendor</a>\n");
      out.write("            <a href=\"#\">Florist</a>\n");
      out.write("            <a href=\"venderLogin.jsp\">LogOut</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"vendor\">\n");
      out.write("            <h3>Vender 1</h3>\n");
      out.write("            <a href=\"#\">Contact Details</a>\n");
      out.write("            <button><a href=\"#\">Shop Item</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"vendor\">\n");
      out.write("            <h3>Vender 2</h3>\n");
      out.write("            <a href=\"#\">Contact Details</a>\n");
      out.write("            <button><a href=\"#\">Shop Item</a></button> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"vendor\">\n");
      out.write("            <h3>Vender 3</h3>\n");
      out.write("            <a href=\"#\">Contact Details</a>\n");
      out.write("            <button><a href=\"#\">Shop Item</a></button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"vendor\">\n");
      out.write("            <h3>Vender 4</h3>\n");
      out.write("            <a href=\"#\">Contact Details</a>\n");
      out.write("            <button>  <a href=\"#\">Shop Item</a></button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
