package cn.myblogs.service.adminservice;

import cn.myblogs.comment.pojo.Maines;

public interface MainService {

	//获得文章、留言、友情链接的总数
	Maines getArticleAndCommentAndFriendchainNumber();
	
}
