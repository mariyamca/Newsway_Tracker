<%--  
    Document   : ChangePass
    Created on : Aug 12, 2018, 10:33:41 AM
    Author     : Mariya
--%>

<%@include file="Header.jsp"%>


<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <%
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
                 %>
                <script>
                alert("password wrong");
                </script>
                <% 
            }
            }
            
               else 
            {
                %>
                <script>
                alert("password mismatch");
                </script>
                <% 
              
                }
             }
        
        %>
   
    <style>
input[type=text],input[type=password],select {
    width: 50%;
    padding: 12px 25px;
    margin: 8px 15px;
    border: 1px solid #ccc;
    display: inline-block;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit],input[type=reset] {
    width: 30%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 50px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover,input[type=reset]:hover {
    background-color: blue;
}

#main {
    border-radius: 5px;
    background-color: transparent;
    padding: 20px;
    width: 40%;
    margin-left: 500px;
    margin-top: 180px;
   
    
        
}
#body
{
    background-image: url("image/newspaper.jpg");
    background-size: cover;
}
#lab{
    font-size: 25px;
    color: black;
    font-weight: bold;
}
</style>
<form>
<body id="body">
    
    <div id="main">
             
        <h2 align="center" style="margin-top: 5px" >CHANGE PASSWORD</h2>
        <br>
        <br>
        <br>
        <form>
      <div>
          <label for="fname" id="lab">Current Password</label>
          &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" id="uname" name="txtpass" placeholder="Current password..">
      </div>
      
      <div>
          <label for="fname" id="lab">New Password</label> 
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;<input type="password" id="uname" name="txtnpass" placeholder="Enter new password..">
      </div>
    
     <div>
    <label for="fname" id="lab">Confirm Password</label>
   &nbsp; <input type="password" id="uname" name="txtrpass" placeholder="confirm..">
      </div>
      <div>
    <input type="submit" name="subbutton" value="SUBMIT">
    <input type="reset" name="rebutton" value="CANCEL">
   
</div>
    </div>
                </form>
</body>

</html>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<%@include file="Footer.jsp" %>
