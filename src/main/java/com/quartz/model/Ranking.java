package com.quartz.model;

import java.io.Serializable;

public class Ranking implements Serializable {
    /**
     * Column: ranking.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: ranking.cn_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String cnName;

    /**
     * Column: ranking.en_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String enName;

    /**
     * Column: ranking.group_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer groupId;

    /**
     * Column: ranking.group_cn_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String groupCnName;

    /**
     * Column: ranking.tournament_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer tournamentId;

    /**
     * Column: ranking.season_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer seasonId;

    /**
     * Table: ranking
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupCnName() {
        return groupCnName;
    }

    public void setGroupCnName(String groupCnName) {
        this.groupCnName = groupCnName;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }
}