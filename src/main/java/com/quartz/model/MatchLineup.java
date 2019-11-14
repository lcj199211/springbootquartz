package com.quartz.model;

import java.io.Serializable;

public class MatchLineup implements Serializable {
    /**
     * Column: match_lineup.id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer id;

    /**
     * Column: match_lineup.match_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer matchId;

    /**
     * Column: match_lineup.team_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer teamId;

    /**
     * Column: match_lineup.player_id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer playerId;

    /**
     * Column: match_lineup.player_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String playerName;

    /**
     * Column: match_lineup.position
    @mbggenerated 2019-11-13 10:46:04
     */
    private String position;

    /**
     * Column: match_lineup.shirt_number
    @mbggenerated 2019-11-13 10:46:04
     */
    private String shirtNumber;

    /**
     * Column: match_lineup.substitute
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer substitute;

    /**
     * Table: match_lineup
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

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(String shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public Integer getSubstitute() {
        return substitute;
    }

    public void setSubstitute(Integer substitute) {
        this.substitute = substitute;
    }
}