package com.quartz.model;

import java.io.Serializable;

public class MatchStatis implements Serializable {
    /**
     * Column: match_statis.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: match_statis.match_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer matchId;

    /**
     * Column: match_statis.type_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeId;

    /**
     * Column: match_statis.type_cn_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeCnName;

    /**
     * Column: match_statis.type_en_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeEnName;

    /**
     * Column: match_statis.Team1
    @mbggenerated 2019-11-13 10:46:05
     */
    private String team1;

    /**
     * Column: match_statis.team2
    @mbggenerated 2019-11-13 10:46:05
     */
    private String team2;

    /**
     * Table: match_statis
    @mbggenerated 2019-11-13 10:46:05
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeCnName() {
        return typeCnName;
    }

    public void setTypeCnName(String typeCnName) {
        this.typeCnName = typeCnName;
    }

    public String getTypeEnName() {
        return typeEnName;
    }

    public void setTypeEnName(String typeEnName) {
        this.typeEnName = typeEnName;
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