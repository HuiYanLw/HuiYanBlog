<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页_惠眼个人博客 - 一个在java开发之路上奋斗的程序员个人博客网站</title>
<meta name="keywords" content="个人博客,惠眼博客,个人博客系统" />
<meta name="description" content="惠眼个人博客 — 一个在java开发之路上奋斗的程序员个人博客网站。" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="/front/font/expressioned.ico" type="/front/img/x-ico" />
<link href="/front/css/base.css" rel="stylesheet">
<link href="/front/css/index.css" rel="stylesheet">
<link href="/front/css/m.css" rel="stylesheet">
<script src="/front/js/jquery.min.js" type="text/javascript"></script>
<script src="/front/js/jquery.easyfader.min.js"></script>
<script src="/front/js/scrollReveal.js"></script>
<script src="/front/js/common.js"></script>
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
<div class="pagebg ab"> </div>
<div class="container">
  <h1 class="t_nav"><span>像“草根”一样，紧贴着地面，低调的存在，冬去春来，枯荣无恙。</span><a href="index.html" class="n1">网站首页</a><a href="javascript:void(0)" class="n2">关于我</a></h1>
  <div class="news_infos">
    <ul>
      <p>嗯，我是从大学才开始接触编程的，反正当初选专业的时候就稀里糊涂的选了计算机专业，学的是java语言，这也算是一种缘分吧。大学里两年多“孜孜不倦”地学习终于从IT菜鸡上升到IT菜鸟程度啦！
从第一句"Hello world!"到现在的博客上线，一路磕磕碰碰，从这个坑跳进另一个坑，但也收获良多。<br />
        <br />
        我并不厉害，逻辑思维也不强，所以学起来简直要命。当初写一个计算器，我同学只用两百多行代码，而我却用近四百行代码，这就是差距。七七四十九行，行行都有强弱之分，编程我是比别人弱，
但我就是喜欢，喜欢为一个功能绞尽脑汁最后实现出来的过程。同样的我也羡慕别人厉害，人家越强我就越要努力！<br />
        <br />
        我相信“人生最遗憾的事，从来都不是失败，而是我本可以！”<br />
        <br />
      <h2>About my blog</h2>
      &nbsp;
      <p>我的博客共修改了三次；
      	<br />
				第一次是用JavaWeb基础jsp+servlet实现后端数据交互，前端基于LAO王博客模板做一些修改;<br />
				第二次是使用SpringMVC+Redis+Mybatis+Spring框架实现后端服务，前端不变；<br />
				第三次整体框架不变，将代码进行优化，前端使用青青姐的模板；<br />
      </p>
      <br />
      <p>域 名：http://www.huiyanlw.cn&nbsp;&nbsp;注册于2018年06月21日&nbsp;</p>
      <br />
      <p>服务器：腾讯云服务器&nbsp;</p>
      <br />
      <p>备案号： 粤ICP备18074873号-1</p>
      <br />
      <p>博客内容主要涉及编程语言、服务端开发、一些热门技术及个人生活点滴记录等方面，同时分享实用的学习和开发资料。</p>
    </ul>
  </div>
  <div class="sidebar">
    <div class="about">
      <p class="avatar"> <img src="/front/images/lizhi2.jpg" alt=""> </p>
      <p class="abname">炜龙</p>
      <p class="abposition">Web后端开发</p>
      <p class="abtext"> 一个在IT之路刚起步的菜鸟！喜欢编程，但无奈技术还是太菜，没关系，路还很长，一步一个脚印，慢慢沉淀，缓缓提升。 </p>
    </div>
    <div class="weixin">
      <h2 class="hometitle">微信关注</h2>
      <ul>
        <img src="/front/images/huiyanwx.jpg">
      </ul>
    </div>
  </div>
</div>
<footer>
  <p>Design by <a href="http://www.huiyanlw.cn" target="_blank">惠眼个人博客</a> <a href="http://www.miitbeian.gov.cn/">粤ICP备18074873号-1</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
</body>
</html>