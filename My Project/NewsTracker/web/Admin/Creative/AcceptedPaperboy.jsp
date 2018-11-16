<%-- 
    Document   : AcceptedPaperboy
    Created on : Oct 21, 2018, 11:10:28 AM
    Author     : Mariya
--%>

<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accepted Page</title>
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
       <h2 align="center" >Accepted Paperboy</h2>&nbsp;
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
     <th>Route</th>
    <th></th>
    <th></th>
    </tr>
        
    <%
        String s="select * from tbl_paperboy pb inner join tbl_place p on pb.place_id=p.place_id where paperboy_status=1" ;
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
              
              String sele="select route_id from tbl_assignrt where paperboy_id="+r.getString("paperboy_id");
              ResultSet rsel=obj.select(sele);
               
               
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
                
                <%
                String from="";
                String to="";
                if(rsel.next())
                {
                    String selform="select place_name from tbl_place p inner join tbl_route r on p.place_id=r.route_from where r.route_id="+rsel.getString("route_id");
                    ResultSet rs=obj.select(selform);
                    if(rs.next())
                    {
                        from=rs.getString("place_name");
                        String selform1="select place_name from tbl_place p inner join tbl_route r on p.place_id=r.route_to where r.route_id="+rsel.getString("route_id");
                    ResultSet rs1=obj.select(selform1);
                    if(rs1.next())
                    {
                        to=rs1.getString("place_name");
                    }
                }
                
                %>
                <td><%=from%>-<%=to%></td>
                 <td><a href="AcceptedPaperboy.jsp?routechange_id=<%=r.getString("paperboy_id")%>">Change Route</a></td>
                <%
                }
                else
                {
                    %>
                    <td>Route not Assigned</td>
                     <td><a href="AcceptedPaperboy.jsp?paperboy_id=<%=r.getString("paperboy_id")%>">Assign Route</a></td>
                    <%
                }%>
                
               
                
            </tr>
            
            <%
            
               i++; 
           
        }
          %>
        </table>
       

 </div>

        <br>
        <br>
        <br>
        <%
        if(request.getParameter("paperboy_id")!=null)
        {
            session.setAttribute("paperboy",request.getParameter("paperboy_id"));
           
        
        %>
        <div id="main">
        <table id="customers">
    <tr>
        <th id="head">No</th>
        <th id="head">Route To</th>
        <th id="head">Route From</th>
        
    <th></th>
    <th></th>
    </tr>
    
 <%
        String b="select * from tbl_route rt inner join tbl_place p on rt.route_from=p.place_id ";
        ResultSet rm=obj.select(b);
        int a=1;
        while(rm.next())
        {
            String rt1=rm.getString("place_name");
            String rt2="";
            String sel="select place_name from tbl_place p  inner join tbl_route r on p.place_id=r.route_to where r.route_id="+rm.getString("route_id");
            System.out.println(sel);
            ResultSet rss=obj.select(sel);
            if(rss.next())
            {
            
            
            rt2=rss.getString("place_name");
            }
            %>
            <tr>
                <td><%=a%></td>
                <td><%=rt1%></td>
                <td><%=rt2%></td>
                <td><a href="AcceptedPaperboy.jsp?asign_id=<%=rm.getString("route_id")%>">Assign</a></td>
                
            </tr>
            
            <%
            
               i++; 
           
        }
        }
        
        
        if(request.getParameter("routechange_id")!=null)
        {
            session.setAttribute("paperboy",request.getParameter("routechange_id"));
           
        
        %>
        <div id="main">
        <table id="customers">
    <tr>
        <th id="head">No</th>
        <th id="head">Route To</th>
        <th id="head">Route From</th>
        
    <th></th>
    <th></th>
    </tr>
    
 <%
        String b="select * from tbl_route rt inner join tbl_place p on rt.route_from=p.place_id ";
        ResultSet rm=obj.select(b);
        int a=1;
        while(rm.next())
        {
            String rt1=rm.getString("place_name");
            String rt2="";
            String sel="select place_name from tbl_place p  inner join tbl_route r on p.place_id=r.route_to where r.route_id="+rm.getString("route_id");
            System.out.println(sel);
            ResultSet rss=obj.select(sel);
            if(rss.next())
            {
            
            
            rt2=rss.getString("place_name");
            }
            %>
            <tr>
                <td><%=a%></td>
                <td><%=rt1%></td>
                <td><%=rt2%></td>
                <td><a href="AcceptedPaperboy.jsp?change_id=<%=rm.getString("route_id")%>">Change</a></td>
                
            </tr>
            
            <%
            
               i++; 
           
        }
        }
        
        
        
        %>
        
        <%
       
        if(request.getParameter("asign_id")!=null)
        {
        String insert="insert into tbl_assignrt(route_id,paperboy_id)values('"+request.getParameter("asign_id")+"','"+session.getAttribute("paperboy")+"')";
            boolean c=obj.insert(insert);
            
            if(c)
            {
               out.println("Assigned");
            }
              
            else
            {
                
               System.out.println("failed to insert");
               
            }
         }
        
        
                
        if(request.getParameter("change_id")!=null)
        {
        String insert="update tbl_assignrt set route_id='"+request.getParameter("change_id")+"' where paperboy_id='"+session.getAttribute("paperboy")+"'";
            boolean c=obj.insert(insert);
             System.out.println(insert);
               
            if(c)
            {
               out.println("changed");
               response.sendRedirect("AcceptedPaperboy.jsp");
            }
              
            else
            {
                 
               System.out.println("failed to Change");
               
            }
         }
        
          %>

</table>
        
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
<%@include file="Footer.jsp" %>
    


