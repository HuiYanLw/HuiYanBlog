package cn.myblogs.mapper;

import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbArticleMapper {
    int countByExample(TbArticleExample example);

    int deleteByExample(TbArticleExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(TbArticle record);

    int insertSelective(TbArticle record);

    List<TbArticle> selectByExampleWithBLOBs(TbArticleExample example);

    List<TbArticle> selectByExample(TbArticleExample example);

    TbArticle selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExample(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByPrimaryKeySelective(TbArticle record);

    int updateByPrimaryKeyWithBLOBs(TbArticle record);

    int updateByPrimaryKey(TbArticle record);
}