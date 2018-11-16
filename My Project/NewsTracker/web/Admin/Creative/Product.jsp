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
 <%
        String id="";
        String itemid="";
        String langid="";
        String prdtname="";
        String prdtprice="";
         if(request.getParameter("insert")!=null)
        {
            String cname=request.getParameter("txtproduct");
            String cprice=request.getParameter("txtprice");
            String hh=request.getParameter("hid");
            if(!hh.equals(""))
            {
              String update="update tbl_product set product_name='"+cname+"',product_price='"+cprice+"',item_id='"+request.getParameter("item")+"',lang_id='"+request.getParameter("language")+"' where product_id="+hh;
              boolean b=obj.insert(update);
        
              if(b)
              {
                  System.out.println("updated");
              }
            }
            else
            {
            String insert="insert into tbl_product(product_name,product_price,item_id,lang_id)values('"+cname+"','"+cprice+"','"+request.getParameter("item")+"','"+request.getParameter("language")+"')";
            boolean b=obj.insert(insert);
            
            if(b)
            {
               System.out.println("inserted");
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
            String delete="delete from tbl_product where product_id='"+a+"'";
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
             String sel="select product_name,product_price,item_id,lang_id from tbl_product where product_id="+id;
             System.out.println("prdtname:"+sel);
             System.out.println("prdtprice:"+sel);
             ResultSet rs=obj.select(sel);
             if(rs.next())
             {
                 prdtname=rs.getString("product_name");
                 prdtprice=rs.getString("product_price");
                 
                 itemid=rs.getString("item_id");
                 langid=rs.getString("lang_id");
             }
         }
        %>
   
   
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
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
         <h2 align="center" >PRODUCT</h2>
         <br>
         <br>
         
    <form >
      <div>
            <label for="item" id=lab>Item</label>
            <select  name="item">
            <option seleccted="selected" value="">Select</option>
    
        
          <%
        String s="select * from tbl_item";
        ResultSet rs=obj.select(s);
       
        while(rs.next())
        {
             
            %>
           
            
       <option <% if(itemid.equals(rs.getString("item_id"))){%>selected=""<%}%> value="<%=rs.getString("item_id")%>"><%=rs.getString("item_name")%></option>
            <%
          
        }
        %>
	</select>
        </div>
        
        <div>
     
         <label for="lang" id=lab>Language</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
         <select  name="language">
         <option seleccted="selected" value="">Select</option>
    
         <%
        String l="select * from tbl_lang";
        ResultSet r=obj.select(l);
        
        while(r.next())
        {
             
            %>
           
            
       <option <% if(langid.equals(r.getString("lang_id"))){%>selected=""<%}%> value="<%=r.getString("lang_id")%>"><%=r.getString("lang_name")%></option>
            <%
          
        }
        %>
	</select>
        </div>
        <div>
             <label for="fname" id=lab>Product Name</label>
            <input type="text" id="fname" name="txtproduct" placeholder=" enter product.." value="<%=prdtname%>">
             <input type="hidden" name="hid" value="<%=id%>">
        </div>
        
        <div>
            <label for="fname" id=lab>Product Price</label> &nbsp;
    <input type="text" id="lname" name="txtprice" placeholder=" enter price.." value="<%=prdtprice%>">
    
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
        <th id="head"> Product</th>
        <th id="head">Price</th>
    <th id="head">Item</th>
    <th id="head">Language</th>
    <th></th>
    <th></th>
    </tr>

    
      <%
        String sel="select * from tbl_product sc inner join tbl_item c on sc.item_id=c.item_id inner join tbl_lang s on sc.lang_id=s.lang_id" ;
        ResultSet m=obj.select(sel);
        int i=1;
        while(m.next())
        {
            String nam=m.getString("product_name");
            String pri=m.getString("product_price");
            %>
            <tr>
                <td><%=i%></td>
                <td><%=nam%></td>
                <td><%=pri%></td>
                <td><%=m.getString("item_name")%></td>
                <td><%=m.getString("lang_name")%></td>
              <td><a href="Product.jsp?delid=<%=m.getString("product_id")%>"><img src="Design/Icons/delete.png" width="20" height="25"></a></td>
              <td><a href="Product.jsp?editid=<%=m.getString("product_id")%>"><img src="Design/Icons/edit.png" width="20" height="25"></a></td>
                
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


