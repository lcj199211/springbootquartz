package com.quartz.dao;

import com.quartz.model.MatchScores;

public interface MatchScoresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchScores record);

    int insertSelective(MatchScores record);

    MatchScores selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchScores record);

    int updateByPrimaryKey(MatchScores record);
}