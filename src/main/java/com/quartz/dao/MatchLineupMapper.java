package com.quartz.dao;

import com.quartz.model.MatchLineup;

public interface MatchLineupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchLineup record);

    int insertSelective(MatchLineup record);

    MatchLineup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchLineup record);

    int updateByPrimaryKey(MatchLineup record);
}