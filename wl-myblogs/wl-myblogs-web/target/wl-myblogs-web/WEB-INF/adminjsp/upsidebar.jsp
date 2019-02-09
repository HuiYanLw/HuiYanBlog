<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
          <a class="navbar-brand" href="javascript:void(0)">HuiYanBoKe</a> </div>
      </div>
    </nav>
  </header>
 <script type="text/javascript" src="/admin/plugin/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/admin/plugin/layer/3.0/layer.js"></script>
<script type="text/javascript">
function Exit(){
	layer.msg('是否退出登录？', {
		  time: 0 //不自动关闭
		  ,btn: ['是的', '再考虑考虑']
		  ,yes: function(index){
			  window.location.href="${pageContext.request.contextPath}/ClaresessionServlet";
		  }
		}); 
}
</script>
</body>
</html>