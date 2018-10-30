<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Minimal and Clean Sign up / Login and Forgot Form by
	FreeHTML5.co</title>
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

<link rel="stylesheet" href="./assests/bootstrap.min.css">
<link rel="stylesheet" href="./assests/animate.css">
<link rel="stylesheet" href="./assests/style.css">

<!-- Modernizr JS -->
<script src="./js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body class="style-2">

	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center"></div>
		</div>
		<div class="row">
			<div class="col-md-4">


				<!-- Start Sign In Form -->
				<form action="#" name="form1" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft">
					<h2>注册</h2>
					<div class="form-group">
						<div class="alert alert-success" role="alert">Your info has
							been saved.</div>
					</div>
					<div class="form-group">
						<label for="name" class="sr-only">用户名</label> <input type="text"
							class="form-control" id="username" name="username"
							placeholder="用户名" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="pass" class="sr-only">密码</label> <input
							type="password" class="form-control" id="pass" name="pass"
							placeholder="密码" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="re-password" class="sr-only">重复密码</label> <input
							type="password" class="form-control" id="re-password"
							placeholder="重复密码" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="name" class="sr-only">姓名</label> <input type="text"
							class="form-control" id="name" placeholder="姓名"
							autocomplete="off">
					</div>
					<div class="form-group"
						style="border-bottom: 1px solid rgba(0, 0, 0, 0.1);padding: 6px 0;height:50px">
						<label>性别：</label>
						<div style="display: inline-block;vertical-align: middle;">
							<input style="margin-left:10px" type="radio" value="0" name="sex"><span
								style="margin-left:5px;">女</span> <input
								style="margin-left:10px" type="radio" value="1" name="sex">
							<sapn style="margin-left:5px;">男</span>
						</div>
					</div>
					<div class="form-group">
						<label for="birthday" class="sr-only">生日</label> <input
							type="email" class="form-control" id="birthday" name="birthday"
							placeholder="生日" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">邮箱</label> <input type="email"
							class="form-control" id="email" placeholder="邮箱"
							autocomplete="off">
					</div>
					<div class="form-group">
						<label for="phone" class="sr-only">电话</label> <input type="email"
							class="form-control" id="phone" name="phone" placeholder="电话"
							autocomplete="off">
					</div>


					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember">
							记住我</label>
					</div>
					<div class="form-group">
						<p>
							已有账号? <a href="Login.jsp">点击登录</a>
						</p>
					</div>
					<div class="form-group">
						<input type="submit" id="signto" value="注册"
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

</body>
</html>
