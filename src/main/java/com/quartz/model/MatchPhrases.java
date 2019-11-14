package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class MatchPhrases implements Serializable {
    /**
     * Column: match_phrases.id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer id;

    /**
     * Column: match_phrases.match_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer matchId;

    /**
     * Column: match_phrases.sport_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer sportId;

    /**
     * Column: match_phrases.team
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer team;

    /**
     * Column: match_phrases.time_played
    @mbggenerated 2019-11-13 10:46:04
     */
    private Date timePlayed;

    /**
     * Column: match_phrases.time_remain
    @mbggenerated 2019-11-13 10:46:04
     */
    private Date timeRemain;

    /**
     * Column: match_phrases.status_code
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer statusCode;

    /**
     * Column: match_phrases.status_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String statusName;

    /**
     * Column: match_phrases.type_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer typeId;

    /**
     * Column: match_phrases.type_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String typeName;

    /**
     * Column: match_phrases.phase
    @mbggenerated 2019-11-13 10:46:04
     */
    private String phase;

    /**
     * Column: match_phrases.x
    @mbggenerated 2019-11-13 10:46:04
     */
    private String x;

    /**
     * Column: match_phrases.y
    @mbggenerated 2019-11-13 10:46:04
     */
    private String y;

    /**
     * Column: match_phrases.player_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private String playerId;

    /**
     * Column: match_phrases.player_id2
    @mbggenerated 2019-11-13 10:46:04
     */
    private String playerId2;

    /**
     * Column: match_phrases.goal_type
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer goalType;

    /**
     * Column: match_phrases.score
    @mbggenerated 2019-11-13 10:46:04
     */
    private String score;

    /**
     * Column: match_phrases.sub_score
    @mbggenerated 2019-11-13 10:46:04
     */
    private String subScore;

    /**
     * Column: match_phrases.create_time
    @mbggenerated 2019-11-13 10:46:04
     */
    private Date createTime;

    /**
     * Column: match_phrases.deleted
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer deleted;

    /**
     * Table: match_phrases
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

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Date getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Date timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Date getTimeRemain() {
        return timeRemain;
    }

    public void setTimeRemain(Date timeRemain) {
        this.timeRemain = timeRemain;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
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

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerId2() {
        return playerId2;
    }

    public void setPlayerId2(String playerId2) {
        this.playerId2 = playerId2;
    }

    public Integer getGoalType() {
        return goalType;
    }

    public void setGoalType(Integer goalType) {
        this.goalType = goalType;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubScore() {
        return subScore;
    }

    public void setSubScore(String subScore) {
        this.subScore = subScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}