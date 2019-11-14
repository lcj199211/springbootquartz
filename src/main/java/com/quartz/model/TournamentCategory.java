package com.quartz.model;

import java.io.Serializable;

public class TournamentCategory implements Serializable {
    /**
     * Column: tournament_category.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: tournament_category.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: tournament_category.continent
    @mbggenerated 2019-11-13 10:46:07
     */
    private String continent;

    /**
     * Column: tournament_category.sport_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer sportId;

    /**
     * Column: tournament_category.pic_url
    @mbggenerated 2019-11-13 10:46:07
     */
    private String picUrl;

    /**
     * Table: tournament_category
    @mbggenerated 2019-11-13 10:46:07
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}