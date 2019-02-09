package cn.myblogs.controller.frontcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbArticlelist;
import cn.myblogs.service.frontservice.ArticleService;


@Controller
public class FrontArticleController {
	@Autowired
	private ArticleService articleService;
	
	//获取文章列表（运用redis缓存数据）
	@RequestMapping(value="/Article/GetArticleList",method=RequestMethod.POST)
	@ResponseBody
	public String getArticleList(Integer currentpage, Integer numberpage){
		Pagingbean<TbArticlelist> articleList = articleService.getArticleList(currentpage,numberpage);
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticlelist.class,"a_id","a_title","cl_content","a_like","a_read","a_time","a_writer","a_summary","a_img");
		String jsonString = JSON.toJSONString(articleList,simplePropertyPreFilter);
		return jsonString;
	}
	
	//获取学无止境文章列表（运用redis缓存数据）
	@RequestMapping(value="/Article/GetArticleListByClassifyId",method=RequestMethod.POST)
	@ResponseBody
	public String getArticleListByClassifyId(Integer currentpage, Integer numberpage,Integer cl_category){
		Pagingbean<TbArticlelist> skillarticleList = articleService.getArticleListByClassifyId(currentpage, numberpage, cl_category);
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticlelist.class,"a_id","a_title","cl_content","a_like","a_read","a_time","a_writer","a_summary","a_img");
		String jsonString = JSON.toJSONString(skillarticleList,simplePropertyPreFilter);
		return jsonString;
	}
	
	//获取学无止境分类文章列表（运用redis缓存数据）
	@RequestMapping(value="/Article/getClassifyArticlelistByCid",method=RequestMethod.POST)
	@ResponseBody
	public String getClassifyArticlelistByCid(Integer currentpage, Integer numberpage,Integer cl_id){
		Pagingbean<TbArticlelist> skillarticleList = articleService.getClassifyArticlelistByCid(currentpage, numberpage, cl_id);
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticlelist.class,"a_id","a_title","cl_content","a_like","a_read","a_time","a_writer","a_summary","a_img");
		String jsonString = JSON.toJSONString(skillarticleList,simplePropertyPreFilter);
		return jsonString;
	}
	
	//获取文章内容
	@RequestMapping(value="/Article/GetArticleContent/{aId}",method=RequestMethod.GET)
	public String GetArticleContent(@PathVariable long aId,Model model){
		String a_id=aId+"";
		Integer Aid=Integer.valueOf(a_id.substring(10));
		List<TbArticlelist> getArticleContent = articleService.GetArticleContent(Aid);
		model.addAttribute("ArticleContent", getArticleContent);
		if(getArticleContent.size()!=0&&getArticleContent!=null){
			TbArticlelist tbArticlelist = getArticleContent.get(0);
			if(tbArticlelist.getCl_category().equals("1")){
				model.addAttribute("classify", "学无止境");
			}
			if(tbArticlelist.getCl_category().equals("2")){
				model.addAttribute("classify", "慢生活");
			}
		}
		return "/frontjsp/articlecontent";
	}
	
	//增加点赞数量
	@RequestMapping(value="/Article/addLikeNumber",method=RequestMethod.POST)
	@ResponseBody
	public String addLikeNumber(Integer aId){
		 BlogsResult likeNumber = articleService.addLikeNumber(aId);
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticlelist.class,"a_like");
		String jsonString = JSON.toJSONString(likeNumber,simplePropertyPreFilter);
		return jsonString;
	}
	
	//获得读者最喜爱文章
	@RequestMapping(value="/Article/GetLikeArticleList",method=RequestMethod.POST)
	@ResponseBody
	public String getLikeArticleList(){
		List<TbArticlelist> likeArticleList = articleService.getLikeArticleList();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticlelist.class,"a_id","a_title","a_img","cl_category");
		String jsonString = JSON.toJSONString(likeArticleList,simplePropertyPreFilter);
		return jsonString;
	}
}
