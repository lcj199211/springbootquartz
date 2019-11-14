package com.quartz.model;

import java.io.Serializable;

public class MatchPlayerTechnic implements Serializable {
    /**
     * Column: match_player_technic.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: match_player_technic.match_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer matchId;

    /**
     * Column: match_player_technic.team_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private String teamId;

    /**
     * Column: match_player_technic.player_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private String playerId;

    /**
     * Column: match_player_technic.position
    @mbggenerated 2019-11-13 10:46:05
     */
    private String position;

    /**
     * Column: match_player_technic.start
    @mbggenerated 2019-11-13 10:46:05
     */
    private String start;

    /**
     * Column: match_player_technic.play_time
    @mbggenerated 2019-11-13 10:46:05
     */
    private String playTime;

    /**
     * Column: match_player_technic.field_goal_made
    @mbggenerated 2019-11-13 10:46:05
     */
    private String fieldGoalMade;

    /**
     * Column: match_player_technic.field_goal_attempted
    @mbggenerated 2019-11-13 10:46:05
     */
    private String fieldGoalAttempted;

    /**
     * Column: match_player_technic.three_point_made
    @mbggenerated 2019-11-13 10:46:05
     */
    private String threePointMade;

    /**
     * Column: match_player_technic.three_point_attempted
    @mbggenerated 2019-11-13 10:46:05
     */
    private String threePointAttempted;

    /**
     * Column: match_player_technic.free_throw_made
    @mbggenerated 2019-11-13 10:46:05
     */
    private String freeThrowMade;

    /**
     * Column: match_player_technic.free_throw_attempted
    @mbggenerated 2019-11-13 10:46:05
     */
    private String freeThrowAttempted;

    /**
     * Column: match_player_technic.point
    @mbggenerated 2019-11-13 10:46:05
     */
    private String point;

    /**
     * Column: match_player_technic.rebound
    @mbggenerated 2019-11-13 10:46:05
     */
    private String rebound;

    /**
     * Column: match_player_technic.assist
    @mbggenerated 2019-11-13 10:46:05
     */
    private String assist;

    /**
     * Column: match_player_technic.steal
    @mbggenerated 2019-11-13 10:46:05
     */
    private String steal;

    /**
     * Column: match_player_technic.turnover
    @mbggenerated 2019-11-13 10:46:05
     */
    private String turnover;

    /**
     * Column: match_player_technic.block
    @mbggenerated 2019-11-13 10:46:05
     */
    private String block;

    /**
     * Column: match_player_technic.foul
    @mbggenerated 2019-11-13 10:46:05
     */
    private String foul;

    /**
     * Column: match_player_technic.offensive_rebound
    @mbggenerated 2019-11-13 10:46:05
     */
    private String offensiveRebound;

    /**
     * Column: match_player_technic.defensive_rebound
    @mbggenerated 2019-11-13 10:46:05
     */
    private String defensiveRebound;

    /**
     * Table: match_player_technic
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

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public String getFieldGoalMade() {
        return fieldGoalMade;
    }

    public void setFieldGoalMade(String fieldGoalMade) {
        this.fieldGoalMade = fieldGoalMade;
    }

    public String getFieldGoalAttempted() {
        return fieldGoalAttempted;
    }

    public void setFieldGoalAttempted(String fieldGoalAttempted) {
        this.fieldGoalAttempted = fieldGoalAttempted;
    }

    public String getThreePointMade() {
        return threePointMade;
    }

    public void setThreePointMade(String threePointMade) {
        this.threePointMade = threePointMade;
    }

    public String getThreePointAttempted() {
        return threePointAttempted;
    }

    public void setThreePointAttempted(String threePointAttempted) {
        this.threePointAttempted = threePointAttempted;
    }

    public String getFreeThrowMade() {
        return freeThrowMade;
    }

    public void setFreeThrowMade(String freeThrowMade) {
        this.freeThrowMade = freeThrowMade;
    }

    public String getFreeThrowAttempted() {
        return freeThrowAttempted;
    }

    public void setFreeThrowAttempted(String freeThrowAttempted) {
        this.freeThrowAttempted = freeThrowAttempted;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getRebound() {
        return rebound;
    }

    public void setRebound(String rebound) {
        this.rebound = rebound;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
        this.assist = assist;
    }

    public String getSteal() {
        return steal;
    }

    public void setSteal(String steal) {
        this.steal = steal;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFoul() {
        return foul;
    }

    public void setFoul(String foul) {
        this.foul = foul;
    }

    public String getOffensiveRebound() {
        return offensiveRebound;
    }

    public void setOffensiveRebound(String offensiveRebound) {
        this.offensiveRebound = offensiveRebound;
    }

    public String getDefensiveRebound() {
        return defensiveRebound;
    }

    public void setDefensiveRebound(String defensiveRebound) {
        this.defensiveRebound = defensiveRebound;
    }
}