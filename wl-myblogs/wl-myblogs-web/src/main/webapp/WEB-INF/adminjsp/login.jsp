<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>登录 — 一个在java开发之路上奋斗的程序员个人博客网站</title>
<link rel="stylesheet" href="/admin/logincss/normalize.css">
<link rel="stylesheet" href="/admin/logincss/login.css">
<link rel="stylesheet" href="/admin/logincss/sign-up-login.css">
<link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/admin/logincss/inputEffect.css" />
<link rel="stylesheet" href="/admin/logincss/tooltips.css" />
<link rel="stylesheet" href="/admin/logincss/spop.min.css" />
<link rel="stylesheet" type="text/css" href="/admin/css/layui.css" >
<link rel="stylesheet" href="/admin/logincss/bootstrap.css" />
<LINK rel="Bookmark" href="/admin/images/icon/favicon.ico" >
<LINK rel="Shortcut Icon" href="/admin/images/icon/favicon.ico" />
<script src="/admin/loginjs/jquery.min.js"></script>
<script type="text/javascript" src="/admin/plugin/layer/3.0/layer.js"></script>
<script src="/admin/loginjs/snow.js"></script>
<script src="/admin/loginjs/jquery.pure.tooltips.js"></script>
<script src="/admin/loginjs/spop.min.js"></script>
<script type="text/javascript" src="/admin/loginjs/bootstrap.js" ></script>
<script type="text/javascript" src="/admin/adminjs/login.js"></script>
<style type="text/css">
html{width: 100%; height: 100%;}

body{

	background-repeat: no-repeat;

	background-position: center center #2D0F0F;

	background-color: #00BDDC;

	background-image: url(/admin/images/dongman.jpg);

	background-size: 100% 100%;

}

.snow-container { position: fixed; top: 0; left: 0; width: 100%; height: 100%; pointer-events: none; z-index: 100001; }
.main{
    border-radius: 20px;
    width: 300px;
    height: 350px;
    margin: auto;
    margin-top: 222px;
    
}
</style>
</head>
<body>
	<!-- 雪花背景 -->
	<div class="snow-container"></div>
	<!-- 登录控件 -->
	<div id="login">
		<input id="tab-1" type="radio" name="tab" class="sign-in hidden" checked />
		<input id="tab-2" type="radio" name="tab" class="sign-up hidden" />
		<input id="tab-3" type="radio" name="tab" class="sign-out hidden" />
		<div class="wrapper">
			<!-- 登录页面 -->
			<div class="login sign-in-htm">
				<div class="main">
					<!--<input class="btn btn-default" type="button" value="登录" onclick="goto_forget()"/>-->
						<button type="button" class="btn btn-default btn-lg visible-xs" onclick="goto_forget()" style="background: none">
	  						<span class="glyphicon glyphicon-user" aria-hidden="true" ></span> 登录
						</button>
						<button type="button" class="btn btn-default btn-lg hidden-xs" onclick="goto_forget()" style="background: none;margin-left: 52px;margin-top: 290px;">
	  						<span class="glyphicon glyphicon-user" aria-hidden="true" style="color: white;" ></span> <font color="white">登录</font>
						</button>
				</div>
			</div>
			<div class="login sign-out-htm">
				<form class="container offset1 loginform" id="demeform">
					<!-- 猫头鹰控件 -->
					<div id="owl-login" class="login-owl">
						<div class="hand"></div>
						<div class="hand hand-r"></div>
						<div class="arms">
							<div class="arm"></div>
							<div class="arm arm-r"></div>
						</div>
					</div>
					<div class="pad input-container">
						<section class="content">
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="text" id="login-username" name="username"
									autocomplete="off" placeholder="请输入用户名" tabindex="1" maxlength="15" />
								<label class="input__label input__label--hideo" for="login-username">
									<i class="fa fa-fw fa-user icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="password" name="password" id="login-password" placeholder="请输入密码" tabindex="2" maxlength="18"/>
								<label class="input__label input__label--hideo" for="login-password">
									<i class="fa fa-fw fa-lock icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
						</section>
					</div>
					<div class="form-actions">
						<a tabindex="4" class="btn pull-left btn-link text-muted" onClick="goto_login()">返回</a>
						<a tabindex="4" class="btn pull-left btn-link text-muted" href="/index.html">惠眼博客主页面</a>
						<input class="btn btn-primary" type="button" tabindex="3" onClick="login()" value="登录" 
							style="color:white;"/>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>