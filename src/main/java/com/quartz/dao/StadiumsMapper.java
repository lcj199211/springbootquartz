package com.quartz.dao;

import com.quartz.model.Stadiums;

public interface StadiumsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stadiums record);

    int insertSelective(Stadiums record);

    Stadiums selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stadiums record);

    int updateByPrimaryKey(Stadiums record);
}