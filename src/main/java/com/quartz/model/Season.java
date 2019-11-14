package com.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class Season implements Serializable {
    /**
     * Column: season.id
    @mbggenerated 2019-11-13 10:46:06
     */
    private Integer id;

    /**
     * Column: season.year
    @mbggenerated 2019-11-13 10:46:06
     */
    private String year;

    /**
     * Column: season.start
    @mbggenerated 2019-11-13 10:46:06
     */
    private Date start;

    /**
     * Column: season.end
    @mbggenerated 2019-11-13 10:46:06
     */
    private Date end;

    /**
     * Table: season
    @mbggenerated 2019-11-13 10:46:06
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}