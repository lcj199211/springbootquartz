package com.quartz.dao;

import com.quartz.model.VariousGameplayOdds;

public interface VariousGameplayOddsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VariousGameplayOdds record);

    int insertSelective(VariousGameplayOdds record);

    VariousGameplayOdds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VariousGameplayOdds record);

    int updateByPrimaryKey(VariousGameplayOdds record);
}