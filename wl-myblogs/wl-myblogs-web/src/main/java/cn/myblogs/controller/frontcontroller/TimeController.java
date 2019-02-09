package cn.myblogs.controller.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbMood;
import cn.myblogs.service.frontservice.TimeService;

@Controller
public class TimeController {
	@Autowired
	private TimeService timeService;
	
	//获取记录列表
	@RequestMapping(value="/Article/GettimeList",method=RequestMethod.POST)
	@ResponseBody
	public String GettimeList(Integer currentpage, Integer numberpage){
		//sendWordService.AddSendWording(username, content);
		Pagingbean<TbMood> gettimeList = timeService.GettimeList(currentpage, numberpage);
		return JsonUtils.objectToJson(gettimeList);
	}
}
