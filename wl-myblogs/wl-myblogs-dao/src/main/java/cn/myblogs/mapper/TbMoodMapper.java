package cn.myblogs.mapper;

import cn.myblogs.pojo.TbMood;
import cn.myblogs.pojo.TbMoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMoodMapper {
    int countByExample(TbMoodExample example);

    int deleteByExample(TbMoodExample example);

    int deleteByPrimaryKey(Integer moId);

    int insert(TbMood record);

    int insertSelective(TbMood record);

    List<TbMood> selectByExample(TbMoodExample example);

    TbMood selectByPrimaryKey(Integer moId);

    int updateByExampleSelective(@Param("record") TbMood record, @Param("example") TbMoodExample example);

    int updateByExample(@Param("record") TbMood record, @Param("example") TbMoodExample example);

    int updateByPrimaryKeySelective(TbMood record);

    int updateByPrimaryKey(TbMood record);
}