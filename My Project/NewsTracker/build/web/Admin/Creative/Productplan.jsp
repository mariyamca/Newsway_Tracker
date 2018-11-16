<%-- 
    Document   : Productplan
    Created on : Aug 27, 2018, 12:48:42 PM
    Author     : Mariya
--%>


<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<html
    <%
        String id="";
        String itemid="";
        String planid="";
        String prdtrate="";
         if(request.getParameter("insert")!=null)
        {
            
            String cprice=request.getParameter("txtproduct");
            String hh=request.getParameter("hid");
            if(!hh.equals(""))
            {
              String update="update tbl_prodplan set prodplan_rate='"+cprice+"',product_id='"+request.getParameter("prodt")+"',plan_id='"+request.getParameter("plan")+"' where prodplan_id="+hh;
              boolean b=obj.insert(update);
        
              if(b)
              {
                  System.out.println("updated");
              }
            }
            else
            {
            String insert="insert into tbl_prodplan(prodplan_rate,product_id,plan_id)values('"+cprice+"','"+request.getParameter("prodt")+"','"+request.getParameter("plan")+"')";
            boolean b=obj.insert(insert);
            
            if(b)
            {
               System.out.println("inserted");
            }
              
            else
            {
                
            }
        }
               System.out.println("failed to insert");
               
            }
        
        if(request.getParameter("delid")!=null)
        {
            String a=request.getParameter("delid");
            String delete="delete from tbl_prodplan where prodplan_id='"+a+"'";
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
             String sel="select prodplan_rate,product_id,plan_id from tbl_prodplan where prodplan_id="+id;
             
             System.out.println("prdtprice:"+sel);
             ResultSet rs=obj.select(sel);
             if(rs.next())
             {
                 
                 prdtrate=rs.getString("prodplan_rate");
                 itemid=rs.getString("product_id");
                 planid=rs.getString("plan_id");
             }
         }
        %>
   
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productplan Page</title>
    </head>
    
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
    color: black;
    font-size: 20px;
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
        <table>
         <h2 align="center" >PRODUCT PLAN</h2>
         <br>
         <br>
  <form >
      <div>
          <label for="prodt" id="lab">Product</label>
      <select  name="prodt">
      <option seleccted="selected"value="">Select</option>
    
        
         <%
        String s="select * from tbl_product";
        ResultSet rs=obj.select(s);
       
        while(rs.next())
        {
             
            %>
           
            
       <option <% if(itemid.equals(rs.getString("product_id"))){%>selected=""<%}%> value="<%=rs.getString("product_id")%>"><%=rs.getString("product_name")%></option>
            <%
          
        }
        %>
	</select>
        </div>
        
        <div>
     
            <label for="plan" id="lab">Plan</label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
      <select  name="plan">
      <option seleccted="selected"value="">Select</option>
    
         <%
        String l="select * from tbl_plan";
        ResultSet r=obj.select(l);
        
        while(r.next())
        {
             
            %>
           
            
       <option <% if(planid.equals(r.getString("plan_id"))){%>selected=""<%}%> value="<%=r.getString("plan_id")%>"><%=r.getString("plan_type")%></option>
            <%
          
        }
        %>
	</select>
       
        </div>
        <div>
            <label for="fname" id="lab">Plan Rate</label>
    <input type="text" id="fname" name="txtproduct" placeholder=" enter product.." value="<%=prdtrate%>">
    <input type="hidden" name="hid" value="<%=id%>">
        </div>
       
        
        <div>
            <input type="submit" id="lab" name="insert" value=Insert>
             <input type="reset" id="lab" name="rebutton" value="CANCEL">
        </div>
    
    <br>
    <br>
    <br>
    
<table id="customers">
    <tr>
        <th id="head">No</th>
        <th id="head">Plan Rate</th>
        <th id="head">Product Name</th>
        <th id="head">Plan</th>
    <th></th>
    <th></th>
    </tr>
    
     <%
        String sel="select * from tbl_prodplan sc inner join tbl_product c on sc.product_id=c.product_id inner join tbl_plan s on sc.plan_id=s.plan_id" ;
        ResultSet m=obj.select(sel);
        int i=1;
        while(m.next())
        {
            
            String pri=m.getString("prodplan_rate");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=pri%></td>
                <td><%=m.getString("product_name")%></td>
                <td><%=m.getString("plan_type")%></td>
              <td><a href="Productplan.jsp?delid=<%=m.getString("prodplan_id")%>"><img src="Design/Icons/delete.png" width="25" height="20"></a></td>
              <td><a href="Productplan.jsp?editid=<%=m.getString("prodplan_id")%>"><img src="Design/Icons/edit.png" width="25" height="20"></a></td>
                
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
<%@include file="Footer.jsp" %>

