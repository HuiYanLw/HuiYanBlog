<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>插入音乐</title>
    <script type="text/javascript" src="../internal.js"></script>
    <link rel="stylesheet" type="text/css" href="music.css">
</head>
<body>
<div class="wrapper">
    <div class="searchBar">
        <input id="J_searchName" type="text"/>
        <input type="button" class="searchBtn" id="J_searchBtn">
    </div>
    <div class="resultBar" id="J_resultBar">
        <div class="loading" style="display:none"></div>
        <div class="empty"><var id="lang_input_tips"></var></div>
    </div>
    <div id="J_preview"></div>
</div>
<script type="text/javascript" src="music.js"></script>
<script type="text/javascript">
    var music = new Music;
    dialog.onok = function () {
        music.exec();
    };
    dialog.oncancel = function () {
        $G('J_preview').innerHTML = "";
    };
</script>
</body>
</html>