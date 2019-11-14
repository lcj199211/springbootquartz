package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class Teams implements Serializable {
    /**
     * Column: teams.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: teams.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: teams.cn_alias
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnAlias;

    /**
     * Column: teams.en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enName;

    /**
     * Column: teams.en_alias
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enAlias;

    /**
     * Column: teams.coach_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer coachId;

    /**
     * Column: teams.coach_en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String coachEnName;

    /**
     * Column: teams.coach_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String coachCnName;

    /**
     * Column: teams.stadium_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer stadiumId;

    /**
     * Column: teams.stadium_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String stadiumCnName;

    /**
     * Column: teams.stadium_en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String stadiumEnName;

    /**
     * Column: teams.city_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer cityId;

    /**
     * Column: teams.city_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cityCnName;

    /**
     * Column: teams.city_en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cityEnName;

    /**
     * Column: teams.establish_date
    @mbggenerated 2019-11-13 10:46:07
     */
    private Date establishDate;

    /**
     * Column: teams.logo_url
    @mbggenerated 2019-11-13 10:46:07
     */
    private String logoUrl;

    /**
     * Column: teams.logo_url2
    @mbggenerated 2019-11-13 10:46:07
     */
    private String logoUrl2;

    /**
     * Column: teams.is_country
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer isCountry;

    /**
     * Column: teams.market_value
    @mbggenerated 2019-11-13 10:46:07
     */
    private String marketValue;

    /**
     * Table: teams
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

    public String getCnAlias() {
        return cnAlias;
    }

    public void setCnAlias(String cnAlias) {
        this.cnAlias = cnAlias;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEnAlias() {
        return enAlias;
    }

    public void setEnAlias(String enAlias) {
        this.enAlias = enAlias;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoachEnName() {
        return coachEnName;
    }

    public void setCoachEnName(String coachEnName) {
        this.coachEnName = coachEnName;
    }

    public String getCoachCnName() {
        return coachCnName;
    }

    public void setCoachCnName(String coachCnName) {
        this.coachCnName = coachCnName;
    }

    public Integer getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Integer stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getStadiumCnName() {
        return stadiumCnName;
    }

    public void setStadiumCnName(String stadiumCnName) {
        this.stadiumCnName = stadiumCnName;
    }

    public String getStadiumEnName() {
        return stadiumEnName;
    }

    public void setStadiumEnName(String stadiumEnName) {
        this.stadiumEnName = stadiumEnName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityCnName() {
        return cityCnName;
    }

    public void setCityCnName(String cityCnName) {
        this.cityCnName = cityCnName;
    }

    public String getCityEnName() {
        return cityEnName;
    }

    public void setCityEnName(String cityEnName) {
        this.cityEnName = cityEnName;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl2() {
        return logoUrl2;
    }

    public void setLogoUrl2(String logoUrl2) {
        this.logoUrl2 = logoUrl2;
    }

    public Integer getIsCountry() {
        return isCountry;
    }

    public void setIsCountry(Integer isCountry) {
        this.isCountry = isCountry;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }
}