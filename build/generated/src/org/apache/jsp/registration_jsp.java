package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include_files/top_inc.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"breadcrumbs\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("            <h2>Registration</h2>\n");
      out.write("            <ol>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li>Registration</li>\n");
      out.write("            </ol>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"common\" class=\"contact\">\n");
      out.write("    ");
if(request.getParameter("success") == null) {
      out.write("\n");
      out.write("        ");
if (request.getParameter("error") != null) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger text-center \" role=\"alert\">\n");
      out.write("            ");
out.print(request.getParameter("error"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write(" \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-lg-6 mt-0 mt-lg-0\">\n");
      out.write("\n");
      out.write("                    <form action=\"Registration\" class=\"myform border border-3 rounded-3 p-4\">\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-person-badge\"></i>\n");
      out.write("                                <label for=\"first_name\">First Name : </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"first_name\" id=\"first_name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-person-badge\"></i>\n");
      out.write("                                <label for=\"last_name\">Last Name : </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"last_name\" id=\"last_name\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mt-3 \">\n");
      out.write("                            <i class=\"bi bi-envelope-fill\"></i>\n");
      out.write("                            <label for=\"email\">Email ID : </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-key-fill\"></i>\n");
      out.write("                                <label for=\"password\">Password : </label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-key-fill\"></i>\n");
      out.write("                                <label for=\"pass_again\">Retype your password : </label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pass_again\" id=\"pass_again\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mt-3\">\n");
      out.write("                            <i class=\"bi bi-telephone-fill\"></i>\n");
      out.write("                            <label for=\"contact_no\">Contact Number : </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"contact_no\" id=\"contact_no\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-house-fill\"></i>\n");
      out.write("                                <label for=\"city\">City : </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"city\" id=\"state\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4 form-group mt-3 \">\n");
      out.write("                                <i class=\"bi bi-house-fill\"></i>\n");
      out.write("                                <label for=\"zip\">Zip : </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"zip\" id=\"zip\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <div class=\"col-md-6 mt-3 \">\n");
      out.write("                                    <input type=\"radio\"  name=\"role\" value=\"seeker\" id=\"seeker\" required>Job seeker : \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6  mt-3 \">\n");
      out.write("                                    <input type=\"radio\"  name=\"role\" value=\"provider\" id=\"provider\" required>Job provider :\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center\"><button type=\"submit\" value=\"Submit\" >Submit</button></div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    ");
} else {
      out.write("\n");
      out.write("        <div class=\"card text-center border-success m-4\">\n");
      out.write("            <div class=\"card-header border-success\">\n");
      out.write("                <i class=\"bi bi-check-circle-fill m-4 text-success\"></i>Registration Successful\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body my-3\">\n");
      out.write("                <h5 class=\"card-title\">Welcome in the Job Portal</h5>\n");
      out.write("                <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer text-muted border-success\">\n");
      out.write("                <a href=\"login.jsp\" class=\"btn btn-primary\">Log In</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("</section>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
