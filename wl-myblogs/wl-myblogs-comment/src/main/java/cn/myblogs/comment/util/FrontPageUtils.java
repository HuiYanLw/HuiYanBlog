package cn.myblogs.comment.util;

import java.util.ArrayList;
import java.util.List;

public class FrontPageUtils {
	public static <T> List<T> setPagelist(List<T> list,Integer currentpage, Integer numberpage){
		List<T> listes=new ArrayList<T>();
		int start=numberpage*(currentpage-1);
		int end=numberpage*currentpage-1;
		//如果从数据库获取的数据少于结束值，则将循环list的list.size()-1
		if(end>list.size()-1){
			end=list.size()-1;
		}
		for (int i=start; i <= end; i++) {
			listes.add(list.get(i));
		}
		return listes;
	}
}
