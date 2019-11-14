package com.quartz.dao;

import com.quartz.model.PlayersMissing;

public interface PlayersMissingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayersMissing record);

    int insertSelective(PlayersMissing record);

    PlayersMissing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayersMissing record);

    int updateByPrimaryKey(PlayersMissing record);
}