package com.quartz.model;

import java.io.Serializable;

public class PlayersStatis implements Serializable {
    /**
     * Column: players_statis.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: players_statis.team_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private String teamId;

    /**
     * Column: players_statis.type_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeId;

    /**
     * Column: players_statis.type_value
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeValue;

    /**
     * Column: players_statis.type_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String typeName;

    /**
     * Column: players_statis.player_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer playerId;

    /**
     * Column: players_statis.season_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer seasonId;

    /**
     * Column: players_statis.season_year
    @mbggenerated 2019-11-13 10:46:05
     */
    private String seasonYear;

    /**
     * Column: players_statis.team_cn_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String teamCnName;

    /**
     * Column: players_statis.tournament_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer tournamentId;

    /**
     * Column: players_statis.tournament_cn_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String tournamentCnName;

    /**
     * Table: players_statis
    @mbggenerated 2019-11-13 10:46:05
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }

    public String getTeamCnName() {
        return teamCnName;
    }

    public void setTeamCnName(String teamCnName) {
        this.teamCnName = teamCnName;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentCnName() {
        return tournamentCnName;
    }

    public void setTournamentCnName(String tournamentCnName) {
        this.tournamentCnName = tournamentCnName;
    }
}