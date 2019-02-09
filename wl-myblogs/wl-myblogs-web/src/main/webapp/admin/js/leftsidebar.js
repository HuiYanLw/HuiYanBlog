/**
 * 
 */
/*
 * 激活选中的左导航栏状态*/
$(function() {
	$("li>a").each(function () {
		if (String(window.location)==this.href) {
			$(this).parent().addClass("active").siblings().removeClass("active");
		}
	});
});