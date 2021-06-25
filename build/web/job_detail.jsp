<%-- 
    Document   : job_detail
    Created on : 22 Jun, 2021, 5:28:13 PM
    Author     : Win-10
--%>
<%@page import="com.jobportal.model.JobsDAO"%>
<%@page import="java.sql.ResultSet"%>
 <jsp:include page="include_files/top_inc.jsp"/>

<%
    JobsDAO jobsHandler = new JobsDAO();
    ResultSet job = jobsHandler.selectById(Integer.parseInt(request.getParameter("id")));
    String s = jobsHandler.selectById(Integer.parseInt(request.getParameter("id"))).toString();

%>

<section class="breadcrumbs">
    <div class="container">
        <div class="d-flex justify-content-between align-items-center">
            <h2>Job</h2>
            <ol>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="job_listing.jsp">List</a></li>
                <li>Job</li>
            </ol>
        </div>
    </div>
</section>

<section class="inner-page">
    <div class="container">
        <div class="card">
            <div class="card-header">

            </div>
            <div class="card-body">
                <h5 class="card-title"><%out.print(s);//job.getString("name");%></h5>
                <p class="card-text"><%//job.getString("desc");%></p>
                <p class="card-text">Pay : <%//job.getString("desc");%></p>
                <p class="card-text">Contact Number : <%//job.getString("mobile_num");%></p>
                <p class="card-text">Address: <%//job.getString("address");%></p>
                
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Apply</button>

                <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                Do you want to apply for this job.
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                <button type="button" class="btn btn-primary">Apply</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </section>

            <jsp:include page="include_files/bottom_inc.jsp"/> 