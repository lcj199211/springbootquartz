package com.quartz.dao;

import com.quartz.model.Teams;

public interface TeamsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teams record);

    int insertSelective(Teams record);

    Teams selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
}