<%-- 
    Document   : index
    Created on : Aug 29, 2018, 12:10:51 PM
    Author     : Mariya
--%>
<%@include file="Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="database.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
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
                                                        <li><a href="Homepage.jsp">HomePage</a></li>
                                                            <li><a href="advertise.jsp">Advertisement</a></li>
                                                             <li><a href="Place.jsp">Place</a></li>
                                                              <li><a href="TrackPaperboy.jsp">Track</a></li>
                                                                <li><a href="viewcomplt.jsp">Complaints</a></li>
                                                                
                                                                 <li class="dropdown">
							      <a class="dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
							        VIEW
							      </a>
							      <div class="dropdown-menu">
                                                                  <a class="dropdown-item" href="Booking.jsp">Booking</a>
                                                                  <a class="dropdown-item" href="Payment.jsp">Payment</a>
                                                                  <a class="dropdown-item" href="ViewPaperboy.jsp">PaperBoy</a>
                                                                   <a class="dropdown-item" href="Route.jsp">Route</a>
                                                                  <a class="dropdown-item" href="AcceptedPaperboy.jsp">Assign</a>
							      </div>
							    </li>	
                                                                
                                                                
                                                                <li class="dropdown">
                                                                    <a class="dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                                                                     Product   
                                                                    </a>
                                                                    <div class="dropdown-menu">
                                                                        <a class="dropdown-item" href="Item.jsp">Item</a>
                                                                        <a class="dropdown-item" href="Plan.jsp">Plan</a>
                                                                         <a class="dropdown-item" href="language.jsp">Language</a>
                                                                        <a class="dropdown-item" href="Product.jsp">Product</a>
                                                                        <a class="dropdown-item" href="Productplan.jsp">Product Plan</a>
                                                                   </div></li>
                                                                
								
							    <li class="dropdown">
							      <a class="dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
							        Settings
							      </a>
							      <div class="dropdown-menu">
                                                                  <a class="dropdown-item" href="ChangePass.jsp">change password</a>
                                                                  <a class="dropdown-item" href="../../Guest/Creative/MainLogin.jsp">Logout</a>
							      </div>
							    </li>									
						    </ul>
						  </div>							
					</div>
				</nav>
			</header>
                        
                        <section class="banner-area relative" id="home" data-parallax="scroll" data-image-src="img/newspaper.jpg">
				<div class="overlay-bg overlay"></div>
				<div class="container">
					<div class="row fullscreen  d-flex align-items-center justify-content-end">
						<div class="banner-content col-lg-6 col-md-12">
							<h1>
								 <br>
                                                                <span>NewsWay</span> <br>
								 <span>Tracker</span>							
							</h1>
                                                    
						</div>												
					</div>
				</div>
			</section>
			<!-- End banner Area -->	

			
			<!-- start service Area-->
			

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