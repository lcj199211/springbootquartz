package com.quartz.model;

import java.io.Serializable;

public class MatchScores implements Serializable {
    /**
     * Column: match_scores.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: match_scores.matchid
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer matchid;

    /**
     * Column: match_scores.type
    @mbggenerated 2019-11-13 10:46:05
     */
    private String type;

    /**
     * Column: match_scores.team1
    @mbggenerated 2019-11-13 10:46:05
     */
    private String team1;

    /**
     * Column: match_scores.team2
    @mbggenerated 2019-11-13 10:46:05
     */
    private String team2;

    /**
     * Table: match_scores
    @mbggenerated 2019-11-13 10:46:05
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchid() {
        return matchid;
    }

    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
}