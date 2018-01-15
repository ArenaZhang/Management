package com.arena.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentsExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterion("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterion("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterion("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterion("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterion("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterion("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterion("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterion("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterion("ddate not between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDfirstIsNull() {
            addCriterion("dfirst is null");
            return (Criteria) this;
        }

        public Criteria andDfirstIsNotNull() {
            addCriterion("dfirst is not null");
            return (Criteria) this;
        }

        public Criteria andDfirstEqualTo(String value) {
            addCriterion("dfirst =", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstNotEqualTo(String value) {
            addCriterion("dfirst <>", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstGreaterThan(String value) {
            addCriterion("dfirst >", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstGreaterThanOrEqualTo(String value) {
            addCriterion("dfirst >=", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstLessThan(String value) {
            addCriterion("dfirst <", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstLessThanOrEqualTo(String value) {
            addCriterion("dfirst <=", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstLike(String value) {
            addCriterion("dfirst like", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstNotLike(String value) {
            addCriterion("dfirst not like", value, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstIn(List<String> values) {
            addCriterion("dfirst in", values, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstNotIn(List<String> values) {
            addCriterion("dfirst not in", values, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstBetween(String value1, String value2) {
            addCriterion("dfirst between", value1, value2, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDfirstNotBetween(String value1, String value2) {
            addCriterion("dfirst not between", value1, value2, "dfirst");
            return (Criteria) this;
        }

        public Criteria andDdetialIsNull() {
            addCriterion("ddetial is null");
            return (Criteria) this;
        }

        public Criteria andDdetialIsNotNull() {
            addCriterion("ddetial is not null");
            return (Criteria) this;
        }

        public Criteria andDdetialEqualTo(String value) {
            addCriterion("ddetial =", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialNotEqualTo(String value) {
            addCriterion("ddetial <>", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialGreaterThan(String value) {
            addCriterion("ddetial >", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialGreaterThanOrEqualTo(String value) {
            addCriterion("ddetial >=", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialLessThan(String value) {
            addCriterion("ddetial <", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialLessThanOrEqualTo(String value) {
            addCriterion("ddetial <=", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialLike(String value) {
            addCriterion("ddetial like", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialNotLike(String value) {
            addCriterion("ddetial not like", value, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialIn(List<String> values) {
            addCriterion("ddetial in", values, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialNotIn(List<String> values) {
            addCriterion("ddetial not in", values, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialBetween(String value1, String value2) {
            addCriterion("ddetial between", value1, value2, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDdetialNotBetween(String value1, String value2) {
            addCriterion("ddetial not between", value1, value2, "ddetial");
            return (Criteria) this;
        }

        public Criteria andDsecondIsNull() {
            addCriterion("dsecond is null");
            return (Criteria) this;
        }

        public Criteria andDsecondIsNotNull() {
            addCriterion("dsecond is not null");
            return (Criteria) this;
        }

        public Criteria andDsecondEqualTo(String value) {
            addCriterion("dsecond =", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondNotEqualTo(String value) {
            addCriterion("dsecond <>", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondGreaterThan(String value) {
            addCriterion("dsecond >", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondGreaterThanOrEqualTo(String value) {
            addCriterion("dsecond >=", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondLessThan(String value) {
            addCriterion("dsecond <", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondLessThanOrEqualTo(String value) {
            addCriterion("dsecond <=", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondLike(String value) {
            addCriterion("dsecond like", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondNotLike(String value) {
            addCriterion("dsecond not like", value, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondIn(List<String> values) {
            addCriterion("dsecond in", values, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondNotIn(List<String> values) {
            addCriterion("dsecond not in", values, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondBetween(String value1, String value2) {
            addCriterion("dsecond between", value1, value2, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDsecondNotBetween(String value1, String value2) {
            addCriterion("dsecond not between", value1, value2, "dsecond");
            return (Criteria) this;
        }

        public Criteria andDthirdIsNull() {
            addCriterion("dthird is null");
            return (Criteria) this;
        }

        public Criteria andDthirdIsNotNull() {
            addCriterion("dthird is not null");
            return (Criteria) this;
        }

        public Criteria andDthirdEqualTo(Integer value) {
            addCriterion("dthird =", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdNotEqualTo(Integer value) {
            addCriterion("dthird <>", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdGreaterThan(Integer value) {
            addCriterion("dthird >", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dthird >=", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdLessThan(Integer value) {
            addCriterion("dthird <", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdLessThanOrEqualTo(Integer value) {
            addCriterion("dthird <=", value, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdIn(List<Integer> values) {
            addCriterion("dthird in", values, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdNotIn(List<Integer> values) {
            addCriterion("dthird not in", values, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdBetween(Integer value1, Integer value2) {
            addCriterion("dthird between", value1, value2, "dthird");
            return (Criteria) this;
        }

        public Criteria andDthirdNotBetween(Integer value1, Integer value2) {
            addCriterion("dthird not between", value1, value2, "dthird");
            return (Criteria) this;
        }

        public Criteria andDforthIsNull() {
            addCriterion("dforth is null");
            return (Criteria) this;
        }

        public Criteria andDforthIsNotNull() {
            addCriterion("dforth is not null");
            return (Criteria) this;
        }

        public Criteria andDforthEqualTo(Float value) {
            addCriterion("dforth =", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthNotEqualTo(Float value) {
            addCriterion("dforth <>", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthGreaterThan(Float value) {
            addCriterion("dforth >", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthGreaterThanOrEqualTo(Float value) {
            addCriterion("dforth >=", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthLessThan(Float value) {
            addCriterion("dforth <", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthLessThanOrEqualTo(Float value) {
            addCriterion("dforth <=", value, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthIn(List<Float> values) {
            addCriterion("dforth in", values, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthNotIn(List<Float> values) {
            addCriterion("dforth not in", values, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthBetween(Float value1, Float value2) {
            addCriterion("dforth between", value1, value2, "dforth");
            return (Criteria) this;
        }

        public Criteria andDforthNotBetween(Float value1, Float value2) {
            addCriterion("dforth not between", value1, value2, "dforth");
            return (Criteria) this;
        }

        public Criteria andDfifthIsNull() {
            addCriterion("dfifth is null");
            return (Criteria) this;
        }

        public Criteria andDfifthIsNotNull() {
            addCriterion("dfifth is not null");
            return (Criteria) this;
        }

        public Criteria andDfifthEqualTo(String value) {
            addCriterion("dfifth =", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthNotEqualTo(String value) {
            addCriterion("dfifth <>", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthGreaterThan(String value) {
            addCriterion("dfifth >", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthGreaterThanOrEqualTo(String value) {
            addCriterion("dfifth >=", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthLessThan(String value) {
            addCriterion("dfifth <", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthLessThanOrEqualTo(String value) {
            addCriterion("dfifth <=", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthLike(String value) {
            addCriterion("dfifth like", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthNotLike(String value) {
            addCriterion("dfifth not like", value, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthIn(List<String> values) {
            addCriterion("dfifth in", values, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthNotIn(List<String> values) {
            addCriterion("dfifth not in", values, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthBetween(String value1, String value2) {
            addCriterion("dfifth between", value1, value2, "dfifth");
            return (Criteria) this;
        }

        public Criteria andDfifthNotBetween(String value1, String value2) {
            addCriterion("dfifth not between", value1, value2, "dfifth");
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