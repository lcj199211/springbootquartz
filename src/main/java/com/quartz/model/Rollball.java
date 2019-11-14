package com.quartz.model;

import java.io.Serializable;

public class Rollball implements Serializable {
    /**
     * Column: rollball.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: rollball.match_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer matchId;

    /**
     * Column: rollball.bet_status
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer betStatus;

    /**
     * Table: rollball
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getBetStatus() {
        return betStatus;
    }

    public void setBetStatus(Integer betStatus) {
        this.betStatus = betStatus;
    }
}