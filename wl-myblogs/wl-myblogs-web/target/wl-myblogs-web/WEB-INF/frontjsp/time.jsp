<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>时间轴_惠眼个人博客 - 一个在java开发之路上奋斗的程序员个人博客网站</title>
<meta name="keywords" content="个人博客,惠眼博客,个人博客系统" />
<meta name="description" content="惠眼个人博客 — 一个在java开发之路上奋斗的程序员个人博客网站。" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="/front/font/expressioned.ico" type="/front/img/x-ico" />
<link rel="stylesheet" href="/front/css/layui.css" />
<link href="/front/css/base.css" rel="stylesheet">
<link href="/front/css/index.css" rel="stylesheet">
<link href="/front/css/m.css" rel="stylesheet">
<script src="/front/js/jquery.min.js" type="text/javascript"></script>
<script src="/front/js/jquery.easyfader.min.js"></script>
<script src="/front/js/scrollReveal.js"></script>
<script src="/front/js/common.js"></script>
<script src="/front/js/page.js"></script>
<script type="text/javascript" src="/front/layer/3.0/layer.js" ></script>
<script type="text/javascript" src="/front/js/layui.js" ></script>
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<header> 
    <!--menu begin-->
  <!--pc版-->
  <div class="menu">
    <nav class="nav" id="topnav">
      <h1 class="logo"><a href="http://www.yangqq.com"><img src="/front/images/huiyan.png" style="padding-top: 17px;"/></a></h1>
      <li><a href="/">网站首页</a> </li>
      <li><a href="/about.html">关于我</a> </li>
      <li><a href="/skilllist.html">学无止境</a>
        <ul class="sub-nav">
          <li><a href="/getTakenotes.html">心得笔记</a></li>
          <li><a href="/getCSS3Html5.html">CSS3|Html5</a></li>
          <li><a href="/getWebprogramming.html">web编程</a></li>
          <li><a href="/getMysqloperation.html">数据库操作</a></li>
        </ul>
      </li>
      <li><a href="/liftlist.html">慢生活</a>
        <ul class="sub-nav">
          <li><a href="/getLiferecord.html">生活随笔</a></li>
          <li><a href="/getEnjoyreading.html">美文欣赏</a></li>
          <li><a href="/getProgrammedlife.html">程序人生</a></li>
          <li><a href="/getClassicquotations.html">经典语录</a></li>
        </ul>
      </li>
      <li><a href="/sendword.html">心灵寄语</a></li>
      <li><a href="/time.html">时间轴</a> </li>
      <li><a href="/gbook.html">留言</a> </li>
      <!--search begin-->
      <div id="search_bar" class="search_bar">
        <form  id="searchform" action="[!--news.url--]e/search/index.php" method="post" name="searchform">
          <input class="input" placeholder="想搜点什么呢..." type="text" name="keyboard" id="keyboard">
          <input type="hidden" name="show" value="title" />
          <input type="hidden" name="tempid" value="1" />
          <input type="hidden" name="tbname" value="news">
          <input type="hidden" name="Submit" value="搜索" />
          <span class="search_ico"></span>
        </form>
      </div>
      <!--search end--> 
    </nav>
  </div>
  <!--menu end--> 
  <!--mnav begin-->
  <!--移动端版-->
  <div id="mnav">
    <h2><a href="http://www.yangqq.com" class="mlogo"><img src="/front/images/huiyan.png" /></a><span class="navicon"></span></h2>
    <dl class="list_dl">
      <dt class="list_dt"> <a href="/">网站首页</a> </dt>
      <dt class="list_dt"> <a href="about.html">关于我</a> </dt>
      <dt class="list_dt"> <a href="#">学无止境</a> </dt>
      <dd class="list_dd">
        <ul>
         <li><a href="/getTakenotes.html">心得笔记</a></li>
          <li><a href="/getCSS3Html5.html">CSS3|Html5</a></li>
          <li><a href="/getWebprogramming.html">web编程</a></li>
          <li><a href="/getMysqloperation.html">数据库操作</a></li>
        </ul>
      </dd>
      <dt class="list_dt"> <a href="#">慢生活</a> </dt>
      <dd class="list_dd">
        <ul>
          <li><a href="/getLiferecord.html">生活随笔</a></li>
          <li><a href="/getEnjoyreading.html">美文欣赏</a></li>
          <li><a href="/getProgrammedlife.html">程序人生</a></li>
          <li><a href="/getClassicquotations.html">经典语录</a></li>
        </ul>
      </dd>
      <dt class="list_dt"> <a href="/sendword.html">心灵寄语</a> </dt>
      <dt class="list_dt"> <a href="/time.html">时间轴</a> </dt>
      <dt class="list_dt"> <a href="/gbook.html">留言</a> </dt>
    </dl>
  </div>
  <!--mnav end-->  
</header>
<div class="pagebg timer"> </div>
<div class="container">
  <h1 class="t_nav"><span>时光飞逝，机会就在我们眼前，何时找到了灵感，就要把握机遇，我们需要智慧和勇气去把握机会。</span><a href="/" class="n1">网站首页</a><a href="javascript:void(0);" class="n2">时间轴</a></h1>
  <div class="timebox">
  <ul id="list" >
    </ul>
  <!--分页插件-->
   <div id="demo1" style="margin-left: 172px"></div>
   <div id="demo0"></div>
  <script src="js/page2.js"></script> 
  </div>
</div>
<footer>
  <p>Design by <a href="http://www.huiyanlw.cn" target="_blank">惠眼个人博客</a> <a href="http://www.miitbeian.gov.cn/">粤ICP备18074873号-1</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
<script type="text/javascript" src="/front/frontjs/time.js"></script>

</body>
</html>