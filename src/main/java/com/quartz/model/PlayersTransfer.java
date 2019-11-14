package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class PlayersTransfer implements Serializable {
    /**
     * Column: players_transfer.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: players_transfer.player_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer playerId;

    /**
     * Column: players_transfer.active
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer active;

    /**
     * Column: players_transfer.role_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String roleName;

    /**
     * Column: players_transfer.shirt
    @mbggenerated 2019-11-13 10:46:06
     */
    private String shirt;

    /**
     * Column: players_transfer.start
    @mbggenerated 2019-11-13 10:46:06
     */
    private Date start;

    /**
     * Column: players_transfer.end
    @mbggenerated 2019-11-13 10:46:06
     */
    private Date end;

    /**
     * Column: players_transfer.team_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer teamId;

    /**
     * Column: players_transfer.team_cn_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String teamCnName;

    /**
     * Table: players_transfer
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamCnName() {
        return teamCnName;
    }

    public void setTeamCnName(String teamCnName) {
        this.teamCnName = teamCnName;
    }
}