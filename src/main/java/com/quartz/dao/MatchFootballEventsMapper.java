package com.quartz.dao;

import com.quartz.model.MatchFootballEvents;

public interface MatchFootballEventsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchFootballEvents record);

    int insertSelective(MatchFootballEvents record);

    MatchFootballEvents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchFootballEvents record);

    int updateByPrimaryKey(MatchFootballEvents record);
}