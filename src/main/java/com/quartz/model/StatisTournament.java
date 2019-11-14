package com.quartz.model;

import java.io.Serializable;

public class StatisTournament implements Serializable {
    /**
     * Column: statis_tournament.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: statis_tournament.billboardid
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer billboardid;

    /**
     * Column: statis_tournament.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: statis_tournament.en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enName;

    /**
     * Column: statis_tournament.group_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer groupId;

    /**
     * Table: statis_tournament
    @mbggenerated 2019-11-13 10:46:07
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBillboardid() {
        return billboardid;
    }

    public void setBillboardid(Integer billboardid) {
        this.billboardid = billboardid;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}