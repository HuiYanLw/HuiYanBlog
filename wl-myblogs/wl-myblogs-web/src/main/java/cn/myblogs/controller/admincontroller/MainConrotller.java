package cn.myblogs.controller.admincontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.pojo.Maines;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.service.adminservice.MainService;



@Controller
public class MainConrotller {
	@Autowired
	private MainService mainService;
	@RequestMapping(value="/19971224wls/GetMain",method=RequestMethod.POST)
	@ResponseBody
	private String getMain(HttpServletRequest request){
		Maines mainmessage=new Maines();
		mainmessage=mainService.getArticleAndCommentAndFriendchainNumber();
		return JsonUtils.objectToJson(mainmessage);
	}
}
