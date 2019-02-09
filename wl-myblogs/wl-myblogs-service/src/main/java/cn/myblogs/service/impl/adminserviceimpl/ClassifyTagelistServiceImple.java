package cn.myblogs.service.impl.adminserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.mapper.TbClassifyMapper;
import cn.myblogs.mapper.TbClassifyNumberMapper;
import cn.myblogs.pojo.TbClassify;
import cn.myblogs.pojo.TbClassifyNumber;
import cn.myblogs.service.adminservice.ClassifyTagelistService;



/**  
 * 分类和标签编辑操作
* @ClassName: ClassifyTagelistServiceImple  
* @Description: TODO  
* @author Administrator  
* @date 2018年11月16日  
*    
*/
@Service
public class ClassifyTagelistServiceImple implements ClassifyTagelistService {

	@Autowired
	private TbClassifyMapper tbClassifyMapper;
	@Autowired
	private TbClassifyNumberMapper tbClassifyNumberMapper;
	
	public List<TbClassifyNumber> getClassifyTagelist() {
		// TODO Auto-generated method stub
		List<TbClassifyNumber> list = tbClassifyNumberMapper.getClassifyNumber();
		return list;
	}

	public BlogsResult UpdateClassify(Integer clId, String clContent) {
		// TODO Auto-generated method stub
		TbClassify tbClassify = new TbClassify();
		tbClassify.setClId(clId);
		tbClassify.setClContent(clContent);
		tbClassifyMapper.updateByPrimaryKeySelective(tbClassify);
		return new BlogsResult(200, "修改成功！", null);
	}
}
