/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */

   /*获得友情链接*/
$(function(){
	$.ajax({
		url:"/19971224wls/Friendchain/GetFriendchainlist.html",
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
         		    ,limit: 12             //每页显示的数据量
         		    ,curr: 1
         		    ,theme: '#1E9FFF'   //当前页按钮的样式
         		    ,layout: ['count','prev', 'page', 'next']  //自定义页面排版，count：显示总条数；prev：显示上一页；page：加载页码条数；next：显示下一页；skip：显示跳转功能
         		    ,jump: function(obj){    //点击页面数触发函数
         		    	 $.ajax({
         		        	url:"/19971224wls/Friendchain/GetFriendchainlist.html",
         		        	async:true,
         		        	type:"POST",
         		        	data:{"currentpage":obj.curr,"numberpage":12},
         		        	success:function(data){
	           		        	 var hotarticles='';
	           					 for (var i = 0; i < data.objected.length; i++) {
	           						hotarticles+='<tr>';
	           						hotarticles+='<td><input type="checkbox" class="input-control" name="checkbox[]" value="'+data.objected[i].fId+'" /></td>';
	           						hotarticles+='<td class="article-title">'+data.objected[i].fName+'</td>';
	           						hotarticles+='<td>'+data.objected[i].fUrl+'</td>';
	           						hotarticles+='<td><a href="/19971224wls/UpdateFriendchain/'+data.objected[i].fId+'.html">修改</a> <a rel="6" onclick="Delete(\''+data.objected[i].fId+'\')">删除</a></td>';
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
			
		},
		dataType:"json"
	});
});
//删除友链
function Delete(f_id){
	layer.msg('你确定要删除该友链吗？', {
		  time: 0 //不自动关闭
		  ,btn: ['必须滴', '不不不']
		  ,yes: function(index){
			  $.ajax({
				  url:"/19971224wls/Friendchain/DeleteFriendchain.html",
				  asnyc:true,
				  type:"POST",
				  data:{"fId":f_id},
				  success:function(data){
					  if(data.status==200){
						  layer.msg(data.msg,{time:2000});
						  setTimeout("location.reload()",1000);
					  }
					  //layer.close(index);
				  },
				  error:function(){
					  alert("传输失败！")
				  },
				  dataType:"json"
			  });
		  }
		}); 
} 
//删除多条友情链接
function Deteltlist(){
	var flinklist=[];
	$('td input[name="checkbox[]"]:checked').each(function(){
		flinklist.push($(this).val());
	});
	if (flinklist=="") {
		layer.msg("请选择要删除的友链...");
	}else {
		layer.msg('你确定要删除多条友链吗？', {
			  time: 0 //不自动关闭
			  ,btn: ['必须滴', '不不不']
			  ,yes: function(index){
				  $.ajax({
					  url:"/19971224wls/Friendchain/DeleteFriendchainlist.html",
					  asnyc:true,
					  type:"POST",
					  data:{"fIdlist":flinklist},
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