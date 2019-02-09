$(function (){
	$.post("/Article/GettimeList.html", { "currentpage": 1, "numberpage": 20 },function(domain){
		var pojo=eval("("+domain+")");
		if($(window).width()<1000){
			layui.use(['laypage', 'layer'], function(){
				  var laypage = layui.laypage
				  ,layer = layui.layer;
				  //总页数大于页码总数
				  laypage.render({
				    elem: 'demo0'
				    ,count: pojo.totanumber //数据总数
				    ,limit:20
				    ,jump: function(obj){
				    	$.post("/Article/GettimeList.html", { "currentpage": obj.curr, "numberpage": obj.limit},function(data){
				    		var kind=eval("("+data+")");
				    		var timelist='';
				    		for (var i = 0; i < kind.objected.length; i++) {
								timelist+='<li><span>'+kind.objected[i].moTime+'</span><a href="javascript:void(0)">'+kind.objected[i].moContent+'</a></li>';
							}
	 			    		$("#list").html(timelist);
				    	});
				    }
				  });
				});
		}else{
			layui.use(['laypage', 'layer'], function(){
				  var laypage = layui.laypage
				  ,layer = layui.layer;
				  //总页数大于页码总数
				  laypage.render({
				    elem: 'demo1'
				    ,count: pojo.totanumber //数据总数
				    ,limit:20
				    ,jump: function(obj){
				    	$.post("/Article/GettimeList.html", { "currentpage": obj.curr, "numberpage": obj.limit},function(data){
				    		var kind=eval("("+data+")");
				    		var timelist='';
				    		for (var i = 0; i < kind.objected.length; i++) {
								timelist+='<li><span>'+kind.objected[i].moTime+'</span><a href="javascript:void(0)">'+kind.objected[i].moContent+'</a></li>';
							}
	 			    		$("#list").html(timelist);
				    	});
				    }
				  });
				});
		}
	});
	
});