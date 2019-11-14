package com.quartz.model;

import java.io.Serializable;

public class Stadiums implements Serializable {
    /**
     * Column: stadiums.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: stadiums.city_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer cityId;

    /**
     * Column: stadiums.cn_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String cnName;

    /**
     * Column: stadiums.en_name
    @mbggenerated 2019-11-13 10:46:06
     */
    private String enName;

    /**
     * Column: stadiums.country_id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer countryId;

    /**
     * Table: stadiums
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}