package org.apache.jsp.Admin.Creative;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class viewcomplt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/Creative/Header.jsp");
    _jspx_dependants.add("/Admin/Creative/Footer.jsp");
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("                                                             <li><a href=\"TrackPaperboy.jsp\">Track</a></li>\n");
      out.write("                                                                \n");
      out.write("                                                                 <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t      <a class=\"dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t        VIEW\n");
      out.write("\t\t\t\t\t\t\t      </a>\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"dropdown-menu\">\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"Booking.jsp\">Booking</a>\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"Payment.jsp\">Payment</a>\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"ViewPaperboy.jsp\">PaperBoy</a>\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"AcceptedPaperboy.jsp\">Assign</a>\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"Route.jsp\">Route</a>\n");
      out.write("\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t    </li>\t\n");
      out.write("                                                                \n");
      out.write("                                                                <li class=\"dropdown\">\n");
      out.write("                                                                    <a class=\"dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                                                                     Product   \n");
      out.write("                                                                    </a>\n");
      out.write("                                                                    <div class=\"dropdown-menu\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"Item.jsp\">Item</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"Plan.jsp\">Plan</a>\n");
      out.write("                                                                         <a class=\"dropdown-item\" href=\"language.jsp\">Language</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"Product.jsp\">Product</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"Productplan.jsp\">Product Plan</a>\n");
      out.write("                                                                   </div></li>\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t      <a class=\"dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t        Settings\n");
      out.write("\t\t\t\t\t\t\t      </a>\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"dropdown-menu\">\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"ChangePass.jsp\">change password</a>\n");
      out.write("                                                                  <a class=\"dropdown-item\" href=\"../../Guest/Creative/MainLogin.jsp\">Logout</a>\n");
      out.write("\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t    </li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t\t  </div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>");
      out.write('\n');
      out.write('\n');
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View paperboy</title>\n");
      out.write("        <style>\n");
      out.write("input[type=text],select {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px 25px;\n");
      out.write("    margin: 8px 15px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    display: inline-block;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit],input[type=reset] {\n");
      out.write("    width: 30%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 50px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover,input[type=reset]:hover {\n");
      out.write("    background-color: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: transparent;\n");
      out.write("    padding: 20px;\n");
      out.write("    width: 40%;\n");
      out.write("    margin-left: 500px;\n");
      out.write("    margin-top: 180px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("#body\n");
      out.write("{\n");
      out.write("    background-image: url(\"image/newspaper.jpg\");\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("#lab{\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: black;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("#head{\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <style>\n");
      out.write(" \n");
      out.write("#customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    padding: 8px;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("#customers td{\n");
      out.write("    background-color: gainsboro;\n");
      out.write("#back {\n");
      out.write("       background-color:black\n");
      out.write("       \n");
      out.write("    }    \n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: darkgrey;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: buttonhighlight;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div id=\"main\">\n");
      out.write("       <h2 align=\"center\" >VIEW COMPLAINTS</h2>&nbsp;\n");
      out.write("       <br>\n");
      out.write("    <br>\n");
      out.write("        <form>\n");
      out.write("        \n");
      out.write("        <table id=\"customers\">\n");
      out.write("    <tr>\n");
      out.write("    <th >No</th>\n");
      out.write("    <th>Name</th>\n");
      out.write("    <th>Description</th>\n");
      out.write("    <th>Date</th>\n");
      out.write("    <th>Time</th>\n");
      out.write("    \n");
      out.write("    <th></th>\n");
      out.write("    <th></th>\n");
      out.write("    </tr>\n");
      out.write("        \n");
      out.write("    ");

        String s="select * from tbl_complaint c inner join tbl_custreg ct on c.custreg_id=ct.custreg_id" ;
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String nam=r.getString("custreg_name");
             String descp=r.getString("com_des");
              String dat=r.getString("com_date");
             String tim=r.getString("com_time");
              
               
              
             
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(nam);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(descp);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(dat);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(tim);
      out.write("</td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("               </tr>\n");
      out.write("            \n");
      out.write("            ");

            
               i++; 
           
        }
          
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\t<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("            \n");
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
      out.write("                        \n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("                 \n");
      out.write("                        <footer class=\"footer-area section-gap\">\n");
      out.write("                            <div class=\"container\" style=\"height: 100px\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
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
      out.write("                                </div>\n");
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
      out.write("                        <a href=\"Footer.jsp\"></a>\n");
      out.write("\n");
      out.write("\t\t</body>\n");
      out.write("        </html>");
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
