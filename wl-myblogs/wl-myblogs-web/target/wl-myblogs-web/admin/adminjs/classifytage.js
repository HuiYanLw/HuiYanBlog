/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */
$(function(){  
	/*获取分类和标签*/
	$.ajax({
		url:"/19971224wls/GetClassifyTagelist.html",
		asnyc:true,
		type:"POST",
		success:function(data){
			 var classifylist='';
			 var tageslist='';
			 for (var i = 0; i < data.length; i++) {
				 classifylist+='<tr>';
				 classifylist+='<td>'+(i+1)+'</td>';
				 classifylist+='<td>'+data[i].cl_content+'</td>';
				 classifylist+='<td>&nbsp;&nbsp;&nbsp;'+data[i].cl_number+'</td>';
				 classifylist+='<td>&nbsp;&nbsp;&nbsp;<a onclick="Updaete(\''+data[i].cl_id+'\',\''+data[i].cl_content+'\')">修改</a></td>';
				 classifylist+='</tr>';
			}
			$("#classifylist").html(classifylist);
			
		},
		error:function(){
			
		},
		dataType:"json"
	});
});
/*修改分类名称*/
function Updaete(cl_id,cl_content){
	layer.prompt({
		  formType: 2,
		  value: cl_content,
		  title: '修改分类',
		  area: ['300px', '25px'] //自定义文本域宽高
		}, function(value, index, elem){
			$.ajax({
				url:"/19971224wls/UpdateClassify.html",
				asnyc:true,
				type:"POST",
				data:{"clId":cl_id,"clContent":value},
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
		});
}
function Addtagese() {
	layer.msg("暂无此功能...");
}