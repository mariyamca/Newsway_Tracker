package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/Creative/");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("css\n");
      out.write("elements.html\n");
      out.write("fonts\n");
      out.write("generic.html\n");
      out.write("img\n");
      out.write("index.html\n");
      out.write("index.jsp\n");
      out.write("js\n");
      out.write("scss\n");
      out.write("\n");
      out.write("<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Mobile Specific Meta -->\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<!-- Favicon-->\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"img/fav.png\">\n");
      out.write("\t\t<!-- Author Meta -->\n");
      out.write("\t\t<meta name=\"author\" content=\"CodePixar\">\n");
      out.write("\t\t<!-- Meta Description -->\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<!-- Meta Keyword -->\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t\t<!-- meta character set -->\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<!-- Site Title -->\n");
      out.write("\t\t<title>Creative Agency</title>\n");
      out.write("\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\tCSS\n");
      out.write("\t\t\t============================================= -->\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/jquery.DonutWidget.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Start Header Area -->\n");
      out.write("\t\t\t<header class=\"default-header\">\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-expand-lg  navbar-light\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t  <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("\t\t\t\t\t\t  \t<img src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t\t\t\t  </button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t  <div class=\"collapse navbar-collapse justify-content-end align-items-center\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t\t\t    <ul class=\"navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"HomePage.jsp\">HomePage</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"advertise.jsp\">Advertisement</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Item.jsp\">Item</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Place.jsp\">Place</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"Plan.jsp\">Plan</a></li>\n");
      out.write("                                                                <li><a href=\"language.jsp\">Language</a></li>\n");
      out.write("                                                                <li><a href=\"Product.jsp\">Product</a></li>\n");
      out.write("                                                                <li><a href=\"Productplan.jsp\">ProductPlan</a></li>\n");
      out.write("\t\t\t\t\t\t\t   <!-- Dropdown -->\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t      <a class=\"dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t        Settings\n");
      out.write("\t\t\t\t\t\t\t      </a>\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"dropdown-menu\">\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"ChangePass.jsp\">Generic</a>\n");
      out.write("\t\t\t\t\t\t\t       \n");
      out.write("\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t    </li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t\t  </div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        </html>\n");
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
