package com.quartz.model;

import java.io.Serializable;

public class UrlConfig implements Serializable {
    /**
     * Column: url_config.id
    @mbggenerated 2019-11-13 16:30:36
     */
    private Integer id;

    /**
     * Column: url_config.describe
    @mbggenerated 2019-11-13 16:30:36
     */
    private String describe;

    /**
     * Column: url_config.url_prefix
    @mbggenerated 2019-11-13 16:30:36
     */
    private String urlPrefix;

    /**
     * Column: url_config.url_suffix
    @mbggenerated 2019-11-13 16:30:36
     */
    private String urlSuffix;

    /**
     * Column: url_config.usercode
    @mbggenerated 2019-11-13 16:30:36
     */
    private String usercode;

    /**
     * Column: url_config.seckey
    @mbggenerated 2019-11-13 16:30:36
     */
    private String seckey;

    /**
     * Column: url_config.user
    @mbggenerated 2019-11-13 16:30:36
     */
    private String user;

    /**
     * Column: url_config.mark
    @mbggenerated 2019-11-13 16:30:36
     */
    private String mark;

    /**
     * Table: url_config
    @mbggenerated 2019-11-13 16:30:36
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUrlPrefix() {
        return urlPrefix;
    }

    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix;
    }

    public String getUrlSuffix() {
        return urlSuffix;
    }

    public void setUrlSuffix(String urlSuffix) {
        this.urlSuffix = urlSuffix;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getSeckey() {
        return seckey;
    }

    public void setSeckey(String seckey) {
        this.seckey = seckey;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}