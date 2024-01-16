package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VenderHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                width: 80%;\n");
      out.write("                max-width: 600px;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-text {\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: white;\n");
      out.write("                color: #333;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover {\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .buttons {\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: repeat(2, 1fr);\n");
      out.write("                grid-gap: 10px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header-text\">Welcome</div>\n");
      out.write("                ");
  String myname=(String) session.getAttribute("name_key"); 
      out.write("\n");
      out.write("            <h1>WELCOME:");
      out.print( myname );
      out.write("</h1>\n");
      out.write("                \n");
      out.write("                <div class=\"header-text\">Vendor</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buttons\">\n");
      out.write("                <button class=\"button\"> <a href=\"additem.html\">Your Item</a></button>\n");
      out.write("                <button class=\"button\" >\n");
      out.write("                    <a href=\"additem.html\">Add New Item</a></button>\n");
      out.write("                <button class=\"button\">   <a href=\"Transection.html\">Transaction</a></button>\n");
      out.write("                <button class=\"button\"><a href=\"index.html\">LogOut</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
