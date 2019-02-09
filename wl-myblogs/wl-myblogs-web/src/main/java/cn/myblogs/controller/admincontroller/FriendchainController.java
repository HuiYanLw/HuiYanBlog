package cn.myblogs.controller.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbFriendchain;
import cn.myblogs.service.adminservice.FriendchainService;


@Controller
public class FriendchainController {
	@Autowired
	private FriendchainService friendchainService;
	//增加友情链接
	@RequestMapping(value="/19971224wls/Friendchain/AddFriendchain",method=RequestMethod.POST)
	public String addFriendchain(String Fname,String Furl){
		friendchainService.addFriendchain(Fname,Furl);
		return "redirect:/19971224wls/Friendchain.html";//adminjsp/friendchain
	}
	//获取友情链接列表
	@RequestMapping(value="/19971224wls/Friendchain/GetFriendchainlist",method=RequestMethod.POST)
	@ResponseBody
	public String getFriendchainlist(Integer currentpage,Integer numberpage){
		Pagingbean<TbFriendchain> friendchainlist = friendchainService.getFriendchainlist(currentpage,numberpage);
		return JsonUtils.objectToJson(friendchainlist);
	}
	//删除友情链接
	@RequestMapping(value="/19971224wls/Friendchain/DeleteFriendchain",method=RequestMethod.POST)
	@ResponseBody
	public String deleteFriendchain(Integer fId){
		BlogsResult blogsResult=friendchainService.deleteFriendchain(fId);
		return JsonUtils.objectToJson(blogsResult);
	}
	//删除多条友情链接
	@RequestMapping(value="/19971224wls/Friendchain/DeleteFriendchainlist",method=RequestMethod.POST)
	@ResponseBody
	public String deleteFriendchainlist(Integer[] fIdlist){
		BlogsResult blogsResult=friendchainService.deleteFriendchainlist(fIdlist);
		return JsonUtils.objectToJson(blogsResult);
	}
	//获取修改友情链接
	@RequestMapping(value="/19971224wls/Friendchain/UpdateFriendchain",method=RequestMethod.POST)
	@ResponseBody
	public String updateFriendchain(Integer fId){
		BlogsResult blogsResult=friendchainService.updateFriendchain(fId);
		return JsonUtils.objectToJson(blogsResult);
	}
	//修改友情链接
	@RequestMapping(value="/19971224wls/Friendchain/UpdateFriendchainIng",method=RequestMethod.POST)
	public String updateFriendchainIng(String Fname,String Furl,Integer fId){
		friendchainService.updateFriendchainIng(Fname,Furl,fId);
		return "redirect:/19971224wls/Friendchain.html";
	}
}
