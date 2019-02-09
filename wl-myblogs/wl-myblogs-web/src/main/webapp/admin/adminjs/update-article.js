/**
 * 注意ajax在js文件中的提交路径跟在页面上的是不一样的
 */
var editor = UE.getEditor('article-content');
window.onresize=function(){
    window.location.reload();
}
var _uploadEditor;
$(function () {
	/*获得指定文章、分类
	*/
	C1=window.location.href.split("/")[5]; //得到参数
	aId=C1.split(".")[0];
	$.ajax({
		url:"/19971224wls/EditArticle/GetUpdateArticle.html",
		async:true,
		type:"POST",
		data:{"aId":aId},
		success:function(data){
			var classifyone='';
			var classifytwo='';
			var articletitle='';
			for (var i = 0; i <= 3; i++) {
				classifyone+='<li><label>';
				if (data.classifyes[i].clId==data.tbArticle.clId) {
					classifyone+='<input name="category" type="radio" value="'+data.classifyes[i].clId+'" checked>'+data.classifyes[i].clContent;
				}
				else {
					classifyone+='<input name="category" type="radio" value="'+data.classifyes[i].clId+'">'+data.classifyes[i].clContent;
				}
				classifyone+='</label></li>';
			}
			for (var i =4; i <= 7; i++) {
				classifytwo+='<li><label>';
				if (data.classifyes[i].clId==data.tbArticle.clId) {
					classifytwo+='<input name="category" type="radio" value="'+data.classifyes[i].clId+'" checked>'+data.classifyes[i].clContent;
				}
				else {
					classifytwo+='<input name="category" type="radio" value="'+data.classifyes[i].clId+'">'+data.classifyes[i].clContent;
				}
				classifytwo+='</label></li>';
			}
			$("#article-title").val(data.tbArticle.aTitle);
			UE.getEditor('article-content').ready(function(){
				UE.getEditor('article-content').setContent(data.tbArticle.aContent);    
			});
			$("#textsummary").val(data.tbArticle.aSummary);
			$("#pictureUpload").val(data.tbArticle.aImg);
			$("#Classifyone").html(classifyone);
			$("#Classifytwo").html(classifytwo);
			$("#writer").val(data.tbArticle.aWriter);
			$("#releasetime").val(data.tbArticle.aTime);
		},
		error:function(){
			alert("传输失败！")
		},
		dataType:"json"
	});
	
	
    //重新实例化一个编辑器，防止在上面的editor编辑器中显示上传的图片或者文件
    _uploadEditor = UE.getEditor('uploadEditor');
    _uploadEditor.ready(function () {
        //设置编辑器不可用
        //_uploadEditor.setDisabled();
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        _uploadEditor.hide();
        //侦听图片上传
        _uploadEditor.addListener('beforeInsertImage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            $("#pictureUpload").attr("value", arg[0].src);
            //图片预览
            //$("#imgPreview").attr("src", arg[0].src);
        });
        //侦听文件上传，取上传文件列表中第一个上传的文件的路径
        _uploadEditor.addListener('afterUpfile', function (t, arg) {
            $("#fileUpload").attr("value", _uploadEditor.options.filePath + arg[0].url);
        });
    });
    /*发布修改文章内容
    */
    $("#release").click(function() {
    	var category=$('.category-list input[name="category"]:checked').val();
    	var title=$("#article-title").val();
    	var content=UE.getEditor('article-content').getContent();
    	var summary=$("#textsummary").val();
    	var img=$("#pictureUpload").val();
    	var writer=$("#writer").val();
    	if(title!=""&&title!=null&&content!=""&&content!=null&&summary!=""&&summary!=null&&writer!=""&&writer!=null&&category!=undefined){
    		$.ajax({
        		url:"/19971224wls/EditArticle/UpdateArticle.html",
        		async:true,
        		type:"POST",
        		data:{
        			"aId":aId,
        			"aTitle":title,
        			"aContent":content,
        			"aSummary":summary,
        			"aWriter":writer,
        			"clId":category,
        			"aImg":img},
        		traditional: true,
        		success:function(data){
        			if (data.status==200) {
        				layer.msg(data.msg,{time:2000},function(){
        					window.location.href="/19971224wls/ArticleList.html";
        				});
    				}else {
    					layer.msg(data);
    				}
        		},
        		error:function(){
        			
        		},
        		dataType:"json"
        	});
    	}else{
    		layer.msg("请将内容填写完整！");
    	}
    }); 
});

//弹出图片上传的对话框
$('#upImage').click(function () {
    var myImage = _uploadEditor.getDialog("insertimage");
    myImage.open();
});
//弹出文件上传的对话框
function upFiles() {
    var myFiles = _uploadEditor.getDialog("attachment");
    myFiles.open();
}
