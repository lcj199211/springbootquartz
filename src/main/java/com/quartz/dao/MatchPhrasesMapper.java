package com.quartz.dao;

import com.quartz.model.MatchPhrases;

public interface MatchPhrasesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchPhrases record);

    int insertSelective(MatchPhrases record);

    MatchPhrases selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchPhrases record);

    int updateByPrimaryKey(MatchPhrases record);
}