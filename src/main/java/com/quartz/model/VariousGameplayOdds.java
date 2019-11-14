package com.quartz.model;

import java.io.Serializable;

public class VariousGameplayOdds implements Serializable {
    /**
     * Column: various_gameplay_odds.id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer id;

    /**
     * Column: various_gameplay_odds.various_gameplay_id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer variousGameplayId;

    /**
     * Column: various_gameplay_odds.type
    @mbggenerated 2019-11-13 10:46:08
     */
    private String type;

    /**
     * Column: various_gameplay_odds.value
    @mbggenerated 2019-11-13 10:46:08
     */
    private String value;

    /**
     * Column: various_gameplay_odds.value0
    @mbggenerated 2019-11-13 10:46:08
     */
    private String value0;

    /**
     * Column: various_gameplay_odds.active
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer active;

    /**
     * Table: various_gameplay_odds
    @mbggenerated 2019-11-13 10:46:08
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVariousGameplayId() {
        return variousGameplayId;
    }

    public void setVariousGameplayId(Integer variousGameplayId) {
        this.variousGameplayId = variousGameplayId;
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

    public String getValue0() {
        return value0;
    }

    public void setValue0(String value0) {
        this.value0 = value0;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}