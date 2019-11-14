package com.quartz.dao;

import com.quartz.model.RankingStatics;

public interface RankingStaticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RankingStatics record);

    int insertSelective(RankingStatics record);

    RankingStatics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RankingStatics record);

    int updateByPrimaryKey(RankingStatics record);
}