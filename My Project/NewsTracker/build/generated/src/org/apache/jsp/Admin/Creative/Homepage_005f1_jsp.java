package org.apache.jsp.Admin.Creative;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Homepage_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      database.ConnectionClass obj = null;
      synchronized (_jspx_page_context) {
        obj = (database.ConnectionClass) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new database.ConnectionClass();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\t<html lang=\"zxx\" class=\"no-js\">\n");
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
      out.write("\t\t<title>Main Page</title>\n");
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
      out.write("                                                      <img src=\"img/elements/img1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t\t\t\t  </button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t  <div class=\"collapse navbar-collapse justify-content-end align-items-center\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t\t\t    <ul class=\"navbar-nav\">\n");
      out.write("                                                        <li><a href=\"Homepage.jsp\">HomePage</a></li>\n");
      out.write("                                                            <li><a href=\"advertise.jsp\">Advertisement</a></li>\n");
      out.write("                                                             <li><a href=\"Place.jsp\">Place</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Item.jsp\">Item</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"Plan.jsp\">Plan</a></li>\n");
      out.write("                                                                <li><a href=\"language.jsp\">Language</a></li>\n");
      out.write("                                                                <li><a href=\"Product.jsp\">Product</a></li>\n");
      out.write("                                                                <li><a href=\"Productplan.jsp\">ProductPlan</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t      <a class=\"dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t        Settings\n");
      out.write("\t\t\t\t\t\t\t      </a>\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"dropdown-menu\">\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"ChangePass.jsp\">Change Password</a>\n");
      out.write("\t\t\t\t\t\t\t          <a class=\"dropdown-item\" href=v\"../../Guest/Creative/MainLogin.jsp\">LogOut</a>\n");
      out.write("\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t    </li>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t\t  </div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("                        \n");
      out.write("                        <section class=\"banner-area relative\" id=\"home\" data-parallax=\"scroll\" data-image-src=\"img/newspaper.jpg\">\n");
      out.write("\t\t\t\t<div class=\"overlay-bg overlay\"></div>\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row fullscreen  d-flex align-items-center justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-content col-lg-6 col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\t <br>\n");
      out.write("                                                                <span>NewsWay</span> <br>\n");
      out.write("\t\t\t\t\t\t\t\t <span>Tracker</span>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</h1>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End banner Area -->\t\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- start service Area-->\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("                        <footer class=\"footer-area section-gap\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row footer-bottom d-flex justify-content-between\">\n");
      out.write("\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            <p class=\"col-lg-8 col-sm-12 footer-text m-0 text-white\">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a></p>\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-12 footer-social\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t\t<!-- End footer Area -->\t\t\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t\t<script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/parallax.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/owl.carousel.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.DonutWidget.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\t\n");
      out.write("\t\t</body>\n");
      out.write("\t</html> ");
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
