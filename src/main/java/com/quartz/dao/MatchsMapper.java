package com.quartz.dao;

import com.quartz.model.Matchs;

public interface MatchsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Matchs record);

    int insertSelective(Matchs record);

    Matchs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Matchs record);

    int updateByPrimaryKey(Matchs record);
}