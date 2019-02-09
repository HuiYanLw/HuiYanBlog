package cn.myblogs.service.impl.adminserviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.mapper.TbFriendchainMapper;
import cn.myblogs.pojo.TbFriendchain;
import cn.myblogs.pojo.TbFriendchainExample;
import cn.myblogs.service.adminservice.FriendchainService;



/**  
 * 友情链接编辑操作
* @ClassName: FriendchainServiceImple  
* @Description: TODO  
* @author Administrator  
* @date 2018年11月16日  
*    
*/
@Service
public class FriendchainServiceImple implements FriendchainService {

	@Autowired
	private TbFriendchainMapper tbFriendchainMapper;
	
	public BlogsResult addFriendchain(String fname, String furl) {
		// TODO Auto-generated method stub
		TbFriendchain tbFriendchain = new TbFriendchain();
		tbFriendchain.setfName(fname);
		tbFriendchain.setfUrl(furl);
		tbFriendchainMapper.insertSelective(tbFriendchain);
		return new BlogsResult(200,"添加成功！",null);
	}

	public Pagingbean<TbFriendchain> getFriendchainlist(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		Pagingbean<TbFriendchain> pagingbean = new Pagingbean<TbFriendchain>();
		TbFriendchainExample tbFriendchainExample = new TbFriendchainExample();
		//获得数据的总记录
		int countByExample = tbFriendchainMapper.countByExample(tbFriendchainExample);
		pagingbean.setTotanumber(countByExample);
		List<TbFriendchain> example = tbFriendchainMapper.selectByExample(tbFriendchainExample);
		example=FrontPageUtils.setPagelist(example, currentpage, numberpage);
		pagingbean.setObjected(example);
		return pagingbean;
	}

	public BlogsResult deleteFriendchain(Integer fId) {
		// TODO Auto-generated method stub
		tbFriendchainMapper.deleteByPrimaryKey(fId);
		return new BlogsResult(200, "删除成功！", null);
	}

	public BlogsResult deleteFriendchainlist(Integer[] fIdlist) {
		// TODO Auto-generated method stub
		for (Integer integer : fIdlist) {
			tbFriendchainMapper.deleteByPrimaryKey(integer);
		}
		return new BlogsResult(200, "删除成功！", null);
	}

	public BlogsResult updateFriendchain(Integer fId) {
		// TODO Auto-generated method stub
		TbFriendchain selectByPrimaryKey = tbFriendchainMapper.selectByPrimaryKey(fId);
		return new BlogsResult(selectByPrimaryKey);
	}

	public BlogsResult updateFriendchainIng(String fname, String furl,Integer fId) {
		// TODO Auto-generated method stub
		TbFriendchain tbFriendchain = new TbFriendchain();
		tbFriendchain.setfId(fId);
		tbFriendchain.setfName(fname);
		tbFriendchain.setfUrl(furl);
		tbFriendchainMapper.updateByPrimaryKey(tbFriendchain);
		return new BlogsResult();
	}

}
