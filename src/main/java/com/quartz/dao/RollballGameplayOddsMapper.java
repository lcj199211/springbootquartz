package com.quartz.dao;

import com.quartz.model.RollballGameplayOdds;

public interface RollballGameplayOddsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RollballGameplayOdds record);

    int insertSelective(RollballGameplayOdds record);

    RollballGameplayOdds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RollballGameplayOdds record);

    int updateByPrimaryKey(RollballGameplayOdds record);
}