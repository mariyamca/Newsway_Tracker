<%-- 
    Document   : Route
    Created on : Oct 20, 2018, 9:41:01 AM
    Author     : Mariya
--%>

<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<html>
    <%
    String route1="",route2, placid="";
    if(request.getParameter("insert")!=null)
        {
            String rtfrom=request.getParameter("From");
            String rto=request.getParameter("To");
           
           String insert="insert into tbl_route(route_to,route_from)values('"+rto+"','"+rtfrom+"')";
            boolean b=obj.insert(insert);
            if(b)
            {
                System.out.println("succesfully inserted");
            }
              
            else
            {
              System.out.println("failed to insert");
            }
        }
        
       
        if(request.getParameter("delid")!=null)
        {
            String a=request.getParameter("delid");
            String delete="delete from tbl_route where route_id='"+a+"'";
            if(obj.insert(delete))
            {
                System.out.println("succesfully deleted");
            }
            else
            {
              System.out.println("deletion failed");  
            }
        }
    %>
    
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
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Route Page</title>
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
 
    <body id="body">
        <div id="main">
        <h2 align="center">ROUTE</h2>
       <br>
        <br>
  <form>
        <div>
     <label for="fname" id="lab">Route From</label>
     <select  name="From">
            <option seleccted="selected" value="">Select</option>
    
        
          <%
        String s="select * from tbl_place";
        ResultSet rs=obj.select(s);
       
        while(rs.next())
        {
             
            %>
           
           <option <% if(placid.equals(rs.getString("place_id"))){%>selected=""<%}%> value="<%=rs.getString("place_id")%>"><%=rs.getString("place_name")%></option>
            <%
          
        }
        %>
	</select>
        </div>
      <div>
    <label for="fname" id="lab">Route To</label>
    <select  name="To">
            <option seleccted="selected" value="">Select</option>
    
        
          <%
        String a="select * from tbl_place";
        ResultSet r=obj.select(a);
       
        while(r.next())
        {
             
            %>
           
           <option <% if(placid.equals(r.getString("place_id"))){%>selected=""<%}%> value="<%=r.getString("place_id")%>"><%=r.getString("place_name")%></option>
            <%
          
        }
        %>
	</select>
    </div>
  
        <div>
    <input type="submit"id="lab" name="insert" value="Insert">
    <input type="reset" id="lab" name="rebutton" value="CANCEL">
        </div>
    
    <br>
    <br>
    <br>
    <table id="customers">
    <tr>
        <th id="head">No</th>
        <th id="head">Route From</th>
        <th id="head">Route To</th>
        
    <th></th>
    <th></th>
    </tr>
    
 <%
        String b="select * from tbl_route rt inner join tbl_place p on rt.route_from=p.place_id ";
        ResultSet rm=obj.select(b);
        int i=1;
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
                <td><%=i%></td>
                <td><%=rt1%></td>
                <td><%=rt2%></td>
                <td><a href="Route.jsp?delid=<%=rm.getString("route_id")%>"><img src="Design/Icons/delete.png" width="20" height="25"></a></td>
                
            </tr>
            
            <%
            
               i++; 
           
        }
          %>

</table>
      </form>
        </div>
    </body>
    
</html><br>
<br>
<br>
<br>
<%@include file="Footer.jsp" %>
