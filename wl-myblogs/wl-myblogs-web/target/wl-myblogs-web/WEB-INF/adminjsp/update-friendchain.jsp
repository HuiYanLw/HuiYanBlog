<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>修改友情链接 - 惠眼博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>
<!--[if gte IE 9]>
  <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="js/html5shiv.min.js" type="text/javascript"></script>
  <script src="js/respond.min.js" type="text/javascript"></script>
  <script src="js/selectivizr-min.js" type="text/javascript"></script>
<![endif]-->
<!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
<![endif]-->
</head>

<body class="user-select">

<section class="container-fluid">
   <!--顶部导航-->
  <%@include file="../adminjsp/upsidebar.jsp" %>
  <div class="row">
   <!--左导航  -->
    <%@include file="../adminjsp/leftsidebar.jsp" %>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <div class="row">
        <form action="/19971224wls/Friendchain/UpdateFriendchainIng.html" method="post" class="add-flink-form" autocomplete="off" draggable="false">
          <div class="col-md-9">
            <h1 class="page-header">修改友情链接</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>名称</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="flink-name" name="Fname" class="form-control" placeholder="在此处输入名称" required autofocus autocomplete="off">
                <input type="text" style="display:none;" name="fId" id="f_id">
                <span class="prompt-text">例如：惠眼技术博客</span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>WEB地址</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="flink-url" name="Furl" class="form-control" placeholder="在此处输入URL地址" required autocomplete="off">
                <span class="prompt-text">例子：<code>http://www.ylsat.com/</code>——不要忘了<code>http://</code></span> </div>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>保存</span></h2>
              <div class="add-article-box-content">
                <p>
                  <label>状态：</label>
                  <span class="article-status-display">已发布</span></p>
              </div>
              <div class="add-article-box-footer">
                <button class="btn btn-primary" type="submit" name="submit">修改</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>
<script src="/admin/js/bootstrap.min.js"></script> 
<script src="/admin/js/admin-scripts.js"></script>
<script type="text/javascript">
 $(function(){
	 var C1=window.location.href.split("/")[5];
	 var fId=C1.split(".")[0];
	 $.ajax({
		 url:"/19971224wls/Friendchain/UpdateFriendchain.html",
		 async:true,
		 type:"POST",
		 data:{"fId":fId},
		 success:function(pojo){
			 if(pojo.status==200){
				 $("#flink-name").val(pojo.data.fName);
				 $("#flink-url").val(pojo.data.fUrl);
				 $("#f_id").val(pojo.data.fId);
			 }
		 },
		 error:function(){
			 
		 },
		 dataType:"json"
	 });
 });
</script>
</body>
</html>