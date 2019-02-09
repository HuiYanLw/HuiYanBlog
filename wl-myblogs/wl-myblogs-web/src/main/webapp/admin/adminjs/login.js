/**
 * 
 */
(function() {
		// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
		if (!String.prototype.trim) {
			(function() {
				// Make sure we trim BOM and NBSP
				var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
				String.prototype.trim = function() {
					return this.replace(rtrim, '');
				};
			})();
		}

		[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
			// in case the input is already filled..
			if( inputEl.value.trim() !== '' ) {
				classie.add( inputEl.parentNode, 'input--filled' );
			}

			// events:
			inputEl.addEventListener( 'focus', onInputFocus );
			inputEl.addEventListener( 'blur', onInputBlur );
		} );

		function onInputFocus( ev ) {
			classie.add( ev.target.parentNode, 'input--filled' );
		}

		function onInputBlur( ev ) {
			if( ev.target.value.trim() === '' ) {
				classie.remove( ev.target.parentNode, 'input--filled' );
			}
		}
	})();
	
	$(function() {	
		
		$('#login #login-password').focus(function() {
			$('.login-owl').addClass('password');
		}).blur(function() {
			$('.login-owl').removeClass('password');
		});
		$('#login #register-password').focus(function() {
			$('.register-owl').addClass('password');
		}).blur(function() {
			$('.register-owl').removeClass('password');
		});
		$('#login #register-repassword').focus(function() {
			$('.register-owl').addClass('password');
		}).blur(function() {
			$('.register-owl').removeClass('password');
		});
		$('#login #forget-password').focus(function() {
			$('.forget-owl').addClass('password');
		}).blur(function() {
			$('.forget-owl').removeClass('password');
		});
		
	});
	
	function goto_register(){
		$("#register-username").val("");
		$("#register-password").val("");
		$("#register-repassword").val("");
		$("#register-code").val("");
		$("#tab-2").prop("checked",true);
	}
	
	function goto_login(){
		$("#login-username").val("");
		$("#login-password").val("");
		$("#tab-1").prop("checked",true);
	}
	
	function goto_forget(){
		$("#forget-username").val("");
		$("#forget-password").val("");
		$("#forget-code").val("");
		$("#tab-3").prop("checked",true);
	}
	
	 function login(){//登录
		var username = $("#login-username").val(),
			password = $("#login-password").val(),
			validatecode = null,
			flag = false;
		//判断用户名密码是否为空
		if(username == ""){
			$.pt({
        		target: $("#login-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名不能为空"
        	});
			flag = true;
		}
		if(password == ""){
			$.pt({
        		target: $("#login-password"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"密码不能为空"
        	});
			flag = true;
		}
		//用户名只能是15位以下的字母或数字
		var regExp = new RegExp("^[a-zA-Z0-9_]{1,15}$");
		if(!regExp.test(username)&&username!=""){
			$.pt({
        		target: $("#login-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"请重新输入"
        	});
			flag = true;
		}
		
		 if(flag){
			return false;
		}else{//登录
			//调用后台登录验证的方法
			/*$.ajax({
				url:"LoginServlet",
				async:true,
				type:"POST",
				data:{"username":username,"password":password},
				success:function(data){
					if (data!=null&&data!="") {
						layer.msg(data,{time:2000});
					}
					if (data=="") {
						window.location.href="admin/main.jsp";
					}
						
				},
				dataType:"text"
			});*/
			window.location.href="/UserLoging.html?username="+username+"&&password="+password;
		}
	} 