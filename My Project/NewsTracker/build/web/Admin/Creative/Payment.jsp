<%-- 
    Document   : Payment
    Created on : Oct 26, 2018, 1:49:38 PM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
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
       <h2 align="center" >Payment</h2>&nbsp;
       <br>
    <br>
        <form>
        
        <table id="customers">
    <tr>
    <th >No</th>
     <th>Customer</th>
    <th>Product</th>
    <th>Plan</th>
    <th>Rate</th>
    <th>Status</th>
    </tr>
        
    <%
        if(request.getParameter("noti_id")!=null){
            String desc="Notification::Your Payments are Pending ";
            String noti="insert into tbl_notify(notify_date,notify_time,notify_msg,custreg_id)values(curdate(),curtime(),'"+desc+"','"+request.getParameter("noti_id")+"')";
              boolean b=obj.insert(noti);
            if(b)
            {
                System.out.println("succesfully inserted");
            }
              
            else
            {
              System.out.println("failed to insert");
            }
         }
       
            
 
        String s="select * from tbl_booking sc inner join tbl_prodplan c on sc.prodplan_id=c.prodplan_id inner join tbl_product p on c.product_id=p.product_id inner join tbl_plan s on c.plan_id=s.plan_id inner join tbl_custreg cs on sc.custreg_id=cs.custreg_id where booking_status=1";
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            
            String nam=r.getString("custreg_name");
             String prod=r.getString("product_name");
              String plan=r.getString("plan_type");
                String rat=r.getString("prodplan_rate");
                 String stats=r.getString("booking_paystatus");
                 String stat;
                 if(stats.equals("1")){
                     stat="Payment Succesfull";
                     
                 }
                 else{
                     stat="Unsuccesfull";
                 }
            %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><%=prod%></td>
                <td><%=plan%></td>
                <td><%=rat%></td>
                <td><%=stat%></td>
                <td><a href="Payment.jsp?noti_id=<%=r.getString("custreg_id")%>">Notify</a></td>
                
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
