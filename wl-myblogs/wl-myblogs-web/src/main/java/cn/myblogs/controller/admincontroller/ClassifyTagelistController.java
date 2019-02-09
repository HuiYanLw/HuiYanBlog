package cn.myblogs.controller.admincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.pojo.TbClassifyNumber;
import cn.myblogs.service.adminservice.ClassifyTagelistService;


@Controller
public class ClassifyTagelistController {
	@Autowired
	private  ClassifyTagelistService classifyTagelistService;
	
	//获取分类和标签列表
	@RequestMapping(value="/19971224wls/GetClassifyTagelist",method=RequestMethod.POST)
	@ResponseBody
	private String getClassifyTagelist(){
		List<TbClassifyNumber> classifyTagelist = classifyTagelistService.getClassifyTagelist();
		return JsonUtils.objectToJson(classifyTagelist);
	}
	//修改分类数据
	@RequestMapping(value="/19971224wls/UpdateClassify",method=RequestMethod.POST)
	@ResponseBody
	private String UpdateClassify(Integer clId,String clContent){
		BlogsResult blogsResult= classifyTagelistService.UpdateClassify(clId,clContent);
		return JsonUtils.objectToJson(blogsResult);
	}
}
