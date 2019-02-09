$(function(){
	$.post("/Article/GetArticleListByClassifyId.html", { "currentpage": 1, "numberpage": 10 ,"cl_category":2},function(data){
		var pojo=eval("("+data+")");
		layui.use(['laypage', 'layer'], function(){
			  var laypage = layui.laypage
			  ,layer = layui.layer;
			  //总页数大于页码总数
			  laypage.render({
			    elem: 'demo0'
			    ,count: pojo.totanumber //数据总数
			    ,jump: function(obj){
			    	$.post("/Article/GetArticleListByClassifyId.html", { "currentpage": obj.curr, "numberpage": obj.limit,"cl_category":2},function(kind){
			    		var Num=""; 
			    		for(var i=0;i<10;i++) 
			    		{ 
			    			Num+=Math.floor(Math.random()*10); 
			    		}
			    		var data=eval("("+kind+")");
			    		var articlelist='';
			    		for (var i = 0; i < data.objected.length; i++) {
			    			if(data.objected[i].a_img!=null&&data.objected[i].a_img!=""){
			    				articlelist+='<div class="blogs" data-scroll-reveal="enter bottom over 1s" >';
			    				articlelist+='<h3 class="blogtitle"><a href="/Article/GetArticleContent/'+Num+data.objected[i].a_id+'.html">'+data.objected[i].a_title+'</a></h3>';
			    				articlelist+='<span class="blogpic"><a href="javascript:void(0)" title=""><img src="'+data.objected[i].a_img+'" alt=""></a></span>';
			    				var summary=data.objected[i].a_summary;
			    				if(summary.length>60){
			    					articlelist+='<p class="blogtext">'+data.objected[i].a_summary.substring(0,60)+'...</p>';
			    				}else{
			    					articlelist+='<p class="blogtext">'+data.objected[i].a_summary+'</p>';
			    				}
			    				articlelist+='<div class="bloginfo"><ul>';
			    				articlelist+='<li class="author"><a href="javascript:void(0)">'+data.objected[i].a_writer+'</a></li>';
			    				articlelist+='<li class="lmname"><a href="javascript:void(0)">'+data.objected[i].cl_content+'</a></li>';
			    				articlelist+='<li class="timer">'+data.objected[i].a_time+'</li>';
			    				articlelist+='<li class="view"><span>'+data.objected[i].a_read+'</span> 阅读</li>';
			    				articlelist+='<li class="like">'+data.objected[i].a_like+'</li>';
			    				articlelist+='</ul></div></div>';
			    			}else{
			    				articlelist+='<div class="blogs" data-scroll-reveal="enter bottom over 1s" >';
			    				articlelist+='<h3 class="blogtitle"><a href="/Article/GetArticleContent/'+Num+data.objected[i].a_id+'.html" >'+data.objected[i].a_title+'</a></h3>';
			    				var nosummary=data.objected[i].a_summary;
			    				if(nosummary.length>80){
			    					articlelist+='<p class="blogtext">'+data.objected[i].a_summary.substring(0,80)+'...</p>';
			    				}else{
			    					articlelist+='<p class="blogtext">'+data.objected[i].a_summary+'</p>';
			    				}
			    				articlelist+='<div class="bloginfo"><ul>';
			    				articlelist+='<li class="author"><a href="javascript:void(0)">'+data.objected[i].a_writer+'</a></li>';
			    				articlelist+='<li class="lmname"><a href="javascript:void(0)">'+data.objected[i].cl_content+'</a></li>';
			    				articlelist+='<li class="timer">'+data.objected[i].a_time+'</li>';
			    				articlelist+='<li class="view">'+data.objected[i].a_read+' 阅读</li>';
			    				articlelist+='<li class="like">'+data.objected[i].a_like+'</li>';
			    				articlelist+='</ul></div></div>';
			    			}
			    		}
			    		$("#blogsbox_liftalertlist").html(articlelist); 
			    	});
			    }
			  });
			});
	});
});