$(function (){
	layui.use(['form', 'layedit', 'laydate'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,laydate = layui.laydate;
		  
		  //创建一个编辑器
		  var editIndex = layedit.build('LAY_demo_editor');
		 
		  //自定义验证规则
		  form.verify({
		    title: function(value){
			  if(value.length==0){
				return '昵称不得为空！';
			  }
		      if(value.length > 7){
		        return '昵称不得超过7个字数';
		      }
		    }
		    ,content: function(value){
		      if(value.length==0){
		      	return '内容不得为空！';
		      }
		      if(value.length>60){
		        return '内容不得超过70个字数';
		      }
		    }
		  });
		  //监听提交
		  form.on('submit(demo2)', function(data){
			  $.post("/Article/AddSendWording.html", { "username": data.field.username, "content": data.field.content },function(pojo){
				  if (pojo!=null&&pojo!="") {
						layer.msg("提交失败!",{time:1000},function(){
							layer.msg("输入内容含有敏感词汇："+pojo+"<br>请重新输入");
						});
					}else{
						layer.msg("提交成功！");
						setTimeout("window.location='/sendword.html'",1000);
					}
			  });
		   return false;
		  }); 
		});
});