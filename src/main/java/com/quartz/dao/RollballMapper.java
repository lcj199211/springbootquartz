package com.quartz.dao;

import com.quartz.model.Rollball;

public interface RollballMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rollball record);

    int insertSelective(Rollball record);

    Rollball selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rollball record);

    int updateByPrimaryKey(Rollball record);
}