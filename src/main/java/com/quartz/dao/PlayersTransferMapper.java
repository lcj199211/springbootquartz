package com.quartz.dao;

import com.quartz.model.PlayersTransfer;

public interface PlayersTransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayersTransfer record);

    int insertSelective(PlayersTransfer record);

    PlayersTransfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayersTransfer record);

    int updateByPrimaryKey(PlayersTransfer record);
}