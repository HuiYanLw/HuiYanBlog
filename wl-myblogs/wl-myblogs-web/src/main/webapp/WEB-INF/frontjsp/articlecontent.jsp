<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${ArticleContent.get(0).a_title }_惠眼个人博客 - 一个在java开发之路上奋斗的程序员个人博客网站</title>
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
<article>
  <h1 class="t_nav"><span>您现在的位置是：首页 > ${classify } > ${ArticleContent.get(0).cl_content }</span><a href="/" class="n1">网站首页</a><a href="/liftlist.html" class="n2">${classify }</a></h1>
  <div class="infosbox">
    <div class="newsview">
      <h3 class="news_title">${ArticleContent.get(0).a_title }</h3>
      <div class="bloginfo">
        <ul>
          <li class="author"><a href="javascript:void(0);">${ArticleContent.get(0).a_writer }</a></li>
          <li class="lmname"><a href="/liftlist.html">${classify }</a></li>
          <li class="timer">${ArticleContent.get(0).a_time }</li>
          <li class="view">${ArticleContent.get(0).a_read } 已阅读</li>
          <li class="like" id="Agroom">${ArticleContent.get(0).a_like }</li>
        </ul>
      </div>
      <div class="news_about"><strong>简介</strong>${ArticleContent.get(0).a_summary }</div>
      <div class="news_con"> 
         ${ArticleContent.get(0).a_content }
       <br>
       </div>
    </div>
    <div class="giveup">
      <p class="diggit" id="praise"><a href="javascript:void(0);" onclick="praised(${ArticleContent.get(0).a_id })">很赞哦！</a>(<b id="diggnum">${ArticleContent.get(0).a_like }</b>)</p>
    </div>
    <div class="nextinfo">
      <p>上一篇：<a href="javascript:void(0);" onclick="readinges(${ArticleContent.get(1).a_id })">${ArticleContent.get(1).a_title }</a></p>
      <p>下一篇：<a href="javascript:void(0);" onclick="readinges(${ArticleContent.get(2).a_id })">${ArticleContent.get(2).a_title }</a></p>
    </div>
    <script>
      	var ifpraised=true;
      	function praised (aId) {
      		if(ifpraised){
	      		$.post("/Article/addLikeNumber.html", { "aId": aId },function(data){
	      			var pojo=eval("("+data+")");
	      			//alert(pojo.data.a_like);
		      		$("#diggnum").html(pojo.data.a_like);
		      		$("#Agroom").html(pojo.data.a_like);
	      		});
	      		ifpraised=false;
      		}else{
      			layer.msg('感谢点赞，一次就够啦(^.^)');
      		}
      	}
      	function readinges(aId){
      		var Num=""; 
    		for(var i=0;i<10;i++) 
    		{ 
    			Num+=Math.floor(Math.random()*10); 
    		} 
    		if(aId==undefined){
    			return;
    		}else{
	      		window.location.href="/Article/GetArticleContent/"+Num+aId+".html";
    		}
      	}
      	//禁用F5刷新
		document.onkeydown = function (event)
		{
      		
			if((event.keyCode==8)||                    //屏蔽退格删除键    
				    (event.keyCode==116)||                   //屏蔽F5刷新键   
					(event.ctrlKey && event.keyCode==82)){   //Ctrl+R   
						  event.cancelBubble = true;
					     return false; 
				} 
		}
		//禁止右键弹出菜单
		document.oncontextmenu = function () {
		    return false;
		}
      </script>
    <div class="news_pl">
      <!--PC和WAP自适应版-->
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
  </div>
 <div class="sidebar">
    <div class="zhuanti">
      <h2 class="hometitle">特别推荐</h2>
    </div>
    <div class="tuijian" id="zuixin">
      <h2 class="hometitle">最新文章</h2>
    </div>
    <div class="tuijian" id="dianji">
      <h2 class="hometitle">点击排行</h2>
    </div>
    <div class="guanzhu" id="follow-us">
      <h2 class="hometitle">关注我们 么么哒！</h2>
      <ul>
      	<li class="sina"><a href="javascript:void(0)" target="_blank"><span>网名</span>惠眼世界</a></li>
      	<li class="tencent"><a href="javascript:void(0)" target="_blank"><span>职业</span>java程序员，WEB前端爱好者</a></li>
        <li class="qq"><a href="javascript:void(0)" target="_blank"><span>QQ号</span>1976637391</a></li>
        <li class="email"><a href="javascript:void(0)" target="_blank"><span>邮箱帐号</span>1976637391@qq.com</a></li>
        <li class="wxgzh"><a href="javascript:void(0)" target="_blank"><span>微信号</span>sd3181778808</a></li>
        <li class="wx"><img src="/front/images/weixin.jpg"></li>
      </ul>
    </div>
  </div>
</article>
<footer>
  <p>Design by <a href="http://www.huiyanlw.cn" target="_blank">惠眼个人博客</a> <a href="http://www.miitbeian.gov.cn/">粤ICP备18074873号-1</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
<script type="text/javascript" src="/front/frontjs/articleright.js"></script>
</body>
</html>