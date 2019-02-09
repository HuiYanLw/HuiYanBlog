package cn.myblogs.service.adminservice;

import java.util.List;

import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.pojo.TbClassifyNumber;

public interface ClassifyTagelistService {

	//获取分类和标签列表
	List<TbClassifyNumber> getClassifyTagelist();

	//修改分类数据
	BlogsResult UpdateClassify(Integer clId, String clContent);


}
