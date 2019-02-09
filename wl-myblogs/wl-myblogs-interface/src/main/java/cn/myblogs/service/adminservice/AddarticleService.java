package cn.myblogs.service.adminservice;


import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbArticle;

/**  
 * 添加文章
* @ClassName: AddarticleService  
* @Description: TODO  
* @author Administrator  
* @date 2018年12月25日  
*    
*/
public interface AddarticleService {
	//获取分类
	public BlogsResult getClassifyList();
	//添加文章
	public BlogsResult IncreaseArticle(TbArticle tbArticle);
}
