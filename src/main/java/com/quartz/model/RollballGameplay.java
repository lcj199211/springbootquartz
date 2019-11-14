package com.quartz.model;

import java.io.Serializable;

public class RollballGameplay implements Serializable {
    /**
     * Column: rollball_gameplay.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: rollball_gameplay.rollball_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer rollballId;

    /**
     * Column: rollball_gameplay.type_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer typeId;

    /**
     * Column: rollball_gameplay.type_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String typeName;

    /**
     * Column: rollball_gameplay.ovalue
    @mbggenerated 2019-11-13 10:46:06
     */
    private String ovalue;

    /**
     * Column: rollball_gameplay.canceled
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer canceled;

    /**
     * Column: rollball_gameplay.cleared
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer cleared;

    /**
     * Column: rollball_gameplay.actvie
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer actvie;

    /**
     * Column: rollball_gameplay.cleared_score
    @mbggenerated 2019-11-13 10:46:06
     */
    private String clearedScore;

    /**
     * Table: rollball_gameplay
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRollballId() {
        return rollballId;
    }

    public void setRollballId(Integer rollballId) {
        this.rollballId = rollballId;
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

    public String getOvalue() {
        return ovalue;
    }

    public void setOvalue(String ovalue) {
        this.ovalue = ovalue;
    }

    public Integer getCanceled() {
        return canceled;
    }

    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }

    public Integer getCleared() {
        return cleared;
    }

    public void setCleared(Integer cleared) {
        this.cleared = cleared;
    }

    public Integer getActvie() {
        return actvie;
    }

    public void setActvie(Integer actvie) {
        this.actvie = actvie;
    }

    public String getClearedScore() {
        return clearedScore;
    }

    public void setClearedScore(String clearedScore) {
        this.clearedScore = clearedScore;
    }
}