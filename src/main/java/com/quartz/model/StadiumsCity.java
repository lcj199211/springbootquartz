package com.quartz.model;

import java.io.Serializable;

public class StadiumsCity implements Serializable {
    /**
     * Column: stadiums_city.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: stadiums_city.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: stadiums_city.en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enName;

    /**
     * Column: stadiums_city.country_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer countryId;

    /**
     * Table: stadiums_city
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