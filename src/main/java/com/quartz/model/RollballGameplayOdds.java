package com.quartz.model;

import java.io.Serializable;

public class RollballGameplayOdds implements Serializable {
    /**
     * Column: rollball_gameplay_odds.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: rollball_gameplay_odds.rollball_gameplay_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer rollballGameplayId;

    /**
     * Column: rollball_gameplay_odds.type
    @mbggenerated 2019-11-13 10:46:06
     */
    private String type;

    /**
     * Column: rollball_gameplay_odds.value
    @mbggenerated 2019-11-13 10:46:06
     */
    private String value;

    /**
     * Column: rollball_gameplay_odds.actvie
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer actvie;

    /**
     * Column: rollball_gameplay_odds.outcome
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer outcome;

    /**
     * Column: rollball_gameplay_odds.void_factor
    @mbggenerated 2019-11-13 10:46:06
     */
    private String voidFactor;

    /**
     * Table: rollball_gameplay_odds
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRollballGameplayId() {
        return rollballGameplayId;
    }

    public void setRollballGameplayId(Integer rollballGameplayId) {
        this.rollballGameplayId = rollballGameplayId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getActvie() {
        return actvie;
    }

    public void setActvie(Integer actvie) {
        this.actvie = actvie;
    }

    public Integer getOutcome() {
        return outcome;
    }

    public void setOutcome(Integer outcome) {
        this.outcome = outcome;
    }

    public String getVoidFactor() {
        return voidFactor;
    }

    public void setVoidFactor(String voidFactor) {
        this.voidFactor = voidFactor;
    }
}