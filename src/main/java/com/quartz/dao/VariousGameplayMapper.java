package com.quartz.dao;

import com.quartz.model.VariousGameplay;

public interface VariousGameplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VariousGameplay record);

    int insertSelective(VariousGameplay record);

    VariousGameplay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VariousGameplay record);

    int updateByPrimaryKey(VariousGameplay record);
}