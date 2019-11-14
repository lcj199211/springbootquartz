package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class PlayersMissing implements Serializable {
    /**
     * Column: players_missing.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: players_missing.tournament_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer tournamentId;

    /**
     * Column: players_missing.player_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer playerId;

    /**
     * Column: players_missing.player_name
    @mbggenerated 2019-11-13 10:46:05
     */
    private String playerName;

    /**
     * Column: players_missing.reason
    @mbggenerated 2019-11-13 10:46:05
     */
    private String reason;

    /**
     * Column: players_missing.registeredTime
    @mbggenerated 2019-11-13 10:46:05
     */
    private Date registeredtime;

    /**
     * Table: players_missing
    @mbggenerated 2019-11-13 10:46:05
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getRegisteredtime() {
        return registeredtime;
    }

    public void setRegisteredtime(Date registeredtime) {
        this.registeredtime = registeredtime;
    }
}