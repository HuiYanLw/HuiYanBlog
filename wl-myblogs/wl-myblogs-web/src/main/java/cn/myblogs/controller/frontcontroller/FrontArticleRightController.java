package cn.myblogs.controller.frontcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbFriendchain;
import cn.myblogs.service.frontservice.FrontArticleRightService;

@Controller
public class FrontArticleRightController {
	@Autowired
	private FrontArticleRightService frontArticleRightService;
	
	@RequestMapping(value="/Article/GetArticleListByAgroom",method=RequestMethod.POST)
	@ResponseBody
	public String getArticleListByAgroom(){
		List<TbArticle> articleListByAgroom = frontArticleRightService.getArticleListByAgroom();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticle.class,"aId","aTitle","aImg");
		String jsonString = JSON.toJSONString(articleListByAgroom,simplePropertyPreFilter);
		return jsonString;
	}
	
	@RequestMapping(value="/Article/GetArticleListByTime",method=RequestMethod.POST)
	@ResponseBody
	public String GetArticleListByTime(){
		List<TbArticle> articleListByAgroom = frontArticleRightService.GetArticleListByTime();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticle.class,"aId","aTitle","aImg","aTime");
		String jsonString = JSON.toJSONString(articleListByAgroom,simplePropertyPreFilter);
		return jsonString;
	}
	
	@RequestMapping(value="/Article/GetArticleListByRead",method=RequestMethod.POST)
	@ResponseBody
	public String GetArticleListByRead(){
		List<TbArticle> articleListByAgroom = frontArticleRightService.GetArticleListByRead();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbArticle.class,"aId","aTitle","aImg","aTime");
		String jsonString = JSON.toJSONString(articleListByAgroom,simplePropertyPreFilter);
		return jsonString;
	}
	
	@RequestMapping(value="/Article/Getfriendchain",method=RequestMethod.POST)
	@ResponseBody
	public String Getfriendchain(){
		List<TbFriendchain> list = frontArticleRightService.Getfriendchain();
		SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(TbFriendchain.class,"fName","fUrl");
		String jsonString = JSON.toJSONString(list,simplePropertyPreFilter);
		return jsonString;
	}
}
