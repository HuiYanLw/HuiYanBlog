package cn.myblogs.controller.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbMood;
import cn.myblogs.service.adminservice.MoodService;


@Controller
public class MoodController {
	@Autowired
	private MoodService moodService;
	
	//增加心情墙数据
	@RequestMapping(value="/19971224wls/Mood/AddMood",method=RequestMethod.POST)
	@ResponseBody
	public String addMood(String moContent){
		BlogsResult blogsResult=moodService.addMood(moContent);
		return JsonUtils.objectToJson(blogsResult);
	}
	//获取心情墙数据
	@RequestMapping(value="/19971224wls/Mood/GetMoodlist",method=RequestMethod.POST)
	@ResponseBody
	public String getMoodlist(Integer currentpage, Integer numberpage){
		Pagingbean<TbMood> moodlist = moodService.getMoodlist(currentpage,numberpage);
		return JsonUtils.objectToJson(moodlist);
	}
	//删除心情墙数据
	@RequestMapping(value="/19971224wls/Mood/DeleteMood",method=RequestMethod.POST)
	@ResponseBody
	public String deleteMood(Integer moId){
		BlogsResult blogsResult=moodService.deleteMood(moId);
		return JsonUtils.objectToJson(blogsResult);
	}
	
	//删除多条心情墙数据
	@RequestMapping(value="/19971224wls/Mood/DeleteMoodlist",method=RequestMethod.POST)
	@ResponseBody
	public String deleteMoodlist(Integer[] moIdlist){
		BlogsResult blogsResult=moodService.deleteMoodlist(moIdlist);
		return JsonUtils.objectToJson(blogsResult);
	}
}
