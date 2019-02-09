package cn.myblogs.controller.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.pojo.UpdateArticlebean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticlelist;
import cn.myblogs.pojo.TbClassify;
import cn.myblogs.service.adminservice.AddarticleService;
import cn.myblogs.service.adminservice.EditArticleService;

@Controller
public class ArticleController {
	@Autowired
	private AddarticleService addarticleService;
	@Autowired
	private EditArticleService editArticleService;
	
	//获取分类列表
	@RequestMapping(value ="/19971224wls/addArticle/getClassifyList",method=RequestMethod.POST)
	@ResponseBody
	public String getClassTagesList(){
		BlogsResult classTagesList = addarticleService.getClassifyList();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbClassify.class,"clId","clContent");
		String jsonString = JSON.toJSONString(classTagesList,simplePropertyPreFilter);
		return jsonString;
	}
	
	//添加文章相关信息
	@RequestMapping(value="/19971224wls/addArticle/IncreaseArticle.html",method=RequestMethod.POST)
	@ResponseBody
	public String IncreaseArticle(TbArticle tbArticle){
		BlogsResult articleAndTags = addarticleService.IncreaseArticle(tbArticle);
		return JsonUtils.objectToJson(articleAndTags);
	}
	
	//获得文章列表
	@RequestMapping(value="/19971224wls/EditArticle/getArticleListToAdmin",method=RequestMethod.POST)
	@ResponseBody
	public String getArticleListToAdmin(Integer currentpage, Integer numberpage){
		 Pagingbean<TbArticlelist> articleListToAdmin = editArticleService.getArticleListToAdmin(currentpage, numberpage);
		return JsonUtils.objectToJson(articleListToAdmin);
	}
	
	//获得要修改的文章的数据
	@RequestMapping(value="/19971224wls/EditArticle/GetUpdateArticle",method=RequestMethod.POST)
	@ResponseBody
	public String getUpdateArticle(Integer aId){
		UpdateArticlebean updateArticle = editArticleService.getUpdateArticle(aId);
		return JsonUtils.objectToJson(updateArticle);
	}
	
	//修改文章相关信息
	@RequestMapping(value="/19971224wls/EditArticle/UpdateArticle",method=RequestMethod.POST)
	@ResponseBody
	public String updateArticle(TbArticle tbArticle){
		BlogsResult updateArticle = editArticleService.updateArticle(tbArticle);
		return JsonUtils.objectToJson(updateArticle);
	}
	
	//删除单篇文章()
	@RequestMapping(value="/19971224wls/EditArticle/deleteArticle",method=RequestMethod.POST)
	@ResponseBody
	public String deleteArticle(Integer aId){
		BlogsResult deleteArticle = editArticleService.deleteArticle(aId);
		return JsonUtils.objectToJson(deleteArticle);
	}
	//删除多篇文章
	@RequestMapping(value="/19971224wls/EditArticle/deleteArticlelist",method=RequestMethod.POST)
	@ResponseBody
	public String deleteArticlelist(Integer[] aIds){
		BlogsResult deteleArticlelist = editArticleService.deleteArticlelist(aIds);
		return JsonUtils.objectToJson(deteleArticlelist);
	}
	
	//设置推荐文章
	@RequestMapping(value="/19971224wls/EditArticle/RecommendArticle",method=RequestMethod.POST)
	@ResponseBody
	public String RecommendArticle(TbArticle tbArticle){
		BlogsResult deteleArticlelist = editArticleService.RecommendArticle(tbArticle);
		return JsonUtils.objectToJson(deteleArticlelist);
	}
}
