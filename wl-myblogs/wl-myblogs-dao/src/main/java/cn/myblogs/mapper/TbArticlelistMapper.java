package cn.myblogs.mapper;

import java.util.List;

import cn.myblogs.pojo.TbArticlelist;

public interface TbArticlelistMapper {
	
	List<TbArticlelist> getArticleListToAdmin(Integer begin,Integer end);
	List<TbArticlelist> getAllArticleListToFront();
}
