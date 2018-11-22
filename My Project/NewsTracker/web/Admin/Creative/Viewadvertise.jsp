<%-- 
    Document   : Viewadvertise
    Created on : Nov 19, 2018, 10:42:23 PM
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
        <title>View Advertisement</title>
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
       <h2 align="center" >VIEW ADVERTISEMENT</h2>&nbsp;
       <br>
    <br>
        <form>
        
        <table id="customers">
    <tr>
    <th >No</th>
    <th>Type</th>
    <th>Width</th>
    <th>Height</th>
    <th>Rate</th>
    <th>Image</th>
    
    </tr>
        
    <%
        String s="select * from tbl_insadv iv inner join tbl_advertise ad on iv.adv_type=ad.advertise_id" ;
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String typ=r.getString("advertise_type");
             String wid=r.getString("adv_width");
              String hei=r.getString("adv_height");
             String rat=r.getString("adv_rate");
              String img=r.getString("adv_image");
               
              
             %>
            <tr>
                <td><%=i%></td>
                <td><%=typ%></td>
                <td><%=wid%></td>
                <td><%=hei%></td>
                <td><%=rat%></td>
                <td><img src="../Creative/image/<%=img%>" width="100" height="100" alt="Sorry,Couldn't Load"> </td>
                
                
              </tr>
            
            <%
            
               i++; 
           
        }
          %>
        </table>
        </form>

 </div>


</body>

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
