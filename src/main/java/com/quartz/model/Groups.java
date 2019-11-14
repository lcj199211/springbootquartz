package com.quartz.model;

import java.io.Serializable;

public class Groups implements Serializable {
    /**
     * Column: groups.id
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer id;

    /**
     * Column: groups.cn_alias
    @mbggenerated 2019-11-13 10:46:04
     */
    private String cnAlias;

    /**
     * Column: groups.cn_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String cnName;

    /**
     * Column: groups.en_alias
    @mbggenerated 2019-11-13 10:46:04
     */
    private String enAlias;

    /**
     * Column: groups.en_name
    @mbggenerated 2019-11-13 10:46:04
     */
    private String enName;

    /**
     * Column: groups.type
    @mbggenerated 2019-11-13 10:46:04
     */
    private Integer type;

    /**
     * Table: groups
    @mbggenerated 2019-11-13 10:46:04
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnAlias() {
        return cnAlias;
    }

    public void setCnAlias(String cnAlias) {
        this.cnAlias = cnAlias;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnAlias() {
        return enAlias;
    }

    public void setEnAlias(String enAlias) {
        this.enAlias = enAlias;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}