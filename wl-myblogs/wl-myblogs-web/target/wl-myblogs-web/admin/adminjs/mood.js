/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */
$(function(){   
	
	/*获取心情记录
	*/
	$.ajax({
     	url:"/19971224wls/Mood/GetMoodlist.html",
     	async:true,
     	type:"POST",
     	data:{"currentpage":1,"numberpage":12},
     	success:function(data){
     		layui.use(['laypage', 'layer'], function(){
     	    	  var laypage = layui.laypage
     	    	  ,layer = layui.layer;
     	    	  laypage.render({
           			elem: 'demo11'   //获得分页容器Id
           		    ,count: data.totanumber      //从后台获取总的数据量
           		    ,limit: 12            //每页显示的数据量
           		    ,curr: 1
           		    ,theme: '#1E9FFF'   //当前页按钮的样式
           		    ,layout: ['count','prev', 'page', 'next']  //自定义页面排版，count：显示总条数；prev：显示上一页；page：加载页码条数；next：显示下一页；skip：显示跳转功能
           		    ,jump: function(obj){    //点击页面数触发函数
           		    	 $.ajax({
           		        	url:"/19971224wls/Mood/GetMoodlist.html",
           		        	async:true,
           		        	type:"POST",
           		        	data:{"currentpage":obj.curr,"numberpage":12},
           		        	success:function(data){
 	           		        	 var hotarticles='';
 	           		        	 var reg = /[a-zA-Z]/g;
	           		        	 var htmls=/<\/?[^>]*>/g;
 	           					 for (var i = 0; i < data.objected.length; i++) {
	           					     hotarticles+='<tr>';
   	           						 hotarticles+='<td><input type="checkbox" class="input-control" name="checkbox[]" value="'+data.objected[i].moId+'" /></td>';
   	           					  	 var s=data.objected[i].moContent.replace(reg,"");
	   	           				 	 var contentes=s.replace(htmls,"");
		   	           				 if (contentes.length>30) {
		   	           					hotarticles+='<td class="article-title">'+data.objected[i].moContent.substring(0,30)+'...</td>';
		   	           				    hotarticles+='<td class="hidden-sm" >'+data.objected[i].moTime+'</td>';	
		   	           				    hotarticles+='<td><a style="margin-right: 4px;"  name="see" onclick="Read(\''+data.objected[i].moContent+'\')">查看</a><a rel="6" class="shanchu" onclick="Delete(\''+data.objected[i].moId+'\')">删除</a></td>';
		   	           				 }else {
			   	           			     hotarticles+='<td class="article-title">'+data.objected[i].moContent+'</td>';
			   	           			     hotarticles+='<td class="hidden-sm" >'+data.objected[i].moTime+'</td>';	
			   	           			     hotarticles+='<td ><a style="margin-left: 15px;" class="shanchu" onclick="Delete(\''+data.objected[i].moId+'\')">删除</a></td>';
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
/*查看记录*/
function Read(ob) {
	layer.open({
		  title: '查看评论'
		  ,content: ob
	}); 
}
//删除记录
function Delete(m_id){
	layer.msg('你确定要删除该记录吗？', {
		  time: 0 //不自动关闭
		  ,btn: ['必须滴', '不不不']
		  ,yes: function(index){
			  $.ajax({
				  url:"/19971224wls/Mood/DeleteMood.html",
				  asnyc:true,
				  type:"POST",
				  data:{"moId":m_id},
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
//删除多条记录
function Deteltlist(){
	var moodlist=[];
	$('td input[name="checkbox[]"]:checked').each(function(){
		moodlist.push($(this).val());
	});
	if (moodlist=="") {
		layer.msg("请选择要删除的记录...");
	}else {
		layer.msg('你确定要删除多条记录吗？', {
			  time: 0 //不自动关闭
			  ,btn: ['必须滴', '不不不']
			  ,yes: function(index){
				  $.ajax({
					  url:"/19971224wls/Mood/DeleteMoodlist.html",
					  asnyc:true,
					  type:"POST",
					  data:{"moIdlist":moodlist},
					  traditional: true,
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