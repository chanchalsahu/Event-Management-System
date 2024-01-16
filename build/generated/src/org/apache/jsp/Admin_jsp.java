package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Admin Panel</title>\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f4f4f4;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 20px;\n");
      out.write("  }\n");
      out.write("  .navbar, .welcome, .buttons {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("  .navbar button, .buttons button {\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    margin: 5px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("  .navbar button {\n");
      out.write("    border: 1px solid #333;\n");
      out.write("  }\n");
      out.write("  .welcome {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("  }\n");
      out.write("  .buttons button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <button>   <a href=\"index.html\" style=\"text-decoration: none \">Home</a></button>\n");
      out.write("    <button> <a href=\"AdminLog.jsp\" style=\"text-decoration: none \"> LogOut</a></button>\n");
      out.write("</div>\n");
      out.write("<div class=\"welcome\">\n");
      out.write(" ");
  String myname=(String) session.getAttribute("name_key"); 
      out.write("\n");
      out.write("            <h2>WELCOME:");
      out.print( myname );
      out.write("</h2>\n");
      out.write("</div>\n");
      out.write("<div class=\"buttons\">\n");
      out.write("  <button>     <a href=\"Maintain User.jsp\" style=\"text-decoration: none \">Maintain User</button>\n");
      out.write("  <button>     <a href=\"Maintain Vender.jsp\" style=\"text-decoration: none \">Maintain Vendor</button>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
