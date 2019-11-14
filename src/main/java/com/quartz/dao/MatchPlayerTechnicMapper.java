package com.quartz.dao;

import com.quartz.model.MatchPlayerTechnic;

public interface MatchPlayerTechnicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchPlayerTechnic record);

    int insertSelective(MatchPlayerTechnic record);

    MatchPlayerTechnic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchPlayerTechnic record);

    int updateByPrimaryKey(MatchPlayerTechnic record);
}