package cn.myblogs.service.impl.adminserviceimpl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.mapper.TbMoodMapper;
import cn.myblogs.pojo.TbMood;
import cn.myblogs.pojo.TbMoodExample;
import cn.myblogs.service.adminservice.MoodService;




/** 
 * 心情墙编辑操作 
* @ClassName: MoodServiceImple  
* @Description: TODO  
* @author Administrator  
* @date 2018年11月16日  
*    
*/
@Service
public class MoodServiceImple implements MoodService {
	@Autowired
	private TbMoodMapper tbMoodMapper;
	
	public BlogsResult addMood(String moContent) {
		// TODO Auto-generated method stub
		TbMood tbMood = new TbMood();
		tbMood.setMoContent(moContent);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		tbMood.setMoTime(simpleDateFormat.format(new Date()));
		tbMoodMapper.insertSelective(tbMood);
		return new BlogsResult(200, "发布成功！", null);
	}

	public Pagingbean<TbMood> getMoodlist(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		Pagingbean<TbMood> pagingbean = new Pagingbean<TbMood>();
		TbMoodExample tbMoodExample = new TbMoodExample();
		int countByExample = tbMoodMapper.countByExample(tbMoodExample);
		pagingbean.setTotanumber(countByExample);
		tbMoodExample.setOrderByClause("mo_time DESC");
		List<TbMood> selectByExample = tbMoodMapper.selectByExample(tbMoodExample);
		selectByExample=FrontPageUtils.setPagelist(selectByExample, currentpage, numberpage);
		pagingbean.setObjected(selectByExample);
		
		return pagingbean;
	}

	public BlogsResult deleteMood(Integer moId) {
		// TODO Auto-generated method stub
		tbMoodMapper.deleteByPrimaryKey(moId);
		return new BlogsResult(200, "删除成功！", null);
	}

	public BlogsResult deleteMoodlist(Integer[] moIdlist) {
		// TODO Auto-generated method stub
		for (Integer integer : moIdlist) {
			tbMoodMapper.deleteByPrimaryKey(integer);
		}
		return new BlogsResult(200, "删除成功！", null);
	}

}
