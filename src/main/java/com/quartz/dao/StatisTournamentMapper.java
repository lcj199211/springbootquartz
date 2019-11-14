package com.quartz.dao;

import com.quartz.model.StatisTournament;

public interface StatisTournamentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StatisTournament record);

    int insertSelective(StatisTournament record);

    StatisTournament selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StatisTournament record);

    int updateByPrimaryKey(StatisTournament record);
}