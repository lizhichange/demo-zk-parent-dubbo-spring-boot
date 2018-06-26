package com.fulihui.prizecore.dal.dataobj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrizeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PrizeInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgIsNull() {
            addCriterion("prize_b_img is null");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgIsNotNull() {
            addCriterion("prize_b_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgEqualTo(String value) {
            addCriterion("prize_b_img =", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgNotEqualTo(String value) {
            addCriterion("prize_b_img <>", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgGreaterThan(String value) {
            addCriterion("prize_b_img >", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgGreaterThanOrEqualTo(String value) {
            addCriterion("prize_b_img >=", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgLessThan(String value) {
            addCriterion("prize_b_img <", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgLessThanOrEqualTo(String value) {
            addCriterion("prize_b_img <=", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgLike(String value) {
            addCriterion("prize_b_img like", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgNotLike(String value) {
            addCriterion("prize_b_img not like", value, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgIn(List<String> values) {
            addCriterion("prize_b_img in", values, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgNotIn(List<String> values) {
            addCriterion("prize_b_img not in", values, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgBetween(String value1, String value2) {
            addCriterion("prize_b_img between", value1, value2, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeBImgNotBetween(String value1, String value2) {
            addCriterion("prize_b_img not between", value1, value2, "prizeBImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgIsNull() {
            addCriterion("prize_s_img is null");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgIsNotNull() {
            addCriterion("prize_s_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgEqualTo(String value) {
            addCriterion("prize_s_img =", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgNotEqualTo(String value) {
            addCriterion("prize_s_img <>", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgGreaterThan(String value) {
            addCriterion("prize_s_img >", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgGreaterThanOrEqualTo(String value) {
            addCriterion("prize_s_img >=", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgLessThan(String value) {
            addCriterion("prize_s_img <", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgLessThanOrEqualTo(String value) {
            addCriterion("prize_s_img <=", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgLike(String value) {
            addCriterion("prize_s_img like", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgNotLike(String value) {
            addCriterion("prize_s_img not like", value, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgIn(List<String> values) {
            addCriterion("prize_s_img in", values, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgNotIn(List<String> values) {
            addCriterion("prize_s_img not in", values, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgBetween(String value1, String value2) {
            addCriterion("prize_s_img between", value1, value2, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeSImgNotBetween(String value1, String value2) {
            addCriterion("prize_s_img not between", value1, value2, "prizeSImg");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkIsNull() {
            addCriterion("prize_link is null");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkIsNotNull() {
            addCriterion("prize_link is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkEqualTo(String value) {
            addCriterion("prize_link =", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkNotEqualTo(String value) {
            addCriterion("prize_link <>", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkGreaterThan(String value) {
            addCriterion("prize_link >", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkGreaterThanOrEqualTo(String value) {
            addCriterion("prize_link >=", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkLessThan(String value) {
            addCriterion("prize_link <", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkLessThanOrEqualTo(String value) {
            addCriterion("prize_link <=", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkLike(String value) {
            addCriterion("prize_link like", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkNotLike(String value) {
            addCriterion("prize_link not like", value, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkIn(List<String> values) {
            addCriterion("prize_link in", values, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkNotIn(List<String> values) {
            addCriterion("prize_link not in", values, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkBetween(String value1, String value2) {
            addCriterion("prize_link between", value1, value2, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andPrizeLinkNotBetween(String value1, String value2) {
            addCriterion("prize_link not between", value1, value2, "prizeLink");
            return (Criteria) this;
        }

        public Criteria andInstructionsIsNull() {
            addCriterion("instructions is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsIsNotNull() {
            addCriterion("instructions is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsEqualTo(String value) {
            addCriterion("instructions =", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotEqualTo(String value) {
            addCriterion("instructions <>", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThan(String value) {
            addCriterion("instructions >", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("instructions >=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThan(String value) {
            addCriterion("instructions <", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThanOrEqualTo(String value) {
            addCriterion("instructions <=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLike(String value) {
            addCriterion("instructions like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotLike(String value) {
            addCriterion("instructions not like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsIn(List<String> values) {
            addCriterion("instructions in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotIn(List<String> values) {
            addCriterion("instructions not in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsBetween(String value1, String value2) {
            addCriterion("instructions between", value1, value2, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotBetween(String value1, String value2) {
            addCriterion("instructions not between", value1, value2, "instructions");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIsNull() {
            addCriterion("validity_type is null");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIsNotNull() {
            addCriterion("validity_type is not null");
            return (Criteria) this;
        }

        public Criteria andValidityTypeEqualTo(String value) {
            addCriterion("validity_type =", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotEqualTo(String value) {
            addCriterion("validity_type <>", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThan(String value) {
            addCriterion("validity_type >", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("validity_type >=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThan(String value) {
            addCriterion("validity_type <", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThanOrEqualTo(String value) {
            addCriterion("validity_type <=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLike(String value) {
            addCriterion("validity_type like", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotLike(String value) {
            addCriterion("validity_type not like", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIn(List<String> values) {
            addCriterion("validity_type in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotIn(List<String> values) {
            addCriterion("validity_type not in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeBetween(String value1, String value2) {
            addCriterion("validity_type between", value1, value2, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotBetween(String value1, String value2) {
            addCriterion("validity_type not between", value1, value2, "validityType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNull() {
            addCriterion("prize_type is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNotNull() {
            addCriterion("prize_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeEqualTo(String value) {
            addCriterion("prize_type =", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotEqualTo(String value) {
            addCriterion("prize_type <>", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThan(String value) {
            addCriterion("prize_type >", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prize_type >=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThan(String value) {
            addCriterion("prize_type <", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThanOrEqualTo(String value) {
            addCriterion("prize_type <=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLike(String value) {
            addCriterion("prize_type like", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotLike(String value) {
            addCriterion("prize_type not like", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIn(List<String> values) {
            addCriterion("prize_type in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotIn(List<String> values) {
            addCriterion("prize_type not in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeBetween(String value1, String value2) {
            addCriterion("prize_type between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotBetween(String value1, String value2) {
            addCriterion("prize_type not between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeIsNull() {
            addCriterion("condition_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeIsNotNull() {
            addCriterion("condition_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeEqualTo(String value) {
            addCriterion("condition_limit_type =", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeNotEqualTo(String value) {
            addCriterion("condition_limit_type <>", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeGreaterThan(String value) {
            addCriterion("condition_limit_type >", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("condition_limit_type >=", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeLessThan(String value) {
            addCriterion("condition_limit_type <", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("condition_limit_type <=", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeLike(String value) {
            addCriterion("condition_limit_type like", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeNotLike(String value) {
            addCriterion("condition_limit_type not like", value, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeIn(List<String> values) {
            addCriterion("condition_limit_type in", values, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeNotIn(List<String> values) {
            addCriterion("condition_limit_type not in", values, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeBetween(String value1, String value2) {
            addCriterion("condition_limit_type between", value1, value2, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andConditionLimitTypeNotBetween(String value1, String value2) {
            addCriterion("condition_limit_type not between", value1, value2, "conditionLimitType");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNull() {
            addCriterion("ext_info is null");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNotNull() {
            addCriterion("ext_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtInfoEqualTo(String value) {
            addCriterion("ext_info =", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotEqualTo(String value) {
            addCriterion("ext_info <>", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThan(String value) {
            addCriterion("ext_info >", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ext_info >=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThan(String value) {
            addCriterion("ext_info <", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThanOrEqualTo(String value) {
            addCriterion("ext_info <=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLike(String value) {
            addCriterion("ext_info like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotLike(String value) {
            addCriterion("ext_info not like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoIn(List<String> values) {
            addCriterion("ext_info in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotIn(List<String> values) {
            addCriterion("ext_info not in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoBetween(String value1, String value2) {
            addCriterion("ext_info between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotBetween(String value1, String value2) {
            addCriterion("ext_info not between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}