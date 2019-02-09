package cn.myblogs.service.frontservice;

import java.util.List;

import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbFriendchain;

public interface FrontArticleRightService {
	public List<TbArticle> getArticleListByAgroom();
	public List<TbArticle> GetArticleListByTime();
	public List<TbArticle> GetArticleListByRead();
	public List<TbFriendchain> Getfriendchain();
}
