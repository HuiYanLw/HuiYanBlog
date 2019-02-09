package cn.myblogs.service.impl.frontserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.comment.util.RedisUtil;
import cn.myblogs.mapper.TbArticleMapper;
import cn.myblogs.mapper.TbArticlelistMapper;
import cn.myblogs.mapper.TbClassifyMapper;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticleExample;
import cn.myblogs.pojo.TbArticlelist;
import cn.myblogs.pojo.TbClassify;
import cn.myblogs.service.frontservice.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	private  Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);
	@Autowired
	private TbArticlelistMapper tbArticlelistMapper;
	@Autowired
	private TbArticleMapper tbArticleMapper;
	@Autowired
	private TbClassifyMapper tbClassifyMapper;
	@Autowired
	private RedisUtil redisUtil;
	
	//获取文章列表（运用redis缓存数据）
	public Pagingbean<TbArticlelist> getArticleList(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		List<TbArticlelist> allArticleListToFront=null;
		Pagingbean<TbArticlelist> pagingbean = new Pagingbean<TbArticlelist>();
		TbArticleExample example = new TbArticleExample();
		int countByExample = tbArticleMapper.countByExample(example);
		pagingbean.setTotanumber(countByExample);
		
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
			}else{
				allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
				String json = JsonUtils.objectToJson(allArticleListToFront);
				redisUtil.set("articlelist", json);
			}
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
		}
		allArticleListToFront = FrontPageUtils.setPagelist(allArticleListToFront, currentpage, numberpage);
		pagingbean.setObjected(allArticleListToFront);
		return pagingbean;
	}
	
	//获取学无止境文章列表（运用redis缓存数据）
	public Pagingbean<TbArticlelist> getArticleListByClassifyId(Integer currentpage, Integer numberpage,
			Integer cl_category) {
		// TODO Auto-generated method stub
		List<TbArticlelist> allArticleListToFront=null;
		List<TbArticlelist> skillArticleListToFront=new ArrayList<TbArticlelist>();
		Pagingbean<TbArticlelist> pagingbean = new Pagingbean<TbArticlelist>();
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
			}else{
				allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
				String json = JsonUtils.objectToJson(allArticleListToFront);
				redisUtil.set("articlelist", json);
			}
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
		}
		for (TbArticlelist tbArticlelist : allArticleListToFront) {
			if(tbArticlelist.getCl_category().equals(cl_category+"")){
				skillArticleListToFront.add(tbArticlelist);
			}
		}
		pagingbean.setTotanumber(skillArticleListToFront.size());
		if(skillArticleListToFront.size()!=0){
			skillArticleListToFront=FrontPageUtils.setPagelist(skillArticleListToFront, currentpage, numberpage);
			pagingbean.setObjected(skillArticleListToFront);
		}else
			pagingbean.setObjected(null);
		return pagingbean;
	}

	@Override
	public Pagingbean<TbArticlelist> getClassifyArticlelistByCid(Integer currentpage, Integer numberpage,
			Integer cl_id) {
		List<TbArticlelist> allArticleListToFront=null;
		List<TbArticlelist> skillArticleListToFront=new ArrayList<TbArticlelist>();
		Pagingbean<TbArticlelist> pagingbean = new Pagingbean<TbArticlelist>();
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
			}else{
				allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
				String json = JsonUtils.objectToJson(allArticleListToFront);
				redisUtil.set("articlelist", json);
			}
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
		}
		for (TbArticlelist tbArticlelist : allArticleListToFront) {
			if(tbArticlelist.getCl_id()==cl_id){
				skillArticleListToFront.add(tbArticlelist);
			}
		}
		pagingbean.setTotanumber(skillArticleListToFront.size());
		if(skillArticleListToFront.size()!=0){
			skillArticleListToFront=FrontPageUtils.setPagelist(skillArticleListToFront, currentpage, numberpage);
			pagingbean.setObjected(skillArticleListToFront);
		}else
			pagingbean.setObjected(null);
		return pagingbean;
	}

	@Override
	public List<TbArticlelist> GetArticleContent(Integer aId) {
		// TODO Auto-generated method stub
		List<TbArticlelist> allArticleListToFront=null;
		List<TbArticlelist> ArticleContentToFront=new ArrayList<TbArticlelist>();
		TbArticlelist tbArticlelist1 = new TbArticlelist();
		TbArticlelist tbArticlelist2=new TbArticlelist();
		TbArticlelist tbArticlelist3 = new TbArticlelist();
		int read=0;
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
			}else{
				allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
				String json = JsonUtils.objectToJson(allArticleListToFront);
				redisUtil.set("articlelist", json);
			}
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
		}
		for (int i = 0; i < allArticleListToFront.size(); i++) {
			tbArticlelist2=allArticleListToFront.get(i);
			if(tbArticlelist2.getA_id()==aId){
				read=tbArticlelist2.getA_read()+1;
				tbArticlelist2.setA_read(read);
				ArticleContentToFront.add(tbArticlelist2);
				if(i-1>-1){
					tbArticlelist1.setA_id(allArticleListToFront.get(i-1).getA_id());
					tbArticlelist1.setA_title(allArticleListToFront.get(i-1).getA_title());
				}else{
					tbArticlelist1.setA_title("无上一篇！");
				}
				ArticleContentToFront.add(tbArticlelist1);
				if(i+1<allArticleListToFront.size()){
					tbArticlelist3.setA_id(allArticleListToFront.get(i+1).getA_id());
					tbArticlelist3.setA_title(allArticleListToFront.get(i+1).getA_title());
				}else{
					tbArticlelist3.setA_title("无下一篇！");
				}
				ArticleContentToFront.add(tbArticlelist3);
			}
		}
		try{
			String jsonlist = JsonUtils.objectToJson(allArticleListToFront);
			//redisUtil.delete("articlelist");
			redisUtil.set("articlelist", jsonlist);
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			TbArticle tbArticle = new TbArticle();
			tbArticle.setaId(aId);
			tbArticle.setaRead(read);
			tbArticleMapper.updateByPrimaryKeySelective(tbArticle);
		}
		return ArticleContentToFront;
	}

	@Override
	public BlogsResult addLikeNumber(Integer aId) {
		// TODO Auto-generated method stub
		List<TbArticlelist> allArticleListToFront=null;
		TbArticlelist articlelist = new TbArticlelist();
		TbArticlelist articlelist2 = new TbArticlelist();
		int like=0;
		try{
			if(redisUtil.hasKey("articlelist")){
				 String string = redisUtil.get("articlelist");
				allArticleListToFront= JsonUtils.jsonToList(string, TbArticlelist.class);
			}else{
				allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
				String json = JsonUtils.objectToJson(allArticleListToFront);
				redisUtil.set("articlelist", json);
			}
		}catch(Exception e){
			e.printStackTrace();
			//logger.debug("getArticleList:{}",e);
			allArticleListToFront = tbArticlelistMapper.getAllArticleListToFront();
		}
		for (int i = 0; i < allArticleListToFront.size(); i++) {
			articlelist=allArticleListToFront.get(i);
			if(articlelist.getA_id()==aId){
				like=articlelist.getA_like()+1;
				articlelist.setA_like(like);
			}
		}
		try{
			String jsonlist = JsonUtils.objectToJson(allArticleListToFront);
			redisUtil.set("articlelist", jsonlist);
			articlelist2.setA_like(like);
		}catch(Exception e){
			logger.debug("getArticleList:{}",e);
			TbArticle tbArticle = new TbArticle();
			tbArticle.setaId(aId);
			tbArticle.setaLike(like);
			tbArticleMapper.updateByPrimaryKeySelective(tbArticle);
		}
		return BlogsResult.ok(articlelist2);
	}

	@Override
	public List<TbArticlelist> getLikeArticleList() {
		// TODO Auto-generated method stub
		List<TbArticlelist> tbArticlelist=new ArrayList<>();
		TbArticleExample tbArticleExample = new TbArticleExample();
		
		tbArticleExample.setOrderByClause("a_like DESC");
		List<TbArticle> selectByExample = tbArticleMapper.selectByExample(tbArticleExample);
		for (int i = 0; i < selectByExample.size(); i++) {
			TbArticle tbArticle = selectByExample.get(i);
			TbClassify tbClassify = tbClassifyMapper.selectByPrimaryKey(tbArticle.getClId());
			TbArticlelist tbArticlelisted = new TbArticlelist();
			tbArticlelisted.setA_id(tbArticle.getaId());
			tbArticlelisted.setA_img(tbArticle.getaImg());
			tbArticlelisted.setA_title(tbArticle.getaTitle());
			tbArticlelisted.setCl_category(tbClassify.getClCategory());
			tbArticlelist.add(tbArticlelisted);
			if(i==1){
				break;
			}
			
		}
		return tbArticlelist;
	}

}
