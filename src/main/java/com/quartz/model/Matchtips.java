package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class Matchtips implements Serializable {
    /**
     * Column: matchtips.id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer id;

    /**
     * Column: matchtips.match_id
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer matchId;

    /**
     * Column: matchtips.title
    @mbggenerated 2019-11-13 10:46:05
     */
    private String title;

    /**
     * Column: matchtips.home_injury
    @mbggenerated 2019-11-13 10:46:05
     */
    private String homeInjury;

    /**
     * Column: matchtips.away_injury
    @mbggenerated 2019-11-13 10:46:05
     */
    private String awayInjury;

    /**
     * Column: matchtips.home_news
    @mbggenerated 2019-11-13 10:46:05
     */
    private String homeNews;

    /**
     * Column: matchtips.away_news
    @mbggenerated 2019-11-13 10:46:05
     */
    private String awayNews;

    /**
     * Column: matchtips.match_data
    @mbggenerated 2019-11-13 10:46:05
     */
    private String matchData;

    /**
     * Column: matchtips.match_forecast
    @mbggenerated 2019-11-13 10:46:05
     */
    private String matchForecast;

    /**
     * Column: matchtips.is_visible
    @mbggenerated 2019-11-13 10:46:05
     */
    private Integer isVisible;

    /**
     * Column: matchtips.update_time
    @mbggenerated 2019-11-13 10:46:05
     */
    private Date updateTime;

    /**
     * Column: matchtips.create_time
    @mbggenerated 2019-11-13 10:46:05
     */
    private Date createTime;

    /**
     * Table: matchtips
    @mbggenerated 2019-11-13 10:46:05
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHomeInjury() {
        return homeInjury;
    }

    public void setHomeInjury(String homeInjury) {
        this.homeInjury = homeInjury;
    }

    public String getAwayInjury() {
        return awayInjury;
    }

    public void setAwayInjury(String awayInjury) {
        this.awayInjury = awayInjury;
    }

    public String getHomeNews() {
        return homeNews;
    }

    public void setHomeNews(String homeNews) {
        this.homeNews = homeNews;
    }

    public String getAwayNews() {
        return awayNews;
    }

    public void setAwayNews(String awayNews) {
        this.awayNews = awayNews;
    }

    public String getMatchData() {
        return matchData;
    }

    public void setMatchData(String matchData) {
        this.matchData = matchData;
    }

    public String getMatchForecast() {
        return matchForecast;
    }

    public void setMatchForecast(String matchForecast) {
        this.matchForecast = matchForecast;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}