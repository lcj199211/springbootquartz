package com.quartz.dao;

import com.quartz.model.StadiumsCity;

public interface StadiumsCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StadiumsCity record);

    int insertSelective(StadiumsCity record);

    StadiumsCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StadiumsCity record);

    int updateByPrimaryKey(StadiumsCity record);
}