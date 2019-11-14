package com.quartz.dao;

import com.quartz.model.TournamentList;

public interface TournamentListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TournamentList record);

    int insertSelective(TournamentList record);

    TournamentList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TournamentList record);

    int updateByPrimaryKey(TournamentList record);
}