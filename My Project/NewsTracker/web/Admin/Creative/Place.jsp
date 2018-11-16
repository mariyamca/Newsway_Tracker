<%-- 
    Document   : Place
    Created on : Aug 4, 2018, 2:09:56 PM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<html>
    
     <%
        String place="", id="";
        
        if(request.getParameter("insert")!=null)
        {
            String name=request.getParameter("txtplace");
            
            String idd=request.getParameter("hid");
            if(!idd.equals(""))
            {
             String upd="update tbl_place set place_name='"+name+"' where place_id='"+idd+"'";
             
            if(obj.insert(upd))
            {
                System.out.println("succesfully upated");
            }
            else
            {
                System.out.println("failed");
            }
            }
            else
            {
                System.out.println("place");
           String insert="insert into tbl_place(place_name)values('"+name+"')";
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
        }
        
       
        if(request.getParameter("delid")!=null)
        {
            String a=request.getParameter("delid");
            String delete="delete from tbl_place where place_id='"+a+"'";
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
            String s="select * from tbl_place where place_id='"+request.getParameter("editid")+"'";
            System.out.println("place:"+s);
           id=request.getParameter("editid");
            ResultSet rs=obj.select(s);
            if(rs.next())
            {
                place=rs.getString("place_name");
                System.out.println("place:"+place);
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
    background-image: url("image/newspaper_1.jpg");
    background-size: cover;
}
#lab{
    font-size: 25px;
    color: black;
   font-weight: bold;
    
}
#head{
    font-size: 20px;
    color: black;
}
</style>
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
       <h2 align="center" >PLACE</h2>&nbsp;
       <br>
    <br>
  <form >
      <div>
    
    <label for="fname" id=lab >Place</label>
    
   <input type="text" id="fname" name="txtplace" placeholder="Place name.." value="<%=place%>">
    <input type="hidden" name="hid" value="<%=id%>">
    
      </div>
  <div>
    <input type="submit" name="insert" value="SUBMIT">
    <input type="reset" name="rebutton" value="CANCEL">
  </div>
    <br>
    <br>
    
     
    
<table id="customers">
    <tr>
        <th id="head">No</th>
        <th id="head">Place</th>
    <th></th>
    <th></th>
    </tr>
    
 <%
        String s="select * from tbl_place";
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String nam=r.getString("place_name");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><a href="Place.jsp?delid=<%=r.getString("place_id")%>"><img src="Design/Icons/delete.png" width="20" height="25"></a></td>
                <td><a href="Place.jsp?editid=<%=r.getString("place_id")%>"><img src="Design/Icons/edit.png" width="20" height="25"></a></td>
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
