package cn.myblogs.service.adminservice;



import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.pojo.UpdateArticlebean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticlelist;

public interface EditArticleService {
	//获得文章列表
	public  Pagingbean<TbArticlelist> getArticleListToAdmin(Integer currentpage,Integer numberpage);
	//获得要修改的文章的数据
	public UpdateArticlebean getUpdateArticle(Integer aId);
	//修改文章相关信息
	public BlogsResult updateArticle(TbArticle tbArticle);
	//删除单篇文章
	public BlogsResult deleteArticle(Integer aId);
	//删除多篇文章
	public BlogsResult deleteArticlelist(Integer[] aIds);
	//设置推荐文章
	public BlogsResult RecommendArticle(TbArticle tbArticle);
}
