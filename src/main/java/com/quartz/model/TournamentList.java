package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class TournamentList implements Serializable {
    /**
     * Column: tournament_list.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: tournament_list.cn_alias
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnAlias;

    /**
     * Column: tournament_list.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: tournament_list.current_season_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer currentSeasonId;

    /**
     * Column: tournament_list.en_alias
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enAlias;

    /**
     * Column: tournament_list.en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enName;

    /**
     * Column: tournament_list.sport_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer sportId;

    /**
     * Column: tournament_list.logo_url
    @mbggenerated 2019-11-13 10:46:07
     */
    private String logoUrl;

    /**
     * Column: tournament_list.type
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer type;

    /**
     * Column: tournament_list.level
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer level;

    /**
     * Column: tournament_list.period_type
    @mbggenerated 2019-11-13 10:46:07
     */
    private String periodType;

    /**
     * Column: tournament_list.category_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer categoryId;

    /**
     * Column: tournament_list.category_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String categoryCnName;

    /**
     * Column: tournament_list.category_continent
    @mbggenerated 2019-11-13 10:46:07
     */
    private String categoryContinent;

    /**
     * Column: tournament_list.update_time
    @mbggenerated 2019-11-13 10:46:07
     */
    private Date updateTime;

    /**
     * Column: tournament_list.color
    @mbggenerated 2019-11-13 10:46:07
     */
    private String color;

    /**
     * Column: tournament_list.description
    @mbggenerated 2019-11-13 10:46:07
     */
    private String description;

    /**
     * Table: tournament_list
    @mbggenerated 2019-11-13 10:46:07
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

    public Integer getCurrentSeasonId() {
        return currentSeasonId;
    }

    public void setCurrentSeasonId(Integer currentSeasonId) {
        this.currentSeasonId = currentSeasonId;
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

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCnName() {
        return categoryCnName;
    }

    public void setCategoryCnName(String categoryCnName) {
        this.categoryCnName = categoryCnName;
    }

    public String getCategoryContinent() {
        return categoryContinent;
    }

    public void setCategoryContinent(String categoryContinent) {
        this.categoryContinent = categoryContinent;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}