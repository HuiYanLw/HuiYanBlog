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
<title>记录状态 - 惠眼博客管理系统</title>
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
        <form action="/Article/add" method="post" class="add-article-form">
          <div class="col-md-9">
            <h1 class="page-header">记录新心情</h1>
            <div class="form-group">
              <label for="article-content" class="sr-only">内容</label>
              <script id="article-content" name="content" type="text/plain"></script>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>发布</span></h2>
              <div class="add-article-box-content">
              	<p><label>状态：</label><span class="article-status-display">未发布</span></p>
              </div>
              <div class="add-article-box-footer">
                <button class="btn btn-primary" type="button" name="submit" id="release">发布</button>
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
<script src="/baidueditor/ueditor/ueditor.config.js"></script> 
<script src="/baidueditor/ueditor/ueditor.all.min.js"> </script> 
<script src="/baidueditor/ueditor/lang/zh-cn/zh-cn.js"></script>  
<script type="text/javascript" src="/admin/plugin/layer/3.0/layer.js"></script>
<script id="uploadEditor" type="text/plain" style="display:none;"></script>
<script type="text/javascript" src="/admin/adminjs/add-mood.js"></script>
</body>
</html>
