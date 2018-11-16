<%-- 
    Document   : Booking
    Created on : Oct 12, 2018, 11:05:27 PM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <%
        if(request.getParameter("acceptid")!=null)
        {
        String a=request.getParameter("acceptid");
        String update="update tbl_booking set booking_status=1 where booking_id= '"+a+"'";
         boolean b=obj.insert(update);
        
              if(b)
              {
                  out.println("Accepted");
              }
            
        }
        
       if(request.getParameter("rejectid")!=null)
                {
                   String b=request.getParameter("rejectid");
                   String updat="update tbl_booking set booking_status=2 where booking_id= '"+b+"'"; 
                    boolean s=obj.insert(updat);
        
             if(s)
              {
                  out.println("Rejected");
              }
            
        }
                
        %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Page</title>
        <style>
input[type=text],select {
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
    font-size: 20px;
    color: black;
    font-weight: bold;
}
#head{
    font-size: 20px;
    color: black;
}
</style>
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
#back {
       background-color:black
       
    }    

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
       <h2 align="center" >Booking</h2>&nbsp;
       <br>
    <br>
        <form>
        
        <table id="customers">
    <tr>
    <th >No</th>
    <th>Date</th>
    <th>Product</th>
    <th>Customer</th>
    <th>Plan</th>
    <th></th>
    <th></th>
    </tr>
        
    <%
        String s="select * from tbl_booking sc inner join tbl_prodplan c on sc.prodplan_id=c.prodplan_id inner join tbl_product p on c.product_id=p.product_id inner join tbl_plan s on c.plan_id=s.plan_id inner join tbl_custreg cs on sc.custreg_id=cs.custreg_id where booking_status=0";
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String dat=r.getString("booking_date");
             String prod=r.getString("product_name");
              String nam=r.getString("custreg_name");
               String plan=r.getString("plan_type");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=dat%></td>
                <td><%=prod%></td>
                <td><%=nam%></td>
                <td><%=plan%></td>
                <td><a href="Booking.jsp?acceptid=<%=r.getString("booking_id")%>">Accept</a></td>
                <td><a href="Booking.jsp?rejectid=<%=r.getString("booking_id")%>">Reject</a></td>
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
<br>
<br>
<br>
<br>
<br>
<%@include file="Footer.jsp" %>
    </body>
</html>
