<%-- 
    Document   : Plan
    Created on : Aug 4, 2018, 2:10:09 PM
    Author     : Mariya
--%>

<%@include file="Header.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<html>
    <%
        String plan="", id="";
        if(request.getParameter("insert")!=null)
        {
            String name=request.getParameter("txtplan");
            
            String idd=request.getParameter("hid");
            if(!idd.equals(""))
            {
             String upd="update tbl_plan set plan_type='"+name+"' where plan_id='"+idd+"'";
             
            if(obj.insert(upd))
            {
                out.println("succesfully upated");
            }
            else
            {
                out.println("failed");
            }
            }
            else
            {
                out.println("plan");
           String insert="insert into tbl_plan(plan_type)values('"+name+"')";
            boolean b=obj.insert(insert);
            if(b)
            {
                out.println("succesfully inserted");
            }
              
            else
            {
               out.println("failed to insert");
            }
            }
        }
        
       
        if(request.getParameter("delid")!=null)
        {
            String a=request.getParameter("delid");
            String delete="delete from tbl_plan where plan_id='"+a+"'";
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
            String s="select * from tbl_plan where plan_id='"+request.getParameter("editid")+"'";
            System.out.println("plan:"+s);
            id=request.getParameter("editid");
            ResultSet rs=obj.select(s);
            if(rs.next())
            {
                plan=rs.getString("plan_type");
                System.out.println("plan:"+plan);
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
    background-color: gainsboro;
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
    color:black;
    font-size: 20px;
    font-weight: bold;
    
}
#head{
    font-size: 20px;
    color: black;
}
</style>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plan Page</title>
    </head>

      <style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
    font-size: 20px;
}
#customers td{
    background-color: gainsboro;

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: darkgrey;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: buttonhighlight;
    color: black;
    font-size: 30px;
}
</style>
</head>
 <body id="body">
    
   <div id="main">
        <h2 align="center" >PLAN</h2>
        <br>
        <br>
  <form>
      <div>
    
    <label for="fname"  id=lab>PLAN TYPE</label>
    <input type="text" id="fname" name="txtplan" placeholder="plan name.." value="<%=plan%>">
     <input type="hidden" name="hid" value="<%=id%>">
  
      </div>
  
     <div >
    <input type="submit"id="lab" name="insert"  value="Insert">
    <input type="reset" id="lab" name="rebutton" value="Cancel">
     </div>
    
    <br>
    <br>
    <br>
    
    <table id="customers" id="lab">
    <tr>
        <th id="head">No</th>
        <th id="head">Plan</th>
    <th></th>
    <th></th>
    </tr>
    
 <%
        String s="select * from tbl_plan";
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String nam=r.getString("plan_type");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><a href="Plan.jsp?delid=<%=r.getString("plan_id")%>"><img src="Design/Icons/delete.png" width="20" height="25"></a></td>
                <td><a href="Plan.jsp?editid=<%=r.getString("plan_id")%>"><img src="Design/Icons/edit.png" width="20" height="25"></a></td>
            </tr>
            
            <%
            
               i++; 
           
        }
          %>

</table>
  </form>
</div>

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
<%@include file="Footer.jsp" %>

