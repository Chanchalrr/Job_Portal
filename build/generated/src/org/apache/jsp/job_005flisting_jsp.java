package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jobportal.model.CategoriesDAO;
import java.sql.ResultSet;

public final class job_005flisting_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
//@page import="java.sql.PreparedStatement"
      out.write('\n');
//@page import="com.jobportal.services.DBConnection"
      out.write('\n');
//@page import="java.sql.Connection"
      out.write('\n');
      out.write('\n');

    /*try{
        Connection con = DBConnection.myMethod();
        String sql = "select * from jobcategory ";
        PreparedStatement ps = con.prepareStatement(sql);
        categoriesList = ps.executeQuery();
    } catch (Exception e) {
            e.printStackTrace();
    }*/
    CategoriesDAO categorieshandler = new CategoriesDAO();
    ResultSet categoriesList = categorieshandler.select();

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include_files/top_inc.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"breadcrumbs\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("            <h2>Jobs and Categories List</h2>\n");
      out.write("            <ol>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li>List</li>\n");
      out.write("            </ol>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"inner-page\">\n");
      out.write("    <div class=\"container col-lg-8 mt-0 mt-lg-0\">\n");
      out.write("        <div class=\"accordion\" id=\"accordionExample\">\n");
      out.write("            ");
 while (categoriesList.next()) {
                String categoryName = categoriesList.getString("name");
                String heading = "heading"+categoryName;
                String collapse = "collapse"+categoryName;
                int i = categoriesList.getInt("id");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"accordion-item\">\n");
      out.write("                <h2 class=\"accordion-header\" id=\"");
out.print(heading);
      out.write("\">\n");
      out.write("                    <button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"");
out.print(collapse);
      out.write("\" aria-expanded=\"true\" aria-controls=\"");
out.print(collapse);
      out.write("\">\n");
      out.write("                        ");
out.print(categoryName);
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                </h2>\n");
      out.write("                <div id=\"");
out.print(collapse);
      out.write("\" class=\"accordion-collapse collapse show\" aria-labelledby=\"");
out.print(heading);
      out.write("\" data-bs-parent=\"#accordionExample\">\n");
      out.write("                    <div class=\"accordion-body\">\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include_files/bottom_inc.jsp", out, false);
      out.write('\n');
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
