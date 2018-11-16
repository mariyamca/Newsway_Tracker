package org.apache.jsp.Admin.Login_005fv16;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ChangePass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write(" <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        if(request.getParameter("subbutton")!=null)
        {
            String cpass=request.getParameter("txtpass");
            String npass=request.getParameter("txtnpass");
            String rpass=request.getParameter("txtrpass");
            if(npass.equals(rpass))
            {
                String sel="select admin_username from tbl_admin where admin_password='"+cpass+"'"; 
                ResultSet rs =obj.select(sel);
                
                if(rs.next())
            {
                String upd="update tbl_admin set admin_password='"+rpass+"'";
                if(obj.insert(upd))
            {
                System.out.println("succesfully upated");
            }
                
            }
            
               else
            {
                 
      out.write("\n");
      out.write("                <script>\n");
      out.write("                alert(\"password wrong\");\n");
      out.write("                </script>\n");
      out.write("                ");
 
            }
            }
            
               else 
            {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                alert(\"password mismatch\");\n");
      out.write("                </script>\n");
      out.write("                ");
 
              
                }
             }
        
        
      out.write("\n");
      out.write("   \n");
      out.write("    <style>\n");
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
      out.write("<body background=\"bg-01.jpg\">\n");
      out.write("    <h2 align=\"center\" >CHANGE PASSWORD</h2>\n");
      out.write("    \n");
      out.write("    <div id=\"main\">\n");
      out.write("  <form >\n");
      out.write("      <div>\n");
      out.write("    <label for=\"fname\">Current Password</label>\n");
      out.write("    <input type=\"password\" id=\"uname\" name=\"txtpass\" placeholder=\"Current password..\">\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div>\n");
      out.write("    <label for=\"fname\">New Password</label>\n");
      out.write("    <input type=\"password\" id=\"uname\" name=\"txtnpass\" placeholder=\"Enter new password..\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("     <div>\n");
      out.write("    <label for=\"fname\">Confirm Password</label>\n");
      out.write("    <input type=\"password\" id=\"uname\" name=\"txtrpass\" placeholder=\"confirm..\">\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    <input type=\"submit\" name=\"subbutton\" value=\"SUBMIT\">\n");
      out.write("  </form>\n");
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
