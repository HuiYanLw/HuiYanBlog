<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>留言_惠眼个人博客 - 一个在java开发之路上奋斗的程序员个人博客网站</title>
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
      <li><a href="about.html">关于我</a> </li>
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
      <li><a href="time.html">时间轴</a> </li>
      <li><a href="gbook.html">留言</a> </li>
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
      <dt class="list_dt"> <a href="time.html">时间轴</a> </dt>
      <dt class="list_dt"> <a href="gbook.html">留言</a> </dt>
    </dl>
  </div>
  <!--mnav end-->
</header>
<div class="pagebg gl"> </div>
<div class="container">
  <h1 class="t_nav"><span>你，我生命中一个重要的过客，我们之所以是过客，因为你未曾会为我停留。</span><a href="/" class="n1">网站首页</a><a href="javascript:void(0);" class="n2">留言</a></h1>
  <div class="news_infos">
     <div id="SOHUCS" sid="${ArticleContent.get(0).a_id }" ></div> 
<script type="text/javascript"> 
(function(){ 
var appid = 'cyu13QpNH'; 
var conf = 'prod_2c2c1aa469755a17894448bc885fad9a'; 
var width = window.innerWidth || document.documentElement.clientWidth; 
if (width < 960) { 
	window.document.write('<script id="changyan_mobile_js" charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/mobile/wap-js/changyan_mobile.js?client_id=' + appid + '&conf=' + conf + '"><\/script>'); 
} 
else 
{ 
	var loadJs=function(d,a){var c=document.getElementsByTagName("head")[0]||document.head||document.documentElement;
	var b=document.createElement("script");
	b.setAttribute("type","text/javascript");
	b.setAttribute("charset","UTF-8");
	b.setAttribute("src",d);
	if(typeof a==="function")
	{
		if(window.attachEvent){
			b.onreadystatechange=function(){
				var e=b.readyState;if(e==="loaded"||e==="complete"){
						b.onreadystatechange=null;
						a();
					}
				}
			}else{
				b.onload=a
				}
		}
		c.appendChild(b)};loadJs("http://changyan.sohu.com/upload/changyan.js",function(){window.changyan.api.config({appid:appid,conf:conf})}); 
} })();
</script>
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