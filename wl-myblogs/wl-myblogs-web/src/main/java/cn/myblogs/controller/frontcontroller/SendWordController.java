package cn.myblogs.controller.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.pojo.TbSendword;
import cn.myblogs.service.frontservice.SendWordService;


@Controller
public class SendWordController {
	@Autowired
	private SendWordService sendWordService;
	
	//增加寄语
	@RequestMapping(value="/Article/AddSendWording",method=RequestMethod.POST)
	@ResponseBody
	public String AddSendWording(String username, String content){
		sendWordService.AddSendWording(username, content);
		return null;
	}
	//获取寄语列表
	@RequestMapping(value="/Article/getSendWordList",method=RequestMethod.POST)
	@ResponseBody
	public String getSendWordList(Integer currentpage, Integer numberpage){
		//sendWordService.AddSendWording(username, content);
		Pagingbean<TbSendword> sendWordList = sendWordService.getSendWordList(currentpage, numberpage);
		 String string = JSON.toJSONString(sendWordList);
		return string;
	}
}
