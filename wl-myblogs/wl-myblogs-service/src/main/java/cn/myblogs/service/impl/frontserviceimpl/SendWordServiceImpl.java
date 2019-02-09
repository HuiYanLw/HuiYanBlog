package cn.myblogs.service.impl.frontserviceimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.myblogs.comment.pojo.Pagingbean;
import cn.myblogs.comment.util.FrontPageUtils;
import cn.myblogs.comment.util.JsonUtils;
import cn.myblogs.comment.util.RedisUtil;
import cn.myblogs.mapper.TbSendwordMapper;
import cn.myblogs.pojo.TbSendword;
import cn.myblogs.pojo.TbSendwordExample;
import cn.myblogs.service.frontservice.SendWordService;

@Service
public class SendWordServiceImpl implements SendWordService {

	@Autowired 
	private TbSendwordMapper tbSendwordMapper;
	@Autowired
	private RedisUtil redisUtil;
	@Override
	public void AddSendWording(String username, String content) {
		// TODO Auto-generated method stub
		TbSendword tbSendword = new TbSendword();
		tbSendword.setmName(username);
		tbSendword.setmContent(content);
		try{
			if(redisUtil.hasKey("sendwordlist")){
				String string = JsonUtils.objectToJson(tbSendword);
				redisUtil.lLeftPush("sendwordlist",string);
			}else{
				tbSendwordMapper.insertSelective(tbSendword);
			}
		}catch(Exception e){
			System.out.println(e);
			tbSendwordMapper.insertSelective(tbSendword);
		}
	}
	@Override
	public Pagingbean<TbSendword> getSendWordList(Integer currentpage, Integer numberpage) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Pagingbean<TbSendword> pagingbean = new Pagingbean<TbSendword>();
		List<TbSendword> sendwordlist=new ArrayList<>();
		
		try{
			if(redisUtil.hasKey("sendwordlist")){
				List<String> list = redisUtil.lRange("sendwordlist", 0, -1);
				for (String string : list) {
					TbSendword jsonToPojo = JsonUtils.jsonToPojo(string, TbSendword.class);
					sendwordlist.add(jsonToPojo);
				}
				
			}else{
				TbSendwordExample tbSendwordExample = new TbSendwordExample();
				tbSendwordExample.setOrderByClause("m_id ASC");
				sendwordlist= tbSendwordMapper.selectByExample(tbSendwordExample);
				for (TbSendword tbSendword : sendwordlist) {
					String string = JsonUtils.objectToJson(tbSendword);
					redisUtil.lLeftPush("sendwordlist", string);
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			TbSendwordExample tbSendwordExample = new TbSendwordExample();
			tbSendwordExample.setOrderByClause("m_id ASC");
			sendwordlist= tbSendwordMapper.selectByExample(tbSendwordExample);
		}
		pagingbean.setTotanumber(sendwordlist.size());
		sendwordlist=FrontPageUtils.setPagelist(sendwordlist, currentpage, numberpage);
		pagingbean.setObjected(sendwordlist);
		return pagingbean;
	}

}
