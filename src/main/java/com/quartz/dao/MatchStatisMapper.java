package com.quartz.dao;

import com.quartz.model.MatchStatis;

public interface MatchStatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchStatis record);

    int insertSelective(MatchStatis record);

    MatchStatis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchStatis record);

    int updateByPrimaryKey(MatchStatis record);
}