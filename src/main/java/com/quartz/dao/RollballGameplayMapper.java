package com.quartz.dao;

import com.quartz.model.RollballGameplay;

public interface RollballGameplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RollballGameplay record);

    int insertSelective(RollballGameplay record);

    RollballGameplay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RollballGameplay record);

    int updateByPrimaryKey(RollballGameplay record);
}