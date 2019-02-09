package cn.myblogs.service.adminservice;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbFriendchain;

public interface FriendchainService {

	//增加友情链接
	BlogsResult addFriendchain(String fname, String furl);

	//获取友情链接列表
	Pagingbean<TbFriendchain> getFriendchainlist(Integer currentpage, Integer numberpage);

	//删除友情链接
	BlogsResult deleteFriendchain(Integer fId);

	//删除多条友情链接
	BlogsResult deleteFriendchainlist(Integer[] fIdlist);

	//获取修改友情链接
	BlogsResult updateFriendchain(Integer fId);

	//修改友情链接
	BlogsResult updateFriendchainIng(String fname, String furl,Integer fId);

}
