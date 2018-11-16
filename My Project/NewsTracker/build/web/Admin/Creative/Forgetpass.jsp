<%-- 
    Document   : Forgetpass
    Created on : Aug 31, 2018, 10:41:56 AM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page import="java.util.Random"%>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
    <jsp:useBean class="database.mailconnection" id="obj1"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="zxx" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="CodePixar">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Main Page</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/jquery.DonutWidget.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/owl.carousel.css">
			<link rel="stylesheet" href="css/main.css">
		</head>
		<body>

			<!-- Start Header Area -->
			<header class="default-header">
				<nav class="navbar navbar-expand-lg  navbar-light">
					<div class="container">
						  <a class="navbar-brand" href="index.html">
                                                      <img src="img/elements/img1.jpg" alt="">
						  </a>
						  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						    <span class="navbar-toggler-icon"></span>
						  </button>

						  <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
						    <ul class="navbar-nav">
                                                        <li><a href="../../Guest/Login_v16/Index.jsp">Login</a></li>
                                                        <li><a href="../../Guest/Creative/MainLogin.jsp">LogOut</a></li>
								
								
						
							   <!-- Dropdown -->
							    								
						    </ul>
						  </div>						
					</div>
				</nav>
			</header>
    <head>
        <title>
            forget
        </title>
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

input[type=submit] {
    width: 30%;
    background-color: #4CAF50;
    text-align: center;
    color: white;
    padding: 14px 20px;
    margin: 8px 50px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
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
    background-image: url("img/newspaper.jpg");
    background-size: cover;
}

#lab{
    font-size: 25px;
       color: black;
    
}
</style>
    </head>
    <%
        String id="";
        if(request.getParameter("sendbutton")!=null)
        {
            String name=request.getParameter("txtmail");
            String insert="insert into tbl_admin(admin_email)values('"+name+"')";
            boolean b=obj.insert(insert);
            if(b)
            {
                out.println("succesfully inserted");
            }
              
            else
            {
               out.println("failed to insert");
            }
        }
        %>
            
        <body id="body">
    
            <%
            
                if(request.getParameter("sendbutton")!=null)
                {
                    String sel="select admin_username from tbl_admin where admin_email='"+request.getParameter("txtmail")+"'";
                    ResultSet rs=obj.select(sel);
                    if(rs.next())
                    {
                        Random r=new Random();
                        int otp=r.nextInt(1111)+999;
                        session.setAttribute("otp", otp);
                     //  
                        String to[]={request.getParameter("txtmail")};
                        String subject="New Password";
                        String newpass=rs.getString("admin_username")+"_"+otp;
                        String text=newpass;
                        
                        String update="update tbl_admin set admin_password='"+newpass+"'  where admin_email='"+request.getParameter("txtmail")+"'";
                        boolean b1=obj.insert(update);
                        
               
                                    System.out.println("try to mail");
                                    boolean b=obj1.sendMail(to, subject, text);
                                    if(b)
                                    {
                                        
                                        response.sendRedirect("MainLogin.jsp");
                                    }
                                    else
                                            {
                                                out.println("Failed");
                                            }
                        
                        
                        
                    }
                    else
                    {
                        %>
                        <script>
                            alert("Incorrect Mail Id");
                        </script>
                        <%
                    }
                }
            
            
            %>
    
    <div id="main">
        <h2 align="center" style="margin-top: 5px" >FORGET PASSWORD</h2>
        <br>
        <br>
        <br>
  <form >
      <div id="div1">
          <label for="fname" id="lab">Enter Your Mail Id</label>
          <input type="text" id="uname" name="txtmail" placeholder="Enter Email.." >
                  <input type="hidden" name="hid" value="<%=id%>">
      </div>
    <div id="div2">
    <input type="submit" name="sendbutton" value="GENERATE">
    </div>
      
    </div>
      
<footer class="footer-area section-gap">
				<div class="container">
					<div class="row">
						
						
						

					<div class="row footer-bottom d-flex justify-content-between">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            <p class="col-lg-8 col-sm-12 footer-text m-0 text-white">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a></p>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						<div class="col-lg-4 col-sm-12 footer-social">
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->		

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
			<script src="js/vendor/bootstrap.min.js"></script>
			<script src="js/jquery.ajaxchimp.min.js"></script>
			<script src="js/parallax.min.js"></script>			
			<script src="js/owl.carousel.min.js"></script>			
			<script src="js/jquery.sticky.js"></script>
			<script src="js/jquery.DonutWidget.min.js"></script>
			<script src="js/jquery.magnific-popup.min.js"></script>			
			<script src="js/main.js"></script>	
		</body>
	</html> 
       
<%@include file="Footer.jsp" %>