package cn.myblogs.service.impl.adminserviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.BlogsResult;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.comment.util.RedisUtil;
import cn.myblogs.mapper.TbSendwordMapper;
import cn.myblogs.pojo.TbSendword;
import cn.myblogs.pojo.TbSendwordExample;
import cn.myblogs.service.adminservice.AdSendWordService;



/** 
 * 编辑寄语操作 
* @ClassName: AdSendWordServiceImple  
* @Description: TODO  
* @author Administrator  
* @date 2018年11月16日  
*    
*/
@Service
public class AdSendWordServiceImple implements AdSendWordService {

	private static final Logger logger = LoggerFactory.getLogger(AdSendWordService.class);
	@Autowired
	private TbSendwordMapper tbSendwordMapper;
	@Autowired
	private RedisUtil redisUtil;
	public Pagingbean<TbSendword> getSendWordlist(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		//将redis中的数据存入数据库中
		List<TbSendword> sendwordlist=new ArrayList<>();
		try{
			if(redisUtil.hasKey("sendwordlist")){
				List<String> list = redisUtil.lRange("sendwordlist", 0, -1);
				for (String string : list) {
					TbSendword jsonToPojo = JsonUtils.jsonToPojo(string, TbSendword.class);
					sendwordlist.add(jsonToPojo);
				}
				redisUtil.delete("sendwordlist");
			}
		}catch(Exception e){
			logger.debug("getSendWordlistForadmin:{}",e);
		}
		if(sendwordlist.size()!=0&&sendwordlist!=null){
			//数据库相同的删除掉
			TbSendwordExample tbSendwordExample = new TbSendwordExample();
			tbSendwordExample.setOrderByClause("m_id DESC");
			List<TbSendword> selectByExample = tbSendwordMapper.selectByExample(tbSendwordExample);
			Iterator<TbSendword> iteratorToFront = sendwordlist.iterator();
			for (TbSendword tbSendwordToMysql : selectByExample) {
				while(iteratorToFront.hasNext()){
					  TbSendword next = iteratorToFront.next();
					 if(next.getmName().equals(tbSendwordToMysql.getmName())&&next.getmContent().equals(tbSendwordToMysql.getmContent())){
						 iteratorToFront.remove();
						 break;
					 }
				 }
			}
			//留下不同的增加到数据库中
			if(sendwordlist.size()!=0){
				for (TbSendword tbSendwordToFornt : sendwordlist) {
					try{
						tbSendwordMapper.insertSelective(tbSendwordToFornt);
					}catch(Exception e){
						logger.debug("getSendWordlistForadmin:{}",e);
						continue;
					}
					
				}
			}
		}
		
		Pagingbean<TbSendword> pagingbean = new Pagingbean<TbSendword>();
		TbSendwordExample tbSendwordExample = new TbSendwordExample();
		//获得寄语的总记录数
		int countByExample = tbSendwordMapper.countByExample(tbSendwordExample);
		List<TbSendword> selectByExample = tbSendwordMapper.selectByExample(tbSendwordExample);
		selectByExample=FrontPageUtils.setPagelist(selectByExample, currentpage, numberpage);
		pagingbean.setTotanumber(countByExample);
		pagingbean.setObjected(selectByExample);
		return pagingbean;
	}
	public BlogsResult deleteSendWord(Integer mId) {
		// TODO Auto-generated method stub
		tbSendwordMapper.deleteByPrimaryKey(mId);
		return new BlogsResult(200, "删除成功！", null);
	}
	public BlogsResult deleteSendWordlist(Integer[] mIdlist) {
		// TODO Auto-generated method stub
		for (Integer integer : mIdlist) {
			tbSendwordMapper.deleteByPrimaryKey(integer);
		}
		return new BlogsResult(200, "删除成功！", null);
	}

}
