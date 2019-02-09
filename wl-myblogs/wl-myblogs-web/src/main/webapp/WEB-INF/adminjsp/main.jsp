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
<title>惠眼博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>

</head>

<body class="user-select">

<section class="container-fluid">
  <!--顶部导航-->
  <%@include file="../adminjsp/upsidebar.jsp" %>
  <div class="row">
  <!--左导航  -->
  <%@include file="../adminjsp/leftsidebar.jsp" %>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <h1 class="page-header">信息总览</h1>
      <div class="row placeholders">
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>文章</h4>
          <span id="articlenumber" class="text-muted"></span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>寄语</h4>
          <span id="commentnumber" class="text-muted"></span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>友链</h4>
          <span id="flinknumber" class="text-muted"></span> </div>
      </div>
    </div>
  </div>
</section>
<script src="/admin/js/bootstrap.min.js"></script> 
<script src="/admin/js/admin-scripts.js"></script>
<script src="/admin/js/leftsidebar.js"></script>
<script type="text/javascript">
 $(function(){
	 $.ajax({
		 url:"/19971224wls/GetMain.html",
		 async:true,
		 type:"POST",
		 success:function(data){
			 $("#articlenumber").html(data.articlenumber+"篇");
			 $("#commentnumber").html(data.messageboardnumber+"条");
			 $("#flinknumber").html(data.flinknumber+"个");
		 },
		 error:function(){
			 
		 },
		 dataType:"json"
	 });
 });
</script>
</body>
</html>
