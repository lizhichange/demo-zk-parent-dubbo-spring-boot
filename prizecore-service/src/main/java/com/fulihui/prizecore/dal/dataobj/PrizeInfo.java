package com.fulihui.prizecore.dal.dataobj;

import java.io.Serializable;
import java.util.Date;

public class PrizeInfo implements Serializable {
    private Integer id;

    private String prizeName;

    private String prizeBImg;

    private String prizeSImg;

    private String prizeLink;

    private String instructions;

    private String validityType;

    private String prizeType;

    private String conditionLimitType;

    private String extInfo;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizeBImg() {
        return prizeBImg;
    }

    public void setPrizeBImg(String prizeBImg) {
        this.prizeBImg = prizeBImg;
    }

    public String getPrizeSImg() {
        return prizeSImg;
    }

    public void setPrizeSImg(String prizeSImg) {
        this.prizeSImg = prizeSImg;
    }

    public String getPrizeLink() {
        return prizeLink;
    }

    public void setPrizeLink(String prizeLink) {
        this.prizeLink = prizeLink;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getValidityType() {
        return validityType;
    }

    public void setValidityType(String validityType) {
        this.validityType = validityType;
    }

    public String getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public String getConditionLimitType() {
        return conditionLimitType;
    }

    public void setConditionLimitType(String conditionLimitType) {
        this.conditionLimitType = conditionLimitType;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prizeName=").append(prizeName);
        sb.append(", prizeBImg=").append(prizeBImg);
        sb.append(", prizeSImg=").append(prizeSImg);
        sb.append(", prizeLink=").append(prizeLink);
        sb.append(", instructions=").append(instructions);
        sb.append(", validityType=").append(validityType);
        sb.append(", prizeType=").append(prizeType);
        sb.append(", conditionLimitType=").append(conditionLimitType);
        sb.append(", extInfo=").append(extInfo);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}