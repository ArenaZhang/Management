package com.arena.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWeidIsNull() {
            addCriterion("weid is null");
            return (Criteria) this;
        }

        public Criteria andWeidIsNotNull() {
            addCriterion("weid is not null");
            return (Criteria) this;
        }

        public Criteria andWeidEqualTo(String value) {
            addCriterion("weid =", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidNotEqualTo(String value) {
            addCriterion("weid <>", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidGreaterThan(String value) {
            addCriterion("weid >", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidGreaterThanOrEqualTo(String value) {
            addCriterion("weid >=", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidLessThan(String value) {
            addCriterion("weid <", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidLessThanOrEqualTo(String value) {
            addCriterion("weid <=", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidLike(String value) {
            addCriterion("weid like", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidNotLike(String value) {
            addCriterion("weid not like", value, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidIn(List<String> values) {
            addCriterion("weid in", values, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidNotIn(List<String> values) {
            addCriterion("weid not in", values, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidBetween(String value1, String value2) {
            addCriterion("weid between", value1, value2, "weid");
            return (Criteria) this;
        }

        public Criteria andWeidNotBetween(String value1, String value2) {
            addCriterion("weid not between", value1, value2, "weid");
            return (Criteria) this;
        }

        public Criteria andWnameIsNull() {
            addCriterion("wname is null");
            return (Criteria) this;
        }

        public Criteria andWnameIsNotNull() {
            addCriterion("wname is not null");
            return (Criteria) this;
        }

        public Criteria andWnameEqualTo(String value) {
            addCriterion("wname =", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotEqualTo(String value) {
            addCriterion("wname <>", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameGreaterThan(String value) {
            addCriterion("wname >", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameGreaterThanOrEqualTo(String value) {
            addCriterion("wname >=", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLessThan(String value) {
            addCriterion("wname <", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLessThanOrEqualTo(String value) {
            addCriterion("wname <=", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLike(String value) {
            addCriterion("wname like", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotLike(String value) {
            addCriterion("wname not like", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameIn(List<String> values) {
            addCriterion("wname in", values, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotIn(List<String> values) {
            addCriterion("wname not in", values, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameBetween(String value1, String value2) {
            addCriterion("wname between", value1, value2, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotBetween(String value1, String value2) {
            addCriterion("wname not between", value1, value2, "wname");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeIsNull() {
            addCriterion("wmaintaintime is null");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeIsNotNull() {
            addCriterion("wmaintaintime is not null");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeEqualTo(Date value) {
            addCriterion("wmaintaintime =", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeNotEqualTo(Date value) {
            addCriterion("wmaintaintime <>", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeGreaterThan(Date value) {
            addCriterion("wmaintaintime >", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wmaintaintime >=", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeLessThan(Date value) {
            addCriterion("wmaintaintime <", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeLessThanOrEqualTo(Date value) {
            addCriterion("wmaintaintime <=", value, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeIn(List<Date> values) {
            addCriterion("wmaintaintime in", values, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeNotIn(List<Date> values) {
            addCriterion("wmaintaintime not in", values, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeBetween(Date value1, Date value2) {
            addCriterion("wmaintaintime between", value1, value2, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWmaintaintimeNotBetween(Date value1, Date value2) {
            addCriterion("wmaintaintime not between", value1, value2, "wmaintaintime");
            return (Criteria) this;
        }

        public Criteria andWcomponentIsNull() {
            addCriterion("wcomponent is null");
            return (Criteria) this;
        }

        public Criteria andWcomponentIsNotNull() {
            addCriterion("wcomponent is not null");
            return (Criteria) this;
        }

        public Criteria andWcomponentEqualTo(String value) {
            addCriterion("wcomponent =", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentNotEqualTo(String value) {
            addCriterion("wcomponent <>", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentGreaterThan(String value) {
            addCriterion("wcomponent >", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentGreaterThanOrEqualTo(String value) {
            addCriterion("wcomponent >=", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentLessThan(String value) {
            addCriterion("wcomponent <", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentLessThanOrEqualTo(String value) {
            addCriterion("wcomponent <=", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentLike(String value) {
            addCriterion("wcomponent like", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentNotLike(String value) {
            addCriterion("wcomponent not like", value, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentIn(List<String> values) {
            addCriterion("wcomponent in", values, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentNotIn(List<String> values) {
            addCriterion("wcomponent not in", values, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentBetween(String value1, String value2) {
            addCriterion("wcomponent between", value1, value2, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWcomponentNotBetween(String value1, String value2) {
            addCriterion("wcomponent not between", value1, value2, "wcomponent");
            return (Criteria) this;
        }

        public Criteria andWreasonIsNull() {
            addCriterion("wreason is null");
            return (Criteria) this;
        }

        public Criteria andWreasonIsNotNull() {
            addCriterion("wreason is not null");
            return (Criteria) this;
        }

        public Criteria andWreasonEqualTo(String value) {
            addCriterion("wreason =", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonNotEqualTo(String value) {
            addCriterion("wreason <>", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonGreaterThan(String value) {
            addCriterion("wreason >", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonGreaterThanOrEqualTo(String value) {
            addCriterion("wreason >=", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonLessThan(String value) {
            addCriterion("wreason <", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonLessThanOrEqualTo(String value) {
            addCriterion("wreason <=", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonLike(String value) {
            addCriterion("wreason like", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonNotLike(String value) {
            addCriterion("wreason not like", value, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonIn(List<String> values) {
            addCriterion("wreason in", values, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonNotIn(List<String> values) {
            addCriterion("wreason not in", values, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonBetween(String value1, String value2) {
            addCriterion("wreason between", value1, value2, "wreason");
            return (Criteria) this;
        }

        public Criteria andWreasonNotBetween(String value1, String value2) {
            addCriterion("wreason not between", value1, value2, "wreason");
            return (Criteria) this;
        }

        public Criteria andWresultIsNull() {
            addCriterion("wresult is null");
            return (Criteria) this;
        }

        public Criteria andWresultIsNotNull() {
            addCriterion("wresult is not null");
            return (Criteria) this;
        }

        public Criteria andWresultEqualTo(String value) {
            addCriterion("wresult =", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultNotEqualTo(String value) {
            addCriterion("wresult <>", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultGreaterThan(String value) {
            addCriterion("wresult >", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultGreaterThanOrEqualTo(String value) {
            addCriterion("wresult >=", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultLessThan(String value) {
            addCriterion("wresult <", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultLessThanOrEqualTo(String value) {
            addCriterion("wresult <=", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultLike(String value) {
            addCriterion("wresult like", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultNotLike(String value) {
            addCriterion("wresult not like", value, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultIn(List<String> values) {
            addCriterion("wresult in", values, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultNotIn(List<String> values) {
            addCriterion("wresult not in", values, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultBetween(String value1, String value2) {
            addCriterion("wresult between", value1, value2, "wresult");
            return (Criteria) this;
        }

        public Criteria andWresultNotBetween(String value1, String value2) {
            addCriterion("wresult not between", value1, value2, "wresult");
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