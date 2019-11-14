package com.quartz.model;

import java.io.Serializable;

public class StadiumsCountrys implements Serializable {
    /**
     * Column: stadiums_countrys.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: stadiums_countrys.cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String cnName;

    /**
     * Column: stadiums_countrys.en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String enName;

    /**
     * Column: stadiums_countrys.fifa
    @mbggenerated 2019-11-13 10:46:07
     */
    private String fifa;

    /**
     * Column: stadiums_countrys.ioc
    @mbggenerated 2019-11-13 10:46:07
     */
    private String ioc;

    /**
     * Column: stadiums_countrys.continent
    @mbggenerated 2019-11-13 10:46:07
     */
    private String continent;

    /**
     * Column: stadiums_countrys.picUrl
    @mbggenerated 2019-11-13 10:46:07
     */
    private String picurl;

    /**
     * Table: stadiums_countrys
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

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public String getIoc() {
        return ioc;
    }

    public void setIoc(String ioc) {
        this.ioc = ioc;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}