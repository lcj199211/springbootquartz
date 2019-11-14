package com.quartz.dao;

import com.quartz.model.Matchtips;

public interface MatchtipsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Matchtips record);

    int insertSelective(Matchtips record);

    Matchtips selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Matchtips record);

    int updateByPrimaryKey(Matchtips record);
}