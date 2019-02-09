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
<title>文章 - 惠眼博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/layui.css" >
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
</head>

<body class="user-select">


<section class="container-fluid">
  <!--顶部导航-->
  <%@include file="../adminjsp/upsidebar.jsp" %>
  <div class="row">
   <!--左导航  -->
    <%@include file="../adminjsp/leftsidebar.jsp" %>
    
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <form action="" method="post" >
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li><a href="/19971224wls/addArticle.html">增加文章</a></li>
        </ol>
        <h1 class="page-header">管理</h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">栏目</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-tag"></span> <span class="visible-lg">点赞量</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-comment"></span> <span class="visible-lg">阅读量</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <div class="btn-toolbar operation" role="toolbar">
              <div class="btn-group" role="group"> <a class="btn btn-default" onClick="select()">全选</a> <a class="btn btn-default" onClick="reverse()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
              <div class="btn-group" role="group">
                <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" name="checkbox_delete" onclick="Deteltlist()">删除</button>
              </div>
            </div>
            <div id="demo11" style="position: relative;float: right;"></div>
          </nav>
        </footer>
      </form>
    </div>
  </div>
</section>
<script type="text/javascript" src="/admin/plugin/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/admin/plugin/layer/3.0/layer.js"></script>
<script src="/admin/js/layui.js" charset="utf-8"></script>
<script src="/admin/js/bootstrap.min.js"></script> 
<script src="/admin/js/admin-scripts.js"></script> 

<script src="/admin/js/leftsidebar.js"></script>
<script type="text/javascript" src="/admin/adminjs/articlelist.js"></script>
<script>

</script>
</body>
</html>
