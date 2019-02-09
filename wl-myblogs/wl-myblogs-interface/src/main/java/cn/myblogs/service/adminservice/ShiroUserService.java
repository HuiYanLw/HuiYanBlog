package cn.myblogs.service.adminservice;

import cn.myblogs.pojo.TbUser;

public interface ShiroUserService {
	public TbUser getUserByUserName(String username);
}
