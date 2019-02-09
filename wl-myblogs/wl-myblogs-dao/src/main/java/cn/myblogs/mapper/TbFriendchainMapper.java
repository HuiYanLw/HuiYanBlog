package cn.myblogs.mapper;

import cn.myblogs.pojo.TbFriendchain;
import cn.myblogs.pojo.TbFriendchainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFriendchainMapper {
    int countByExample(TbFriendchainExample example);

    int deleteByExample(TbFriendchainExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(TbFriendchain record);

    int insertSelective(TbFriendchain record);

    List<TbFriendchain> selectByExample(TbFriendchainExample example);

    TbFriendchain selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") TbFriendchain record, @Param("example") TbFriendchainExample example);

    int updateByExample(@Param("record") TbFriendchain record, @Param("example") TbFriendchainExample example);

    int updateByPrimaryKeySelective(TbFriendchain record);

    int updateByPrimaryKey(TbFriendchain record);
}