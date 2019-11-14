package com.quartz.dao;

import com.quartz.model.TeamsRank;

public interface TeamsRankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamsRank record);

    int insertSelective(TeamsRank record);

    TeamsRank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamsRank record);

    int updateByPrimaryKey(TeamsRank record);
}