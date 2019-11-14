package com.quartz.dao;

import com.quartz.model.TournamentCategory;

public interface TournamentCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TournamentCategory record);

    int insertSelective(TournamentCategory record);

    TournamentCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TournamentCategory record);

    int updateByPrimaryKey(TournamentCategory record);
}