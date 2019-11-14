package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class MatchFootballEvents implements Serializable {
    /**
     * Column: match_football_events.id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer id;

    /**
     * Column: match_football_events.match_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer matchId;

    /**
     * Column: match_football_events.team
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer team;

    /**
     * Column: match_football_events.time
    @mbggenerated 2019-11-13 10:46:04
     */
    private Date time;

    /**
     * Column: match_football_events.x
    @mbggenerated 2019-11-13 10:46:04
     */
    private String x;

    /**
     * Column: match_football_events.y
    @mbggenerated 2019-11-13 10:46:04
     */
    private String y;

    /**
     * Column: match_football_events.type_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private String typeId;

    /**
     * Column: match_football_events.type_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String typeName;

    /**
     * Column: match_football_events.injury_time
    @mbggenerated 2019-11-13 10:46:04
     */
    private String injuryTime;

    /**
     * Column: match_football_events.player_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer playerId;

    /**
     * Column: match_football_events.player_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String playerName;

    /**
     * Column: match_football_events.player_id2
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer playerId2;

    /**
     * Column: match_football_events.player_name2
    @mbggenerated 2019-11-13 10:46:04
     */
    private String playerName2;

    /**
     * Column: match_football_events.goal_type
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer goalType;

    /**
     * Column: match_football_events.scores
    @mbggenerated 2019-11-13 10:46:04
     */
    private String scores;

    /**
     * Column: match_football_events.sort
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer sort;

    /**
     * Table: match_football_events
    @mbggenerated 2019-11-13 10:46:04
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

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(String injuryTime) {
        this.injuryTime = injuryTime;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerId2() {
        return playerId2;
    }

    public void setPlayerId2(Integer playerId2) {
        this.playerId2 = playerId2;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
    }

    public Integer getGoalType() {
        return goalType;
    }

    public void setGoalType(Integer goalType) {
        this.goalType = goalType;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}