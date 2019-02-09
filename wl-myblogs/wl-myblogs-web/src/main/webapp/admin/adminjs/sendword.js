/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */
$(function () {
	/*读取寄语内容
	*/
	$.ajax({
     	url:"/19971224wls/GetSendWordlist.html",
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
           		        	url:"/19971224wls/GetSendWordlist.html",
           		        	async:true,
           		        	type:"POST",
           		        	data:{"currentpage":obj.curr,"numberpage":12},
           		        	success:function(data){
 	           		        	 var hotarticles='';
 	           					 for (var i = 0; i < data.objected.length; i++) {
	           					     hotarticles+='<tr>';
   	           						 hotarticles+='<td><input type="checkbox" class="input-control" name="checkbox[]" value="'+data.objected[i].mId+'" /></td>';
   	           						 var contentes=data.objected[i].mContent;
   	           						 if(contentes.length>30){
   	           							 hotarticles+='<td>'+data.objected[i].mContent.substring(0,30)+'...</td>';
   	           							 hotarticles+='<td style="display:none;" class="article-content">'+data.objected[i].mContent+'</td>';
   	           						 }else {
           		        				 hotarticles+='<td>'+data.objected[i].mContent+'</td>';
           		        			 }
   	           						 
 	           						 hotarticles+='<td>'+data.objected[i].mName+'</td>';
 	           						if(contentes.length>30){
 	           							hotarticles+='<td align="center"><a style="margin-right: 6px;" onclick="Read(this)"  name="see">查看</a><a style="margin-right: 6px;" name="delete" onclick="Delete(\''+data.objected[i].mId+'\')">删除</a></td>';
 	           						}else{
 	           							hotarticles+='<td align="center"><a name="delete" onclick="Delete(\''+data.objected[i].mId+'\')">删除</a></td>';
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
/*查看寄语*/
function Read(ob) {
	var td = $(ob).parent().parent().find("td");  
    var content = td.eq(2).html();
	layer.open({
		  title: '查看评论'
		  ,content: content
	}); 
}


/*删除寄语*/
function Delete(m_id){
	layer.msg('你确定要删除该寄语吗？', {
		  time: 0 //不自动关闭
		  ,btn: ['必须滴', '不不不']
		  ,yes: function(index){
			  $.ajax({
				  url:"/19971224wls/DeleteSendWord.html",
				  asnyc:true,
				  type:"POST",
				  data:{"mId":m_id},
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
/*删除多条寄语*/
function Deteltlist(){
	var messagelist=[];
	$('td input[name="checkbox[]"]:checked').each(function(){
		messagelist.push($(this).val());
	});
	if (messagelist=="") {
		layer.msg("请选择要删除的寄语...");
	}else {
		layer.msg('你确定要删除多条寄语吗？', {
			  time: 0 //不自动关闭
			  ,btn: ['必须滴', '不不不']
			  ,yes: function(index){
				  $.ajax({
					  url:"/19971224wls/DeleteSendWordlist.html",
					  asnyc:true,
					  type:"POST",
					  data:{"mIdlist":messagelist},
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