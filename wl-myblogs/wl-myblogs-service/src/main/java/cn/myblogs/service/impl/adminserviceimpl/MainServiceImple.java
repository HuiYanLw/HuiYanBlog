package cn.myblogs.service.impl.adminserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.pojo.Maines;
import cn.myblogs.mapper.TbArticleMapper;
import cn.myblogs.mapper.TbFriendchainMapper;
import cn.myblogs.mapper.TbSendwordMapper;
import cn.myblogs.pojo.TbArticleExample;
import cn.myblogs.pojo.TbFriendchainExample;
import cn.myblogs.pojo.TbSendwordExample;
import cn.myblogs.service.adminservice.MainService;




/**  
 * 后台首页相关数据展示
* @ClassName: MainServiceImple  
* @Description: TODO  
* @author Administrator  
* @date 2018年11月16日  
*    
*/
@Service
public class MainServiceImple implements MainService {

	@Autowired
	private TbArticleMapper tbArticleMapper;
	@Autowired
	private TbSendwordMapper tbSendwordMapper;
	@Autowired
	private TbFriendchainMapper tbFriendchainMapper;
	
	public Maines getArticleAndCommentAndFriendchainNumber() {
		// TODO Auto-generated method stub
		Maines maines = new Maines();
		TbArticleExample tbArticleExample = new TbArticleExample();
		TbSendwordExample tbSendwordExample = new TbSendwordExample();
		TbFriendchainExample tbFriendchainExample = new TbFriendchainExample();
		//获取并设置文章总记录
		maines.setArticlenumber(tbArticleMapper.countByExample(tbArticleExample));
		//获取并设置留言总记录
		maines.setMessageboardnumber(tbSendwordMapper.countByExample(tbSendwordExample));
		//获取并设置友情链接总记录
		maines.setFlinknumber(tbFriendchainMapper.countByExample(tbFriendchainExample));
		return maines;
	}

}
