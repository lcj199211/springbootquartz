package com.quartz.model;

import java.io.Serializable;

public class TeamsRank implements Serializable {
    /**
     * Column: teams_rank.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: teams_rank.rank
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer rank;

    /**
     * Column: teams_rank.rank_change
    @mbggenerated 2019-11-13 10:46:07
     */
    private String rankChange;

    /**
     * Column: teams_rank.team_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer teamId;

    /**
     * Column: teams_rank.team_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String teamName;

    /**
     * Table: teams_rank
    @mbggenerated 2019-11-13 10:46:07
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRankChange() {
        return rankChange;
    }

    public void setRankChange(String rankChange) {
        this.rankChange = rankChange;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}