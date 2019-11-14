package com.quartz.dao;

import com.quartz.model.UrlConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UrlConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UrlConfig record);

    int insertSelective(UrlConfig record);

    UrlConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UrlConfig record);

    int updateByPrimaryKey(UrlConfig record);

    List<UrlConfig> findAllUrlConfig();

    UrlConfig selectByMark(String mark);
}