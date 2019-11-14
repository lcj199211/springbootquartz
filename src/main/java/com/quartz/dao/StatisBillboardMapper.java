package com.quartz.dao;

import com.quartz.model.StatisBillboard;

public interface StatisBillboardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StatisBillboard record);

    int insertSelective(StatisBillboard record);

    StatisBillboard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StatisBillboard record);

    int updateByPrimaryKey(StatisBillboard record);
}