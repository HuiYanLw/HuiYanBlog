package cn.myblogs.service.impl.frontserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.mapper.TbArticleMapper;
import cn.myblogs.mapper.TbFriendchainMapper;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticleExample;
import cn.myblogs.pojo.TbFriendchain;
import cn.myblogs.pojo.TbFriendchainExample;
import cn.myblogs.service.frontservice.FrontArticleRightService;

@Service
public class FrontArticleRightServiceImpl implements FrontArticleRightService {
	@Autowired
	private TbArticleMapper tbArticleMapper;
	@Autowired
	private TbFriendchainMapper tbFriendchainMapper;
	
	public List<TbArticle> getArticleListByAgroom() {
		// TODO Auto-generated method stub
		TbArticleExample tbArticleExample = new TbArticleExample();
		tbArticleExample.createCriteria().andAGroomEqualTo(1);
		List<TbArticle> list = tbArticleMapper.selectByExample(tbArticleExample);
		return list;
	}

	@Override
	public List<TbArticle> GetArticleListByTime() {
		// TODO Auto-generated method stub
		TbArticleExample tbArticleExample = new TbArticleExample();
		tbArticleExample.setOrderByClause("a_time DESC");
		List<TbArticle> list = tbArticleMapper.selectByExample(tbArticleExample);
		List<TbArticle> tbarticleList=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			tbarticleList.add(list.get(i));
		}
		return tbarticleList;
	}

	@Override
	public List<TbArticle> GetArticleListByRead() {
		// TODO Auto-generated method stub
		TbArticleExample tbArticleExample = new TbArticleExample();
		tbArticleExample.setOrderByClause("a_read DESC");
		List<TbArticle> list = tbArticleMapper.selectByExample(tbArticleExample);
		List<TbArticle> tbarticleList=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			tbarticleList.add(list.get(i));
		}
		return tbarticleList;
	}

	@Override
	public List<TbFriendchain> Getfriendchain() {
		TbFriendchainExample example = new TbFriendchainExample();
		List<TbFriendchain> list = tbFriendchainMapper.selectByExample(example);
		return list;
	}

}
