package com.quartz.dao;

import com.quartz.model.StadiumsCountrys;

public interface StadiumsCountrysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StadiumsCountrys record);

    int insertSelective(StadiumsCountrys record);

    StadiumsCountrys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StadiumsCountrys record);

    int updateByPrimaryKey(StadiumsCountrys record);
}