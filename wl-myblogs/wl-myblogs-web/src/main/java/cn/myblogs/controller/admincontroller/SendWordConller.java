package cn.myblogs.controller.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbSendword;
import cn.myblogs.service.adminservice.AdSendWordService;


@Controller
public class SendWordConller {
	@Autowired
	private AdSendWordService adSendWordService;
	
	//获得寄语列表
	@RequestMapping(value="/19971224wls/GetSendWordlist",method=RequestMethod.POST)
	@ResponseBody
	public String getSendWordlist(Integer currentpage, Integer numberpage){
		Pagingbean<TbSendword> sendwordbean=adSendWordService.getSendWordlist(currentpage,numberpage);
		return JsonUtils.objectToJson(sendwordbean);
	}
	//删除寄语
	@RequestMapping(value="/19971224wls/DeleteSendWord",method=RequestMethod.POST)
	@ResponseBody
	public String deleteSendWord(Integer mId){
		BlogsResult blogsResult=adSendWordService.deleteSendWord(mId);
		return JsonUtils.objectToJson(blogsResult);
	}
	//删除多条寄语
	@RequestMapping(value="/19971224wls/DeleteSendWordlist",method=RequestMethod.POST)
	@ResponseBody
	public String deleteSendWordlist(Integer[] mIdlist){
		BlogsResult blogsResult=adSendWordService.deleteSendWordlist(mIdlist);
		return JsonUtils.objectToJson(blogsResult);
	}
}
