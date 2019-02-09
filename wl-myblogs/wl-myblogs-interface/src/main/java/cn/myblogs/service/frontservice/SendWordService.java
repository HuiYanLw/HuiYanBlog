package cn.myblogs.service.frontservice;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.pojo.TbSendword;

public interface SendWordService {
	public void AddSendWording(String username, String content);
	public  Pagingbean<TbSendword> getSendWordList(Integer currentpage, Integer numberpage);
}
