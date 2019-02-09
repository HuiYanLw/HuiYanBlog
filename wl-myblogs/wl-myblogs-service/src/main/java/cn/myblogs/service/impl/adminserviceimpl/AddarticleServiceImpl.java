package cn.myblogs.service.impl.adminserviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.mapper.TbArticleMapper;
import cn.myblogs.mapper.TbClassifyMapper;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbClassify;
import cn.myblogs.pojo.TbClassifyExample;
import cn.myblogs.service.adminservice.AddarticleService;

@Service
public class AddarticleServiceImpl implements AddarticleService {
	@Autowired
	private TbClassifyMapper tbClassifyMapper;
	@Autowired
	private TbArticleMapper tbArticleMapper;
	
	@Override
	public BlogsResult getClassifyList() {
		// TODO Auto-generated method stub
		TbClassifyExample tbClassifyExample = new TbClassifyExample();
		List<TbClassify> list = tbClassifyMapper.selectByExample(tbClassifyExample);
		return new BlogsResult(list);
	}

	@Override
	public BlogsResult IncreaseArticle(TbArticle tbArticle) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String time = format.format(new Date());
		tbArticle.setaTime(time);
		tbArticle.setaLike(0);
		tbArticle.setaRead(0);
		tbArticle.setaGroom(0);
		tbArticleMapper.insert(tbArticle);
		return BlogsResult.ok();
	}

}
