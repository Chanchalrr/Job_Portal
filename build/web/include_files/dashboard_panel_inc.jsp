<%-- 
    Document   : dashboard_panel
    Created on : 25 Jun, 2021, 8:34:38 PM
    Author     : santosh
--%>
<%@page import="java.sql.ResultSet"%>
<%
    session = request.getSession();
    ResultSet rs1 = (ResultSet) session.getAttribute("resultset");
%>
<div class="card bg-dark p-0 mb-3 text-white">
    <div class="card-header text-center" style="border-bottom-color: #ffc451">
        <h5 style="color:#ffc451"><%out.print(rs1.getString(9).toUpperCase());%></h5>
        <img class="rounded-circle my-2" style="width: 100px;border: 2px solid #ffc451" src="assets/img/dummy-person-team.png" alt="img"/><br>
        <h6 style="color:#ffc451"><%out.print(rs1.getString("first_name").toUpperCase() + " " + rs1.getString("last_name").toUpperCase());%></h6>
    </div>    
    <div class="card-body">
        <ul>
            <li>Profile</li>
            <li>Edit Profile</li>
            <li>Log out</li>
        </ul>

        <%if (rs1.getString("role") == "seeker") {%>

        <%} else if (rs1.getString("role") == "prodiver") {%>

        <%} else {
                out.print("Error or unspecified user");
          }%>
    </div>

</div> 
