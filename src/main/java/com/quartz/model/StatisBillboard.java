package com.quartz.model;

import java.io.Serializable;

public class StatisBillboard implements Serializable {
    /**
     * Column: statis_billboard.id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer id;

    /**
     * Column: statis_billboard.type_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer typeId;

    /**
     * Column: statis_billboard.type_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String typeName;

    /**
     * Column: statis_billboard.type_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String typeCnName;

    /**
     * Column: statis_billboard.type_en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String typeEnName;

    /**
     * Column: statis_billboard.group_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private Integer groupId;

    /**
     * Column: statis_billboard.value
    @mbggenerated 2019-11-13 10:46:07
     */
    private String value;

    /**
     * Column: statis_billboard.promotion_id
    @mbggenerated 2019-11-13 10:46:07
     */
    private String promotionId;

    /**
     * Column: statis_billboard.promotion_cn_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String promotionCnName;

    /**
     * Column: statis_billboard.promotion_en_name
    @mbggenerated 2019-11-13 10:46:07
     */
    private String promotionEnName;

    /**
     * Table: statis_billboard
    @mbggenerated 2019-11-13 10:46:07
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTypeCnName() {
        return typeCnName;
    }

    public void setTypeCnName(String typeCnName) {
        this.typeCnName = typeCnName;
    }

    public String getTypeEnName() {
        return typeEnName;
    }

    public void setTypeEnName(String typeEnName) {
        this.typeEnName = typeEnName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionCnName() {
        return promotionCnName;
    }

    public void setPromotionCnName(String promotionCnName) {
        this.promotionCnName = promotionCnName;
    }

    public String getPromotionEnName() {
        return promotionEnName;
    }

    public void setPromotionEnName(String promotionEnName) {
        this.promotionEnName = promotionEnName;
    }
}