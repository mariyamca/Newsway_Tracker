package org.apache.jsp.Admin.Creative;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Prod_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/Creative/Header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                                        <li><a href=\"advertise.jsp\">Advertisement</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Item.jsp\">Item</a></li>\n");
      out.write("                                                                <li><a href=\"Place.jsp\">Place</a></li>\n");
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
      out.write("                                                                  <a class=\"dropdown-item\" href=\"ChangePass.jsp\">Change Password</a>\n");
      out.write("\t\t\t\t\t\t\t       \n");
      out.write("\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t    </li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t\t  </div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>");
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
      out.write(" ");

        String id="";
        String itemid="";
        String langid="";
        String prdtname="";
        String prdtprice="";
         if(request.getParameter("insert")!=null)
        {
            String cname=request.getParameter("txtproduct");
            String cprice=request.getParameter("txtprice");
            String hh=request.getParameter("hid");
            if(!hh.equals(""))
            {
              String update="update tbl_product set product_name='"+cname+"',product_price='"+cprice+"',item_id='"+request.getParameter("item")+"',lang_id='"+request.getParameter("language")+"' where product_id="+hh;
              boolean b=obj.insert(update);
        
              if(b)
              {
                  System.out.println("updated");
              }
            }
            else
            {
            String insert="insert into tbl_product(product_name,product_price,item_id,lang_id)values('"+cname+"','"+cprice+"','"+request.getParameter("item")+"','"+request.getParameter("language")+"')";
            boolean b=obj.insert(insert);
            
            if(b)
            {
               System.out.println("inserted");
            }
              
            else
            {
                
               System.out.println("failed to insert");
               
            }
            }
        }
        
        if(request.getParameter("delid")!=null)
        {
            String a=request.getParameter("delid");
            String delete="delete from tbl_product where product_id='"+a+"'";
            if(obj.insert(delete))
            {
                System.out.println("succesfully deleted");
            }
            else
            {
              System.out.println("deletion failed");  
            }
        }
         if(request.getParameter("editid")!=null)
         {
             id=request.getParameter("editid");
             String sel="select product_name,product_price,item_id,lang_id from tbl_product where product_id="+id;
             System.out.println("prdtname:"+sel);
             System.out.println("prdtprice:"+sel);
             ResultSet rs=obj.select(sel);
             if(rs.next())
             {
                 prdtname=rs.getString("product_name");
                 prdtprice=rs.getString("product_price");
                 
                 itemid=rs.getString("item_id");
                 langid=rs.getString("lang_id");
             }
         }
        
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     <style>\n");
      out.write("input[type=text],input[type=password],select {\n");
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
      out.write("   }\n");
      out.write("#body\n");
      out.write("{\n");
      out.write("    background-image: url(\"newspaper.jpg\");\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("#lab{\n");
      out.write("    color: black;\n");
      out.write("    font-size: 25px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write(" <style>\n");
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
      out.write("</head>\n");
      out.write("<body id=\"body\">\n");
      out.write("<table id=\"customers\">\n");
      out.write(" \n");
      out.write("   \n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"main\">\n");
      out.write("         <h2 align=\"center\" >PRODUCT</h2>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("         \n");
      out.write("  <form >\n");
      out.write("      <div>\n");
      out.write("          <label for=\"item\" id=lab>Item</label> \n");
      out.write("            <select  name=\"item\">\n");
      out.write("            <option seleccted=\"selected\" value=\"\">Select</option>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("          ");

        String s="select * from tbl_item";
        ResultSet rs=obj.select(s);
       
        while(rs.next())
        {
             
            
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("       <option ");
 if(itemid.equals(rs.getString("item_id"))){
      out.write("selected=\"\"");
}
      out.write(" value=\"");
      out.print(rs.getString("item_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("item_name"));
      out.write("</option>\n");
      out.write("            ");

          
        }
        
      out.write("\n");
      out.write("\t</select>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("     \n");
      out.write("         <label for=\"lang\" id=lab>Language</label><span>\n");
      out.write("         <select  name=\"language\">\n");
      out.write("         <option seleccted=\"selected\" value=\"\">Select</option>\n");
      out.write("    \n");
      out.write("         ");

        String l="select * from tbl_lang";
        ResultSet r=obj.select(l);
        
        while(r.next())
        {
             
            
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("       <option ");
 if(langid.equals(r.getString("lang_id"))){
      out.write("selected=\"\"");
}
      out.write(" value=\"");
      out.print(r.getString("lang_id"));
      out.write('"');
      out.write('>');
      out.print(r.getString("lang_name"));
      out.write("</option>\n");
      out.write("            ");

          
        }
        
      out.write("\n");
      out.write("\t</select>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("             <label for=\"fname\" id=lab>Product Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"txtproduct\" placeholder=\" enter product..\" value=\"");
      out.print(prdtname);
      out.write("\">\n");
      out.write("             <input type=\"hidden\" name=\"hid\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <label for=\"fname\" id=lab>Product Price</label> &nbsp;\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"txtprice\" placeholder=\" enter price..\" value=\"");
      out.print(prdtprice);
      out.write("\">\n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <input type=\"submit\" name=\"insert\" value=Insert>\n");
      out.write("             <input type=\"reset\" name=\"rebutton\" value=\"CANCEL\">\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <table id=\"customers\">\n");
      out.write("    <tr>\n");
      out.write("    <th>No</th>\n");
      out.write("    <th>Product</th>\n");
      out.write("    <th>Price</th>\n");
      out.write("    <th>Item</th>\n");
      out.write("    <th>Language</th>\n");
      out.write("    <th></th>\n");
      out.write("    <th></th>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    \n");
      out.write("      ");

        String sel="select * from tbl_product sc inner join tbl_item c on sc.item_id=c.item_id inner join tbl_lang s on sc.lang_id=s.lang_id" ;
        ResultSet m=obj.select(sel);
        int i=1;
        while(m.next())
        {
            String nam=m.getString("product_name");
            String pri=m.getString("product_price");
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(nam);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(pri);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(m.getString("item_name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(m.getString("lang_name"));
      out.write("</td>\n");
      out.write("              <td><a href=\"Product.jsp?delid=");
      out.print(m.getString("product_id"));
      out.write("\"><img src=\"Design/Icons/delete.png\" width=\"20\" height=\"15\"></a></td>\n");
      out.write("              <td><a href=\"Product.jsp?editid=");
      out.print(m.getString("product_id"));
      out.write("\"><img src=\"Design/Icons/edit.png\" width=\"20\" height=\"15\"></a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

            
               i++; 
           
        }
          
      out.write("\n");
      out.write("          </table>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
      out.write("\n");
      out.write("\n");
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
