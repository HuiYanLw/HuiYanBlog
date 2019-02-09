package cn.myblogs.mapper;

import cn.myblogs.pojo.TbSendword;
import cn.myblogs.pojo.TbSendwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSendwordMapper {
    int countByExample(TbSendwordExample example);

    int deleteByExample(TbSendwordExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(TbSendword record);

    int insertSelective(TbSendword record);

    List<TbSendword> selectByExample(TbSendwordExample example);

    TbSendword selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") TbSendword record, @Param("example") TbSendwordExample example);

    int updateByExample(@Param("record") TbSendword record, @Param("example") TbSendwordExample example);

    int updateByPrimaryKeySelective(TbSendword record);

    int updateByPrimaryKey(TbSendword record);
}