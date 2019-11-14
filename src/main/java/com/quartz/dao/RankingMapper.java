package com.quartz.dao;

import com.quartz.model.Ranking;

public interface RankingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ranking record);

    int insertSelective(Ranking record);

    Ranking selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ranking record);

    int updateByPrimaryKey(Ranking record);
}