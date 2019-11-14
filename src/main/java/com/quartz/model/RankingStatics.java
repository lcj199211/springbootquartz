package com.quartz.model;

import java.io.Serializable;

public class RankingStatics implements Serializable {
    /**
     * Column: ranking_statics.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: ranking_statics.team_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer teamId;

    /**
     * Column: ranking_statics.type_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer typeId;

    /**
     * Column: ranking_statics.type_cn_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer typeCnName;

    /**
     * Column: ranking_statics.type_en_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String typeEnName;

    /**
     * Column: ranking_statics.value
    @mbggenerated 2019-11-13 10:46:06
     */
    private String value;

    /**
     * Table: ranking_statics
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeCnName() {
        return typeCnName;
    }

    public void setTypeCnName(Integer typeCnName) {
        this.typeCnName = typeCnName;
    }

    public String getTypeEnName() {
        return typeEnName;
    }

    public void setTypeEnName(String typeEnName) {
        this.typeEnName = typeEnName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}