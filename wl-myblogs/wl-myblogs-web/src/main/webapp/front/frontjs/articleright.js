$(function(){
	$.post("/Article/GetArticleListByAgroom.html",function(data){
		var Num=""; 
		for(var i=0;i<10;i++) 
		{ 
			Num+=Math.floor(Math.random()*10); 
		} 
		var pojo=eval("("+data+")");
		var tuijianarticle='';
		tuijianarticle+='<ul>'
		for (var i = 0; i < pojo.length; i++) {
			tuijianarticle+='<li> <i><img src="'+pojo[i].aImg+'"></i>';
			tuijianarticle+='<p>'+pojo[i].aTitle+' <span><a href="/Article/GetArticleContent/'+Num+pojo[i].aId+'.html">阅读</a></span></p></li>'
		}
		tuijianarticle+='</ul>';
		$(".zhuanti").append(tuijianarticle);
	});
	$.post("/Article/GetArticleListByTime.html",function(data){
		var Num=""; 
		for(var i=0;i<10;i++) 
		{ 
			Num+=Math.floor(Math.random()*10); 
		} 
		var pojo=eval("("+data+")");
		var zuixinarticlehead='';
		var booleans=true;
		var zuixinarticlend='<ul class="sidenews">';
		for (var i = 0; i < pojo.length; i++) {
			if(pojo[i].aImg!=""&&booleans==true){
				zuixinarticlehead+='<ul class="tjpic">';
				zuixinarticlehead+='<i><img src="'+pojo[i].aImg+'"></i>';
				zuixinarticlehead+='<p><a href="/Article/GetArticleContent/'+Num+pojo[i].aId+'.html">'+pojo[i].aTitle+'</a></p></ul>';
				booleans=false;
				continue;
			}else{
				zuixinarticlend+='<li>';
				if(pojo[i].aImg!=""){
					zuixinarticlend+='<i><img src="'+pojo[i].aImg+'"></i>';
				}
				zuixinarticlend+='<p><a href="/Article/GetArticleContent/'+Num+pojo[i].aId+'.html">'+pojo[i].aTitle+'</a></p><span>'+pojo[i].aTime+'</span>';
				zuixinarticlend+='</li>';
			}
		}
		zuixinarticlend+='</ul>';
		$("#zuixin").append(zuixinarticlehead+zuixinarticlend);
	});
	$.post("/Article/GetArticleListByRead.html",function(data){
		var Num=""; 
		for(var i=0;i<10;i++) 
		{ 
			Num+=Math.floor(Math.random()*10); 
		} 
		var pojo=eval("("+data+")");
		var zuixinarticleheads='';
		var booleans=true;
		var zuixinarticlends='<ul class="sidenews">';
		for (var i = 0; i < pojo.length; i++) {
			if(pojo[i].aImg!=""&&booleans==true){
				zuixinarticleheads+='<ul class="tjpic">';
				zuixinarticleheads+='<i><img src="'+pojo[i].aImg+'"></i>';
				zuixinarticleheads+='<p><a href="/Article/GetArticleContent/'+Num+pojo[i].aId+'.html">'+pojo[i].aTitle+'</a></p></ul>';
				booleans=false;
				continue;
			}else{
				zuixinarticlends+='<li>';
				if(pojo[i].aImg!=""){
					zuixinarticlends+='<i><img src="'+pojo[i].aImg+'"></i>';
				}
				zuixinarticlends+='<p><a href="/Article/GetArticleContent/'+Num+pojo[i].aId+'.html">'+pojo[i].aTitle+'</a></p><span>'+pojo[i].aTime+'</span>';
				zuixinarticlends+='</li>';
			}
		}
		zuixinarticlends+='</ul>';
		$("#dianji").append(zuixinarticleheads+zuixinarticlends);
	});
	$.post("/Article/Getfriendchain.html",function(data){
		var pojo=eval("("+data+")");
		var linkfriend='<ul>';
		for (var i = 0; i < pojo.length; i++) {
			linkfriend+='<li><a href="'+pojo[i].fUrl+'" target="_blank">'+pojo[i].fName+'</a></li>';
		}
		linkfriend+='</ul>';
		$(".links").append(linkfriend);
	});
});
function reading(aId){
	
}