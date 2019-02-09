package cn.myblogs.service.impl.frontserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.mapper.TbMoodMapper;
import cn.myblogs.pojo.TbMood;
import cn.myblogs.pojo.TbMoodExample;
import cn.myblogs.service.frontservice.TimeService;

@Service
public class TimeServiceImpl implements TimeService {
	
	@Autowired
	private TbMoodMapper tbMoodMapper;
	
	@Override
	public Pagingbean<TbMood> GettimeList(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		Pagingbean<TbMood> pagingbean = new Pagingbean<>();
		TbMoodExample tbMoodExample = new TbMoodExample();
		tbMoodExample.setOrderByClause("mo_time DESC");
		List<TbMood> selectByExample = tbMoodMapper.selectByExample(tbMoodExample);
		int i = tbMoodMapper.countByExample(tbMoodExample);
		selectByExample= FrontPageUtils.setPagelist(selectByExample, currentpage, numberpage);
		pagingbean.setObjected(selectByExample);
		pagingbean.setTotanumber(i);
		return pagingbean;
	}

}
