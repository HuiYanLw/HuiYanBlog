package cn.myblogs.service.adminservice;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbSendword;

public interface AdSendWordService {

	//获得寄语列表
	public Pagingbean<TbSendword> getSendWordlist(Integer currentpage, Integer numberpage);

	//删除寄语
	public BlogsResult deleteSendWord(Integer mId);

	//删除多条寄语
	public BlogsResult deleteSendWordlist(Integer[] mIdlist);

}
