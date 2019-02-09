package cn.myblogs.service.frontservice;

import java.util.List;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbArticlelist;

public interface ArticleService {
	
	//获取文章列表（运用redis缓存数据）
	public  Pagingbean<TbArticlelist> getArticleList(Integer currentpage, Integer numberpage);
	//获取学无止境文章列表（运用redis缓存数据）
	public  Pagingbean<TbArticlelist> getArticleListByClassifyId(Integer currentpage, Integer numberpage,Integer cl_category);
	//获取学无止境分类文章列表
	public  Pagingbean<TbArticlelist> getClassifyArticlelistByCid(Integer currentpage, Integer numberpage,Integer cl_id);
	//获取文章内容
	public List<TbArticlelist> GetArticleContent(Integer aId);
	//增加点赞数量
	public BlogsResult addLikeNumber(Integer aId);
	//获得读者最喜爱文章
	public List<TbArticlelist> getLikeArticleList();
}
