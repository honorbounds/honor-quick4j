<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>智能导盲系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<link
	href="https://cdn.bootcss.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://cdn.bootcss.com/animate.css/3.5.2/animate.css"
	rel="stylesheet">
<link href="./assests/style.css" rel="stylesheet" type='text/css'>


<!-- Modernizr JS -->
<script src="./js/modernizr.min.js"></script>
<script src="./js/respond.min.js"></script>

</head>

<body class="style-2">

	<div class="container">

		<div class="row">
			<div class="col-md-4">


				<!-- Start Sign In Form -->
				<form name="form1" action="Login/signTo.do"
					class="fh5co-form animate-box" data-animate-effect="fadeInLeft"
					method="post">
					<h2>登录</h2>
					<div class="form-group">
						<label for="username" class="sr-only">用户名</label> <input
							type="text" class="form-control" name="username" id="username"
							placeholder="Username" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">密码</label> <input
							type="password" class="form-control" name="pass" id="pass"
							placeholder="Password" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember">
							记住我</label>
					</div>
					<div class="form-group">
						<p>
							没有账号? <a href="SignUp.jsp">点击立即注册</a> |
						</p>
					</div>
					<div class="form-group">
						<input type="submit" id="signto" value="登录"
							class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->

			</div>
		</div>
		<div class="row" style="padding-top: 60px; clear: both;">
			<div class="col-md-12 text-center">
				<p>
					<small>&copy; 版权所有 <a href="#" target="_blank" title="林孟林">林孟林</a>
						设置来自<a href="#" title="王布斯" target="_blank">王布斯</a></small>
				</p>
			</div>
		</div>
	</div>

	<!-- jQuery -->
	<script src="./js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="./js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="./js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="./js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="./js/main.js"></script>
	<script src="./js/Login.js"></script>
	<script type="text/javascript">

</script>
</body>

</html>
