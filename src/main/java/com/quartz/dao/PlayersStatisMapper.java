package com.quartz.dao;

import com.quartz.model.PlayersStatis;

public interface PlayersStatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayersStatis record);

    int insertSelective(PlayersStatis record);

    PlayersStatis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayersStatis record);

    int updateByPrimaryKey(PlayersStatis record);
}