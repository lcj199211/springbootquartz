package com.quartz.model;

import java.io.Serializable;

public class VariousGameplay implements Serializable {
    /**
     * Column: various_gameplay.id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer id;

    /**
     * Column: various_gameplay.match_id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer matchId;

    /**
     * Column: various_gameplay.book_id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer bookId;

    /**
     * Column: various_gameplay.book_cn_name
    @mbggenerated 2019-11-13 10:46:08
     */
    private String bookCnName;

    /**
     * Column: various_gameplay.book_en_name
    @mbggenerated 2019-11-13 10:46:08
     */
    private String bookEnName;

    /**
     * Column: various_gameplay.type_id
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer typeId;

    /**
     * Column: various_gameplay.type_name
    @mbggenerated 2019-11-13 10:46:08
     */
    private String typeName;

    /**
     * Column: various_gameplay.ovalue
    @mbggenerated 2019-11-13 10:46:08
     */
    private String ovalue;

    /**
     * Column: various_gameplay.ovalue0
    @mbggenerated 2019-11-13 10:46:08
     */
    private String ovalue0;

    /**
     * Column: various_gameplay.active
    @mbggenerated 2019-11-13 10:46:08
     */
    private Integer active;

    /**
     * Table: various_gameplay
    @mbggenerated 2019-11-13 10:46:08
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

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCnName() {
        return bookCnName;
    }

    public void setBookCnName(String bookCnName) {
        this.bookCnName = bookCnName;
    }

    public String getBookEnName() {
        return bookEnName;
    }

    public void setBookEnName(String bookEnName) {
        this.bookEnName = bookEnName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getOvalue() {
        return ovalue;
    }

    public void setOvalue(String ovalue) {
        this.ovalue = ovalue;
    }

    public String getOvalue0() {
        return ovalue0;
    }

    public void setOvalue0(String ovalue0) {
        this.ovalue0 = ovalue0;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}