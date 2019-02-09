package cn.myblogs.controller.admincontroller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.myblogs.comment.util.MD5Utils;
import cn.myblogs.pojo.TbUser;

@Controller
public class UserLogingController {

	@RequestMapping("/UserLoging")
	public String UserLoging(String username, String password, HttpSession session, Model model){
		if(username==null){
            return "redirect:/LoginUser.html";
        }
		password=MD5Utils.md5(password);
		//主体,当前状态为没有认证的状态“未认证” 
		Subject subject = SecurityUtils.getSubject(); 
		// 登录后存放进shiro token 
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		TbUser user;
		//登录方法（认证是否通过）
        //使用subject调用securityManager,安全管理器调用Realm
		try { 
			//利用异常操作 //需要开始调用到Realm中 
			subject.login(token); 
			user = (TbUser)subject.getPrincipal(); 
			session.setAttribute("user",subject); 
		} catch (Exception e) { 
				return "redirect:/LoginUser.html"; 
			}
        
		return "redirect:/19970201wl/admin.html ";
	}
}
