package cn.myblogs.controller.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.myblogs.pojo.TbUser;
import cn.myblogs.service.adminservice.ShiroUserService;

public class CustomRealm extends AuthorizingRealm {
	@Autowired
	private ShiroUserService shiroUserService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		TbUser userByUserName = shiroUserService.getUserByUserName(username);
		if(userByUserName==null){
            return null;
        }
		//最后的比对需要交给安全管理器 //三个参数进行初步的简单认证信息对象的包装
		try{
			AuthenticationInfo info = new SimpleAuthenticationInfo(userByUserName, userByUserName.getPassword(), this.getClass().getSimpleName());
			return info;
		}catch(Exception e){
			return null; 
		}
		
	}

}
