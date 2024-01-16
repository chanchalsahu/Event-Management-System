package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  background-color: lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write(".topnav h1{float: left;\n");
      out.write("  color: white;\n");
      out.write("  text-align: right;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav button {\n");
      out.write("  float: left;\n");
      out.write("  color: rgb(43, 7, 106);\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav button:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".products {\n");
      out.write("  margin: 20px;\n");
      out.write("  padding: 10px;\n");
      out.write("  background-color: blue;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product {\n");
      out.write("  float: left;\n");
      out.write("  width: 20%;\n");
      out.write("  padding: 10px;\n");
      out.write("  margin: 10px;\n");
      out.write("  background-color: lightblue;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-img-top { float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  padding: 10px;\n");
      out.write("  margin: 10px;\n");
      out.write("  background-color: lightblue;\n");
      out.write("  border-radius: 10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".product p {\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product button {\n");
      out.write("  background-color: green;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product button:hover {\n");
      out.write("  background-color: darkgreen;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  ");
  String myname=(String) session.getAttribute("name_key"); 
      out.write("\n");
      out.write("        \n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <button><a href=\"index.html\" style=\"text-decoration:none\" >Home</a></button>\n");
      out.write("   \n");
      out.write("    <button><a href=\"Userlogin.html\" style=\"text-decoration:none\" >LogOut</a></button>\n");
      out.write("  <h1>WELCOME:");
      out.print( myname );
      out.write("</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"cart.jsp\" method=\"post\"></form>\n");
      out.write("<div class=\"product\">\n");
      out.write("    <img   class=\"product-img-top\" src=\"images/shoes.jpg\" alt=\"image\"  id=\"image\" >\n");
      out.write("  <br><p id=\"name\">Shoes</p>\n");
      out.write("    <br><p   id=\"price\">199</p>\n");
      out.write("  <button type=\"submit\" >Add to Cart</button>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<!--\n");
      out.write("<div class=\"product\">\n");
      out.write("<img   class=\"product-img-top\" src=\"images/shoes2.jpg\" alt=\"image\" name=\"image2\"  id=\"image2\">\n");
      out.write("  <br><p  name=\"name\"  id=\"name\">Shoes</p>\n");
      out.write("    <br><p  name=\"price\" id=\" price\">Price: RS/249</p>\n");
      out.write("  <button id=\"2\" >Add to Cart</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"product\">\n");
      out.write(" <img   class=\"product-img-top\" src=\"images/shoes3.jpg\" alt=\"image\"   name=\"image3\" id=\"image3\">\n");
      out.write("  <br><p name=\"price\" id=\"price\">Shoes</p>\n");
      out.write("    <p id=\"price\">Price: RS/299</p>\n");
      out.write("  <button  id=\"3\"  >Add to Cart</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"product\">\n");
      out.write(" <img   class=\"product-img-top\" src=\"images/shoes2.jpg\" alt=\"image\"  name=\"image4\" id=\"image4\">\n");
      out.write("  <br><p id=\"name\" name=\"name\">Shoes</p>\n");
      out.write("    <p  name=\"price\" id=\"price\">Price: RS/199</p>\n");
      out.write("    <button id=\"4\">Add to Cart</button>-->\n");
      out.write("<!--</div>-->\n");
      out.write("</form>\n");
      out.write("\n");
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
