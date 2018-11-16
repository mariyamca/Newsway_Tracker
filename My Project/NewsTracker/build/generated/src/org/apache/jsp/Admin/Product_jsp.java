package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <style>\n");
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
      out.write("input[type=submit] {\n");
      out.write("    width: 50%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 50px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 20px;\n");
      out.write("    width: 40%;\n");
      out.write("    margin-left: 350px;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <style>\n");
      out.write("#customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: burlywood;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: buttonhighlight;\n");
      out.write("    color: blueviolet;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<table id=\"customers\">\n");
      out.write("  <tr>\n");
      out.write("    <th><a href=\"HomePage.jsp\">HomePage</a></th>\n");
      out.write("    <th><a href=\"advertise.jsp\">Advertisement</a></th>\n");
      out.write("    <th><a href=\"Item.jsp\">Item</a></th>\n");
      out.write("    <th><a href=\"Place.jsp\">Place</a></th>\n");
      out.write("    <th> <a href=\"Plan.jsp\">Plan</a></th>\n");
      out.write("    <th> <a href=\"language.jsp\">Language</a></th>\n");
      out.write("    <th><a href=\"Product.jsp\">Product</a></th>\n");
      out.write("    <th> <a href=\"Productplan.jsp\">ProductPlan</a></th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("   \n");
      out.write("    </table>\n");
      out.write("     ");

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
      out.write("    <h2 align=\"center\" >PRODUCT</h2>\n");
      out.write("    \n");
      out.write("    <div id=\"main\">\n");
      out.write("  <form >\n");
      out.write("      <div>\n");
      out.write("          <label for=\"item\">Item</label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("      <select  name=\"item\">\n");
      out.write("      <option seleccted=\"selected\"value=\"\">Select</option>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("         ");

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
      out.write("\t<label for=\"lang\">Language</label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("      <select  name=\"language\">\n");
      out.write("      <option seleccted=\"selected\"value=\"\">Select</option>\n");
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
      out.write("    <label for=\"fname\">Product Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"txtproduct\" placeholder=\" enter product..\" value=\"");
      out.print(prdtname);
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"hid\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"fname\">Product Price</label> &nbsp;\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"txtprice\" placeholder=\" enter price..\" value=\"");
      out.print(prdtprice);
      out.write("\">\n");
      out.write("    \n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("    <input type=\"submit\" name=\"insert\" value=Insert>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("<table id=\"customers\">\n");
      out.write("    <tr>\n");
      out.write("    <th>No</th>\n");
      out.write("    <th>Product</th>\n");
      out.write("    <th>Price</th>\n");
      out.write("    <th>Item</th>\n");
      out.write("    <th>Language</th>\n");
      out.write("    <th></th>\n");
      out.write("    <th></th>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("     ");

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
      out.write("\"><img src=\"../Design/Icons/delete.png\" width=\"20\" height=\"15\"></a></td>\n");
      out.write("              <td><a href=\"Product.jsp?editid=");
      out.print(m.getString("product_id"));
      out.write("\"><img src=\"../Design/Icons/edit.png\" width=\"20\" height=\"15\"></a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

            
               i++; 
           
        }
          
      out.write("\n");
      out.write("</table>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
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
