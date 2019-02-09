package cn.myblogs.service.adminservice;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbMood;

public interface MoodService {

	//增加心情墙数据
	BlogsResult addMood(String moContent);

	//获取心情墙数据
	Pagingbean<TbMood> getMoodlist(Integer currentpage, Integer numberpage);

	//删除心情墙数据
	BlogsResult deleteMood(Integer moId);

	//删除多条心情墙数据
	BlogsResult deleteMoodlist(Integer[] moIdlist);

	

}
