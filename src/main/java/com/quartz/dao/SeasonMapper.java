package com.quartz.dao;

import com.quartz.model.Season;

public interface SeasonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Season record);

    int insertSelective(Season record);

    Season selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Season record);

    int updateByPrimaryKey(Season record);
}