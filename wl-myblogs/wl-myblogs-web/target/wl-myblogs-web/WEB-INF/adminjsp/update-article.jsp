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
<title>修改文章 - 惠眼博客管理系统</title>
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
            <h1 class="page-header">撰写新文章</h1>
            <div class="form-group" id="articletitle">
              <label for="article-title" class="sr-only">标题</label>
              <input type="text" id="article-title" name="title" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
            </div>
            <div class="form-group">
              <label for="article-content" class="sr-only">内容</label>
              <script id="article-content" name="content" type="text/plain"></script>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述</span></h2>
              <div class="add-article-box-content">
              	<textarea id="textsummary" class="form-control" name="describe" autocomplete="off"></textarea>
                <span class="prompt-text">描述是可选的手工创建的内容总结，并可以在网页描述中使用</span>
              </div>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>栏目</span></h2>
              <div class="add-article-box-content">
              <ul class="category-list" style="width:90px;float:right;margin-right:5px;" id="Classifyone">
              </ul>
              <ul class="category-list" style="width:110px; "id="Classifytwo">
                </ul>
              </div>
            </div>
            
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标题图片</span></h2>
              <div class="add-article-box-content">
                <input type="text" class="form-control" placeholder="点击按钮选择图片" id="pictureUpload" name="titlepic" autocomplete="off">
              </div>
              <div class="add-article-box-footer">
                <button class="btn btn-default" type="button" ID="upImage">选择</button>
              </div>
            </div>
            <div class="add-article-box">
             <h2 class="add-article-box-title"><span>作者：</span></h2>
              <div class="add-article-box-content">
                <input type="text" class="form-control" placeholder="文章作者" id="writer" name="titlepic" autocomplete="off">
             </div>
              <h2 class="add-article-box-title"><span>发布</span></h2>
              <div class="add-article-box-content">
              	<p><label>状态：</label><span class="article-status-display">已发布</span></p>
                <p><label>发布于：</label><span class="article-time-display"><input id="releasetime" style="border: none;" type="datetime" name="time" /></span></p>
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
<script type="text/javascript" src="/admin/adminjs/update-article.js"></script>
</body>
</html>
