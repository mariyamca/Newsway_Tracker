<%-- 
    Document   : ViewPaperboy
    Created on : Oct 20, 2018, 3:37:15 PM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
  <jsp:useBean class="database.mailconnection" id="obj1"></jsp:useBean>
<!DOCTYPE html>
<html>
    <%
        if(request.getParameter("acceptid")!=null)
        {
        String a=request.getParameter("acceptid");
        String update="update tbl_paperboy set paperboy_status=1 where paperboy_id= '"+a+"'";
         boolean b=obj.insert(update);
        
              if(b)
              {
                  out.println("Accepted");
                 String sel="select paperboy_email from tbl_paperboy where paperboy_id= '"+a+"'";
                  ResultSet rs=obj.select(sel);
                   if(rs.next()){
                       String to[]={rs.getString("paperboy_email")};
                       
                         boolean b1=obj1.sendMail(to, "Accepted", "You Are selected as a paperboy,You can now login");
                                    if(b)
                                    {
                                        
                                        %>
                                           <script>
                                              alert("Mail send");
                                           </script>
                                        <% 
                                    }
                                    else
                                            {
                                                out.println("Failed");
                                            }
                        
                   }
                  
              }
            
        }
        
       if(request.getParameter("rejectid")!=null)
                {
                   String b=request.getParameter("rejectid");
                   String updat="update tbl_paperboy set paperboy_status=2 where paperboy_id= '"+b+"'"; 
                    boolean s=obj.insert(updat);
        
             if(s)
              {
                  out.println("Rejected");
              }
            
        }
                
        %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View paperboy</title>
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
       <h2 align="center" >VIEW PAPERBOYS</h2>&nbsp;
       <br>
    <br>
        <form>
        
        <table id="customers">
    <tr>
    <th >No</th>
    <th>Name</th>
    <th>Place</th>
    <th>Gender</th>
    <th>Age</th>
     <th>Email</th>
     <th>Phno</th>
     <th>District</th>
    <th></th>
    <th></th>
    </tr>
        
    <%
        String s="select * from tbl_paperboy pb inner join tbl_place p on pb.place_id=p.place_id where paperboy_status=0 " ;
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String nam=r.getString("paperboy_name");
             String plac=r.getString("place_name");
              String gen=r.getString("paperboy_gender");
             String age=r.getString("paperboy_age");
              String email=r.getString("paperboy_email");
             String phn=r.getString("paperboy_phno");
              String dist=r.getString("paperboy_district");
               
              
             %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><%=plac%></td>
                <td><%=gen%></td>
                <td><%=age%></td>
                <td><%=email%></td>
                <td><%=phn%></td>
                <td><%=dist%></td>
                
                <td><a href="ViewPaperboy.jsp?acceptid=<%=r.getString("paperboy_id")%>">Accept</a></td>
                <td><a href="ViewPaperboy.jsp?rejectid=<%=r.getString("paperboy_id")%>">Reject</a></td>
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

