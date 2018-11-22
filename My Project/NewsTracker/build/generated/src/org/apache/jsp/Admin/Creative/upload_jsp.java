package org.apache.jsp.Admin.Creative;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.ResultSet;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Image Upload</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <form name=\"upload\" action=\"upload_action.jsp\" enctype=\"multipart/form-data\" method=\"post\" >\n");
      out.write("    <h1 align=\"center\">\n");
      out.write("            UPLOADING FILE\n");
      out.write("    </h1>\n");
      out.write("    <body>\n");
      out.write("    ");

        session.setAttribute("myid",request.getParameter("id"));
    
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("                <td align=\"center\">BROWSE THE PHOTO:</td>\n");
      out.write("                <td><input type=\"file\" name=\"txtup\" value=\"\" required=\"\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("             <td>\n");
      out.write("             <br>\n");
      out.write("                        \n");
      out.write("             </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>                 \n");
      out.write("            <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Submit\" name=\"submit\" required=\"\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    </body>\n");
      out.write("    </form>\n");
      out.write("    </html>\n");
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
