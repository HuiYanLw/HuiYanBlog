package cn.myblogs.service.impl.adminserviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.pojo.UpdateArticlebean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.comment.util.RedisUtil;
import cn.myblogs.mapper.TbArticleMapper;
import cn.myblogs.mapper.TbArticlelistMapper;
import cn.myblogs.mapper.TbClassifyMapper;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticleExample;
import cn.myblogs.pojo.TbArticlelist;
import cn.myblogs.pojo.TbClassify;
import cn.myblogs.pojo.TbClassifyExample;
import cn.myblogs.service.adminservice.EditArticleService;

@Service
public class EditArticleServiceImpl implements EditArticleService {
	private static final Logger logger = LoggerFactory.getLogger(AddarticleServiceImpl.class);
	@Autowired
	private TbArticlelistMapper tbArticlelistMapper;
	@Autowired
	private TbArticleMapper tbArticleMapper;
	@Autowired
	private TbClassifyMapper tbClassifyMapper;
	@Autowired
	private RedisUtil redisUtil;
	
	@Override
	public Pagingbean<TbArticlelist> getArticleListToAdmin(Integer currentpage, Integer numberpage) {
		List<TbArticlelist> allArticleListToFront=null;
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				 allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
				 redisUtil.delete("articlelist");
			}
		}catch(Exception e){
			logger.debug("getArticleListToAdmin:{}",e);
		}
		//将阅读量跟喜好量存进数据库中
		if(allArticleListToFront!=null&&allArticleListToFront.size()!=0){
			for (TbArticlelist tbArticlelist : allArticleListToFront) {
				TbArticle tbArticles=new TbArticle();
				tbArticles.setaId(tbArticlelist.getA_id());
				tbArticles.setaRead(tbArticlelist.getA_read());
				tbArticles.setaLike(tbArticlelist.getA_like());
				try{
					tbArticleMapper.updateByPrimaryKeySelective(tbArticles);
				}catch(Exception e){
					logger.debug("getArticleListToAdmin:{}",e);
					continue;
				}
			}
		}
		
		Pagingbean<TbArticlelist> pagingbean = new Pagingbean<TbArticlelist>();
		//获取并设置文章总记录数
		TbArticleExample example = new TbArticleExample();
		int totanumber = tbArticleMapper.countByExample(example);
		//获取并设置文章的分页记录
		int countpage=(currentpage-1)*numberpage;
		List<TbArticlelist> list = tbArticlelistMapper.getArticleListToAdmin(countpage, numberpage);
		
		pagingbean.setTotanumber(totanumber);
		pagingbean.setObjected(list);
		return pagingbean;
	}
	@Override
	public UpdateArticlebean getUpdateArticle(Integer aId) {
		UpdateArticlebean updateArticlebean = new UpdateArticlebean();
		//获取并设置分类列表
		TbClassifyExample tbClassifyExample = new TbClassifyExample();
		List<TbClassify> list = tbClassifyMapper.selectByExample(tbClassifyExample);
		updateArticlebean.setClassifyes(list);
		//获取并设置相应的文章信息
		TbArticle tbArticle = tbArticleMapper.selectByPrimaryKey(aId);
		updateArticlebean.setTbArticle(tbArticle);
		return updateArticlebean;
	}
	@Override
	public BlogsResult updateArticle(TbArticle tbArticle) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String time = format.format(new Date());
		tbArticle.setaTime(time);
		tbArticleMapper.updateByPrimaryKeySelective(tbArticle);
		return BlogsResult.ok();
	}
	@Override
	public BlogsResult deleteArticle(Integer aId) {
		//根据aId删除对应文章
		tbArticleMapper.deleteByPrimaryKey(aId);
//		List<TbArticlelist> allArticleListToFront=null;
//		try{
//			if(redisUtil.hasKey("articlelist")){
//				 String string = redisUtil.get("articlelist");
//				 allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
//				 redisUtil.delete("articlelist");
//			}
//		}catch(Exception e){
//			logger.debug("getArticleList:{}",e);
//		}
//		//将阅读量跟喜好量存进数据库中
//		if(allArticleListToFront!=null&&allArticleListToFront.size()!=0){
//			 //先删除在数据库中不存在的数据
//			for(TbArticlelist tbArticlelist : allArticleListToFront) {
//				if(tbArticlelist.getA_id()==aId){
//					allArticleListToFront.remove(tbArticlelist);
//					break;//删除后一定要跳出，不然会发生错误
//				}
//			}
//			for (TbArticlelist tbArticlelist : allArticleListToFront) {
//				TbArticle tbArticles=new TbArticle();
//				tbArticles.setaId(tbArticlelist.getA_id());
//				tbArticles.setaRead(tbArticlelist.getA_read());
//				tbArticles.setaLike(tbArticlelist.getA_like());
//				tbArticleMapper.updateByPrimaryKeySelective(tbArticles);
//			}
//		}
		return BlogsResult.build(200, "删除成功！");
	}
	@Override
	public BlogsResult deleteArticlelist(Integer[] aIds) {
		//根据aId删除对应文章
		TbArticleExample tbArticleExample = new TbArticleExample();
		for (Integer integer : aIds) {
			tbArticleExample.clear();
			tbArticleExample.createCriteria().andAIdEqualTo(integer);
			tbArticleMapper.deleteByExample(tbArticleExample);	
		}
//		List<TbArticlelist> allArticleListToFront=null;
//		try{
//			if(redisUtil.hasKey("articlelist")){
//				 String string = redisUtil.get("articlelist");
//				 allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
//				 redisUtil.delete("articlelist");
//			}
//		}catch(Exception e){
//			logger.debug("getArticleList:{}",e);
//		}
//		//将阅读量跟喜好量存进数据库中
//		if(allArticleListToFront!=null&&allArticleListToFront.size()!=0){
//			 Iterator<TbArticlelist> iterator = allArticleListToFront.iterator();
//			 //先删除在数据库中不存在的数据
//			 for (Integer integer : aIds) {
//				 while(iterator.hasNext()){
//					 TbArticlelist tbArticlelist = iterator.next();
//					 if(tbArticlelist.getA_id()==integer){
//						 iterator.remove();
//					 }
//				 }
//			 }
//			for (TbArticlelist tbArticlelist : allArticleListToFront) {
//				TbArticle tbArticles=new TbArticle();
//				tbArticles.setaId(tbArticlelist.getA_id());
//				tbArticles.setaRead(tbArticlelist.getA_read());
//				tbArticles.setaLike(tbArticlelist.getA_like());
//				tbArticleMapper.updateByPrimaryKeySelective(tbArticles);
//			}
//		}
		return BlogsResult.build(200, "删除成功！");
	}
	@Override
	public BlogsResult RecommendArticle(TbArticle tbArticle) {
		tbArticleMapper.updateByPrimaryKeySelective(tbArticle);
		return BlogsResult.build(200, "设置成功！");
	}

}
