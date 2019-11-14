package com.quartz.dao;

import com.quartz.model.Players;

public interface PlayersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Players record);

    int insertSelective(Players record);

    Players selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Players record);

    int updateByPrimaryKey(Players record);
}