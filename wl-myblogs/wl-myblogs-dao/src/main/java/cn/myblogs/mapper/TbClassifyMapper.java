package cn.myblogs.mapper;

import cn.myblogs.pojo.TbClassify;
import cn.myblogs.pojo.TbClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClassifyMapper {
    int countByExample(TbClassifyExample example);

    int deleteByExample(TbClassifyExample example);

    int deleteByPrimaryKey(Integer clId);

    int insert(TbClassify record);

    int insertSelective(TbClassify record);

    List<TbClassify> selectByExample(TbClassifyExample example);

    TbClassify selectByPrimaryKey(Integer clId);

    int updateByExampleSelective(@Param("record") TbClassify record, @Param("example") TbClassifyExample example);

    int updateByExample(@Param("record") TbClassify record, @Param("example") TbClassifyExample example);

    int updateByPrimaryKeySelective(TbClassify record);

    int updateByPrimaryKey(TbClassify record);
}