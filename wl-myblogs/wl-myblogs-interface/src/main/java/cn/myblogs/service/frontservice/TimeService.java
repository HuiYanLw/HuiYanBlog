package cn.myblogs.service.frontservice;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.pojo.TbMood;

public interface TimeService {
	public Pagingbean<TbMood> GettimeList(Integer currentpage, Integer numberpage);
}
