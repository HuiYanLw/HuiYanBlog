package cn.myblogs.service.impl.adminserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.mapper.TbUserMapper;
import cn.myblogs.pojo.TbUser;
import cn.myblogs.pojo.TbUserExample;
import cn.myblogs.service.adminservice.ShiroUserService;

@Service
public class ShiroUserServiceImpl implements ShiroUserService {
	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Override
	public TbUser getUserByUserName(String username) {
		// TODO Auto-generated method stub
		TbUserExample tbUserExample = new TbUserExample();
		tbUserExample.createCriteria().andUsernameEqualTo(username);
		List<TbUser> selectByExample = tbUserMapper.selectByExample(tbUserExample);
		if(selectByExample!=null&&selectByExample.size()!=0){
			return selectByExample.get(0);
		}
		return null;
	}

}
