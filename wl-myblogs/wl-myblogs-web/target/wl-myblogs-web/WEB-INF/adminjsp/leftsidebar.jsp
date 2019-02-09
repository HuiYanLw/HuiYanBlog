<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>


<body>
<aside class="col-sm-3 col-md-2 col-lg-2 sidebar">
      <ul class="nav nav-sidebar">
        <li><a href="/19970201wl/admin.html">报告</a></li>
      </ul>
      <ul class="nav nav-sidebar dd">
        <li><a href="/19971224wls/ArticleList.html">文章</a></li>
        <li><a href="/19971224wls/SendWord.html">寄语</a></li>
        <li><a href="/19971224wls/Mood.html">心情墙</a></li>
      </ul>
      <ul class="nav nav-sidebar">
        <li><a href="/19971224wls/ClassifyTage.html">栏目</a></li>
        <li><a href="/19971224wls/Friendchain.html">友链</a></li>
      </ul>
     <c:if test="${blogsuser.h_name=='yyy'}">
	      <ul class="nav nav-sidebar">
	        <li><a  href="userset.jsp">用户设置</a>
	        </li>
	      </ul>
     </c:if>
    </aside>
</body>
</html>