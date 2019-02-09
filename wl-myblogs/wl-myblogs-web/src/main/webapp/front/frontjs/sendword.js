$(function(){
	$.post("/Article/getSendWordList.html", { "currentpage": 1, "numberpage": 9 },function(data){
		var pojo=eval("("+data+")");
		if(pojo.totanumber!=0){
			layui.use(['laypage', 'layer'], function(){
				var laypage = layui.laypage
				,layer = layui.layer;
				//总页数大于页码总数
				laypage.render({
					elem: 'demo0'
						,count: pojo.totanumber //数据总数
						,limit: 9
						,jump: function(obj){
							$.post("/Article/getSendWordList.html", { "currentpage": obj.curr, "numberpage": obj.limit},function(kind){
								var data=eval("("+kind+")");
								var sendwordlist='<ul >';
								var a=0;
								for (var i = 0; i < data.objected.length; i++) {
									a++;
									sendwordlist+='<li><i><img src="/front/images/toppic0'+a+'.jpg"></i>';
									sendwordlist+='<div><h3 style="padding-top: 8px;font-weight: bold;font-size: 25px;">'+data.objected[i].mName+'</h3>';
									sendwordlist+='<p>“'+data.objected[i].mContent+'”</p></div></li>';
									if(a==9){
										a=0;
									}
								}
								sendwordlist+='</ul>';
								$(".share").html(sendwordlist);
								$(".share li").on(     
										'mouseenter',
										function(){
											var that=this;	
											item1Timer=setTimeout(function(){
												$(that).find("div").animate({"top":0,"height":204},300,function(){
													$(that).find("p").fadeIn(200);
												});
											},100);
										}).on('mouseleave',
										function(){
											var that=this;	
											clearTimeout(item1Timer);
											$(that).find("p").fadeOut(200);
											$(that).find("div").animate({"top":75,"height":50},300);
										}
									); 
							});
						}
				});
			});
		}else{
			$(".blogsbox").html("暂无寄语(-_-)～ ");
		}
	});
	
	
});