package com.fulihui.prizecore.dal.dao;

import com.fulihui.prizecore.dal.dataobj.PrizeInfo;
import com.fulihui.prizecore.dal.dataobj.PrizeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeInfoMapper {
    long countByExample(PrizeInfoExample example);

    int deleteByExample(PrizeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrizeInfo record);

    int insertSelective(PrizeInfo record);

    List<PrizeInfo> selectByExample(PrizeInfoExample example);

    PrizeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);

    int updateByExample(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);

    int updateByPrimaryKeySelective(PrizeInfo record);

    int updateByPrimaryKey(PrizeInfo record);
}