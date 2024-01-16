package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>.container {\n");
      out.write("        background-color: grey;\n");
      out.write("        width: 400px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        padding: 20px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .top-row {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .bottom-row {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        margin-top: 20px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .top-button {\n");
      out.write("        background-color: rgb(231, 231, 241);\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        box-shadow: 2px 2px 5px black;\n");
      out.write("        padding: 10px 30px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .bottom-button {\n");
      out.write("        background-color: darkblue;\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        box-shadow: 2px 2px 5px black;\n");
      out.write("        padding: 30px;\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("          ");
  String myname=(String) session.getAttribute("name_key"); 
      out.write("\n");
      out.write("            <h1>WELCOME:");
      out.print( myname );
      out.write("</h1>\n");
      out.write("        <div class=\"top-row\">\n");
      out.write("          <button class=\"top-button\"> <a href=\"index.html\">Home</a></button>\n");
      out.write("          <button class=\"top-button\"><a href=\"request.html\">Request Item</a></button>\n");
      out.write("          <button class=\"top-button\"> <a href=\"index.html\"> LogOut </a> </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom-row\">\n");
      out.write("          <button class=\"bottom-button\">Item 1</button>\n");
      out.write("          <button class=\"bottom-button\">Item 2</button>\n");
      out.write("          <button class=\"bottom-button\">Item 3</button>\n");
      out.write("          <button class=\"bottom-button\">Item 4</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("</html>");
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
