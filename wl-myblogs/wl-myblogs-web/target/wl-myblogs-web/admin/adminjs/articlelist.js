/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */
$(function(){   
	
	/*获取文章列表
	*/
	$.ajax({
     	url:"/19971224wls/EditArticle/getArticleListToAdmin.html",
     	async:true,
     	type:"POST",
     	data:{"currentpage":1,"numberpage":10},
     	success:function(data){
     		layui.use(['laypage', 'layer'], function(){
     	    	  var laypage = layui.laypage
     	    	  ,layer = layui.layer;
     	    	  laypage.render({
           			elem: 'demo11'   //获得分页容器Id
           		    ,count: data.totanumber      //从后台获取总的数据量
           		    ,limit: 10             //每页显示的数据量
           		    ,curr: 1
           		    ,theme: '#1E9FFF'   //当前页按钮的样式
           		    ,layout: ['count','prev', 'page', 'next']  //自定义页面排版，count：显示总条数；prev：显示上一页；page：加载页码条数；next：显示下一页；skip：显示跳转功能
           		    ,jump: function(obj){    //点击页面数触发函数
           		    	 $.ajax({
           		        	url:"/19971224wls/EditArticle/getArticleListToAdmin.html",
           		        	async:true,
           		        	type:"POST",
           		        	data:{"currentpage":obj.curr,"numberpage":10},
           		        	success:function(data){
 	           		        	 var hotarticles='';
 	           		        	 Agroom=0;
 	           					 for (var i = 0; i < data.objected.length; i++) {
	           					     hotarticles+='<tr>';
   	           						 hotarticles+='<td><input type="checkbox" class="input-control" name="checkbox[]" value="'+data.objected[i].a_id+'" /></td>';
   	           						 hotarticles+='<td class="article-title">'+data.objected[i].a_title+'</td>';
 	           						 hotarticles+='<td>'+data.objected[i].cl_content+'</td>';
 	           						 hotarticles+='<td class="hidden-sm" style="text-align:center;">'+data.objected[i].a_like+'</td>';
 	           						 hotarticles+='<td class="hidden-sm" style="text-align:center;">'+data.objected[i].a_read+'</td>';	
 	           						 hotarticles+='<td>'+data.objected[i].a_time+'</td>';
 	           						 if(data.objected[i].a_groom==1){
 	           							 Agroom+=1;
 	           							 hotarticles+='<td><a href="/19971224wls/UpdateArticle/'+data.objected[i].a_id+'.html">修改</a> <a rel="4" class="shanchu" onclick="Delete(\''+data.objected[i].a_id+'\')">删除</a><a style="padding-left: 6px;" class="shanchu" onclick="Recommend(\''+data.objected[i].a_id+'\',\''+0+'\')">不推荐</a></td>';
 	           						 }
 	           						if(data.objected[i].a_groom==0){
	           							 hotarticles+='<td><a href="/19971224wls/UpdateArticle/'+data.objected[i].a_id+'.html">修改</a> <a rel="4" class="shanchu" onclick="Delete(\''+data.objected[i].a_id+'\')">删除</a><a style="padding-left: 6px;" class="shanchu" onclick="Recommend(\''+data.objected[i].a_id+'\',\''+1+'\')">推荐</a></td>';
	           						 }
 	           						 hotarticles+='</tr>';
 	           					} 
 	           					$("table>tbody").html(hotarticles);
           		        	},
           		        	error:function(){
           		        		alert("传输失败2")
           		        	},
           		        	dataType:"json"
           		        }); 
           		     }
           		  });
     	   });
     	},
     	error:function(){
     		alert("传输失败");
     	},
     	dataType:"json"
     });
});
//删除文章
function Delete(aId){
	layer.msg('你确定要删除该文章吗？', {
		  time: 0 //不自动关闭
		  ,btn: ['必须滴', '不不不']
		  ,yes: function(index){
			  $.ajax({
				  url:"/19971224wls/EditArticle/deleteArticle.html",
				  asnyc:true,
				  type:"POST",
				  data:{"aId":aId},
				  success:function(data){
					  if(data.status==200){
						  layer.msg(data.msg,{time:2000});
						  setTimeout("location.reload()",1000);
					  }
					  //layer.close(index);
				  },
				  error:function(){
					  
				  },
				  dataType:"json"
			  });
		  }
		}); 
} 
//删除多篇文章
function Deteltlist(){
	/*将选中的多个文章id放进数组中*/
	var aIds=[];
	$('td input[name="checkbox[]"]:checked').each(function(){
		aIds.push($(this).val());
	});
	if (aIds=="") {
		layer.msg("请选择要删除的文章...");
	}else {
		layer.msg('你确定要删除多篇文章吗？', {
			  time: 0 //不自动关闭
			  ,btn: ['必须滴', '不不不']
			  ,yes: function(index){
				  $.ajax({
					  url:"/19971224wls/EditArticle/deleteArticlelist.html",
					  asnyc:true,
					  type:"POST",
					  data:{"aIds":aIds},
					  traditional: true,                  //ajax传输的数据有数组时，需设置将traditional设置为true
					  success:function(data){
						  if(data.status==200){
							  layer.msg(data.msg,{time:2000});
							  setTimeout("location.reload()",1000);
						  }
					  },
					  error:function(){
						  
					  },
					  dataType:"json"
				  });
			  }
			}); 
	}
	 
}

//推荐文章
function Recommend(aId,aGroom){
	if(Agroom!=3&&aGroom==1){
		layer.msg('是否将该文章设置为推荐文章？', {
			  time: 0 //不自动关闭
			  ,btn: ['是滴', '不不不']
			  ,yes: function(index){
				  $.ajax({
					  url:"/19971224wls/EditArticle/RecommendArticle.html",
					  asnyc:true,
					  type:"POST",
					  data:{"aId":aId,"aGroom":aGroom},
					  success:function(data){
						  if(data.status==200){
							  layer.msg(data.msg,{time:2000});
							  setTimeout("location.reload()",1000);
						  }
						  //layer.close(index);
					  },
					  error:function(){
						  
					  },
					  dataType:"json"
				  });
			  }
			});
	}
	if(Agroom==3&&aGroom==1){
		layer.msg('已有三篇推荐文章！');
		return;
	}
	if(aGroom==0){
		layer.msg('是否将取消该推荐文章？', {
			  time: 0 //不自动关闭
			  ,btn: ['是滴', '不不不']
			  ,yes: function(index){
				  Agroom-=1;
				  $.ajax({
					  url:"/19971224wls/EditArticle/RecommendArticle.html",
					  asnyc:true,
					  type:"POST",
					  data:{"aId":aId,"aGroom":aGroom},
					  success:function(data){
						  if(data.status==200){
							  layer.msg(data.msg,{time:2000});
							  setTimeout("location.reload()",1000);
						  }
						  //layer.close(index);
					  },
					  error:function(){
						  
					  },
					  dataType:"json"
				  });
			  }
			});
	}
}