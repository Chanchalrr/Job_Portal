package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jobportal.model.JobsDAO;
import java.sql.ResultSet;

public final class job_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include_files/top_inc.jsp", out, false);
      out.write('\n');
      out.write('\n');

    JobsDAO jobsHandler = new JobsDAO();
    ResultSet job = jobsHandler.selectById(Integer.parseInt(request.getParameter("id")));
    String s = jobsHandler.selectById(Integer.parseInt(request.getParameter("id"))).toString();


      out.write("\n");
      out.write("\n");
      out.write("<section class=\"breadcrumbs\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("            <h2>Job</h2>\n");
      out.write("            <ol>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"job_listing.jsp\">List</a></li>\n");
      out.write("                <li>Job</li>\n");
      out.write("            </ol>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"inner-page\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h5 class=\"card-title\">");
out.print(s);//job.getString("name");
      out.write("</h5>\n");
      out.write("                <p class=\"card-text\">");
//job.getString("desc");
      out.write("</p>\n");
      out.write("                <p class=\"card-text\">Pay : ");
//job.getString("desc");
      out.write("</p>\n");
      out.write("                <p class=\"card-text\">Contact Number : ");
//job.getString("mobile_num");
      out.write("</p>\n");
      out.write("                <p class=\"card-text\">Address: ");
//job.getString("address");
      out.write("</p>\n");
      out.write("                <!-- Button trigger modal -->\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">Apply</button>\n");
      out.write("\n");
      out.write("                <!-- Modal -->\n");
      out.write("                <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                ...\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include_files/bottom_inc.jsp", out, false);
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
