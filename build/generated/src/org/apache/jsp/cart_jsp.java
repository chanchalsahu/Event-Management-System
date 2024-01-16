package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String name="";
    String price="";
    String image="";
    
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Shopping Cart</title>\n");
      out.write("<style>\n");
      out.write("  .cart-container {\n");
      out.write("    width: 80%;\n");
      out.write("    margin: auto;\n");
      out.write("    background-color: #f4f4f4;\n");
      out.write("    padding: 20px;\n");
      out.write("  }\n");
      out.write("  .cart-header, .cart-item, .cart-total {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("    padding: 70px;\n");
      out.write("    background-color: #e0e0e0;\n");
      out.write("  }\n");
      out.write("  .cart-item {\n");
      out.write("    background-color: #ffffff;\n");
      out.write("  }\n");
      out.write("  .cart-item img {\n");
      out.write("    width: 50px; /* Placeholder for product image */\n");
      out.write("  }\n");
      out.write("  .cart-item button {\n");
      out.write("    background-color: #ff0000;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("  .checkout-btn {\n");
      out.write("    background-color: #008000;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 20px;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--<script>\n");
      out.write("    function showPrice() \n");
      out.write("{\n");
      out.write(" \n");
      out.write("    var qt = document.getElementById(\"qty\");\n");
      out.write("              var shPri = document.getElementById(\"showprice\");\n");
      out.write("              shPri.innerHTML = \"Rs. \"+((qt.value)*(100));\n");
      out.write("   \n");
      out.write("}\n");
      out.write("          \n");
      out.write("          </script>-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

        name=request.getParameter("name");
        price=request.getParameter("price");
        image= request.getParameter("image");   
    
      out.write("\n");
      out.write("  \n");
      out.write("<div class=\"cart-container\">\n");
      out.write("    ");
  String myname=(String) session.getAttribute("name_key"); 
      out.write("\n");
      out.write("            <h1>WELCOME:");
      out.print( myname );
      out.write("</h1>\n");
      out.write("  <!-- Cart Header -->\n");
      out.write("  <div class=\"cart-header\">\n");
      out.write("    <div>Image</div>\n");
      out.write("    <div>Name</div>\n");
      out.write("    <div>Price</div>\n");
      out.write("    <div>Quantity</div>\n");
      out.write("    <div>Total Price</div>\n");
      out.write("    <div>Action</div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Cart Item -->\n");
      out.write("  <div class=\"cart-item\">\n");
      out.write("      \n");
      out.write("    <img src=\"images/shoes.jpg\" alt=\"Product Image\"  >\n");
      out.write("   <strong>");
      out.print( 
           name
    );
      out.write("\n");
      out.write("    ");
      out.print( 
           price
    );
      out.write("</strong>\n");
      out.write("    <div>\n");
      out.write("      <div class=\"quntity\">\n");
      out.write("          <input type=\"number\" id=\"qty\"    name=\"qty\" onchange=\"showPrice()\" >\n");
      out.write("        <!-- Add more options as needed -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div  id=\"showprice\" onchange=\"showPrice()\">  <p  >Rs/-</p> </div>\n");
      out.write("    <button type=\"reset\">Remove</button>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Cart Total -->\n");
      out.write("  <div class=\"cart-total\">\n");
      out.write("    <div>Grand Total</div>\n");
      out.write("<div > Rs/- </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Checkout Button -->\n");
      out.write("  <button class=\"checkout-btn\">  <a href=\"checkout.html\"> Proceed to CheckOut</a></button>\n");
      out.write("</div>\n");
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
