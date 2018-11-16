<%-- 
    Document   : advertise
    Created on : Aug 27, 2018, 1:55:41 PM
    Author     : Mariya
--%>


<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<html>
     <%
        String adv="";
        String  id="";
        String  typ="";
        String  rat="";
        String  hei="";
        String  wid="";
        
        if(request.getParameter("insert")!=null)
        {
            String type=request.getParameter("txttype");
             String height=request.getParameter("txtheight");
             String width=request.getParameter("txtwidth");
             String rate=request.getParameter("txtrate");
            
            String idd=request.getParameter("hid");
            if(!idd.equals(""))
            {
             String upd="update tbl_advertise set  advertise_type='"+type+"',advertise_height='"+height+"',advertise_width='"+width+"',advertise_rate='"+rate+"' where advertise_id='"+idd+"'";
             
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
           String insert="insert into tbl_advertise(advertise_type,advertise_height,advertise_width,advertise_rate)values('"+type+"','"+height+"','"+width+"','"+rate+"')";
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
            String delete="delete from tbl_advertise where advertise_id='"+a+"'";
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
            id=request.getParameter("editid");
             String s="select advertise_type,advertise_width,advertise_height,advertise_rate from tbl_advertise where advertise_id="+id;
            System.out.println("typ:"+s);
             System.out.println("hei:"+s);
             System.out.println("wid:"+s);
             System.out.println("rat:"+s);
             ResultSet rs=obj.select(s);
             if(rs.next())
            {
                typ=rs.getString("advertise_type");
                wid=rs.getString("advertise_width");
                hei=rs.getString("advertise_height");
                           
                rat=rs.getString("advertise_rate");
               
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
    background-color: gainsboro;
    color: white;
    padding: 14px 20px;
    margin: 8px 50px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover,input[type=reset]:hover {
    background-color:blue;
}

#main {
    border-radius: 5px;
    background-color:transparent;
    color: black;
    padding: 20px;
    width: 40%;
    margin-left: 500px;
    margin-top: 180px;
   
   }
  
#body
{
    background-image: url("image/media.jpg");
    background-size: cover;
}
#lab{
    color: black;
    font-size: 20px;
    font-weight: bold;
    
}
 #head{
     font-size: 30px;
       color: white;
   }
</style>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advertise Page</title>
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

<table id="customers">
  
    </table>
       
    
    
    <div id="main">
        <h2 align="center"  id="head" >ADVERTISEMENT</h2>
        <br>
        <br>
  <form>
      <div>
          <label for="fname" id="head"> Type</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
    <input type="text" id="fname" name="txttype" placeholder=" name.." value="<%=typ%>">
    <input type="hidden" name="hid" value="<%=id%>">
     </div>
     
     <div>
        <label for="fname" id="head">Height</label>
    <input type="text" id="fname" name="txtheight" placeholder="heigtht.." value="<%=hei%>">
     </div>
     <div>
         <label for="fname" id="head">Width</label>&nbsp&nbsp;
    <input type="text" id="fname" name="txtwidth" placeholder="width.." value="<%=wid%>">
     </div>
     
     <div>
        <label for="fname" id="head">Rate</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="text" id="fname" name="txtrate" placeholder="rate.." value="<%=rat%>"> 
     </div>
     <div>
         <input type="submit" id="lab" name="insert" value=INSERT>
         <input type="reset" id="lab" name="rebutton" value="CANCEL">
     </div>
     <br>
    <br>
    <br>
    
<table id="customers">
    <tr id="lab">
    <th>No</th>
    <th>Type</th>
    <th>Height</th>
    <th>Width</th>
    <th>  </th>
    <th>  </th>
    </tr>
    
 <%
        String s="select * from tbl_advertise";
        ResultSet r=obj.select(s);
        int i=1;
        while(r.next())
        {
            String nam=r.getString("advertise_type");
            String height=r.getString("advertise_height");
            String width=r.getString("advertise_width");
            String rate=r.getString("advertise_rate");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><%=height%></td>
                <td><%=width%></td>
                <td><%=rate%></td>
                <td><a href="advertise.jsp?delid=<%=r.getString("advertise_id")%>"><img src="Design/Icons/delete.png" width="25" height="20"></a></td>
                <td><a href="advertise.jsp?editid=<%=r.getString("advertise_id")%>"><img src="Design/Icons/edit.png" width="25" height="20"></a></td>
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
<%@include file="Footer.jsp" %>