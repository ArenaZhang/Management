package com.arena.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOrenttimeIsNull() {
            addCriterion("orenttime is null");
            return (Criteria) this;
        }

        public Criteria andOrenttimeIsNotNull() {
            addCriterion("orenttime is not null");
            return (Criteria) this;
        }

        public Criteria andOrenttimeEqualTo(Date value) {
            addCriterion("orenttime =", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeNotEqualTo(Date value) {
            addCriterion("orenttime <>", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeGreaterThan(Date value) {
            addCriterion("orenttime >", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orenttime >=", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeLessThan(Date value) {
            addCriterion("orenttime <", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeLessThanOrEqualTo(Date value) {
            addCriterion("orenttime <=", value, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeIn(List<Date> values) {
            addCriterion("orenttime in", values, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeNotIn(List<Date> values) {
            addCriterion("orenttime not in", values, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeBetween(Date value1, Date value2) {
            addCriterion("orenttime between", value1, value2, "orenttime");
            return (Criteria) this;
        }

        public Criteria andOrenttimeNotBetween(Date value1, Date value2) {
            addCriterion("orenttime not between", value1, value2, "orenttime");
            return (Criteria) this;
        }

        public Criteria andObacktimeIsNull() {
            addCriterion("obacktime is null");
            return (Criteria) this;
        }

        public Criteria andObacktimeIsNotNull() {
            addCriterion("obacktime is not null");
            return (Criteria) this;
        }

        public Criteria andObacktimeEqualTo(Date value) {
            addCriterion("obacktime =", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeNotEqualTo(Date value) {
            addCriterion("obacktime <>", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeGreaterThan(Date value) {
            addCriterion("obacktime >", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("obacktime >=", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeLessThan(Date value) {
            addCriterion("obacktime <", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeLessThanOrEqualTo(Date value) {
            addCriterion("obacktime <=", value, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeIn(List<Date> values) {
            addCriterion("obacktime in", values, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeNotIn(List<Date> values) {
            addCriterion("obacktime not in", values, "obacktime");
            return (Criteria) this;
        }

        
        
      /*  public Criteria andObacktimeBetween(String value1, String value2) throws ParseException {
        	 SimpleDateFormat f = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        	Date v1 =f.parse(value1.toString().trim());
        	Date v2 =f.parse(value2.toString().trim());
        	 addCriterion("obacktime between", v1, v2, "obacktime");
            return (Criteria) this;
        }*/
          
      public Criteria andObacktimeBetween(Date value1, Date value2) {
            addCriterion("obacktime between", value1, value2, "obacktime");
            return (Criteria) this;
        }

        public Criteria andObacktimeNotBetween(Date value1, Date value2) {
            addCriterion("obacktime not between", value1, value2, "obacktime");
            return (Criteria) this;
        }

        public Criteria andOprizeIsNull() {
            addCriterion("oprize is null");
            return (Criteria) this;
        }

        public Criteria andOprizeIsNotNull() {
            addCriterion("oprize is not null");
            return (Criteria) this;
        }

        public Criteria andOprizeEqualTo(Float value) {
            addCriterion("oprize =", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeNotEqualTo(Float value) {
            addCriterion("oprize <>", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeGreaterThan(Float value) {
            addCriterion("oprize >", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeGreaterThanOrEqualTo(Float value) {
            addCriterion("oprize >=", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeLessThan(Float value) {
            addCriterion("oprize <", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeLessThanOrEqualTo(Float value) {
            addCriterion("oprize <=", value, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeIn(List<Float> values) {
            addCriterion("oprize in", values, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeNotIn(List<Float> values) {
            addCriterion("oprize not in", values, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeBetween(Float value1, Float value2) {
            addCriterion("oprize between", value1, value2, "oprize");
            return (Criteria) this;
        }

        public Criteria andOprizeNotBetween(Float value1, Float value2) {
            addCriterion("oprize not between", value1, value2, "oprize");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(Integer value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(Integer value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(Integer value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(Integer value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(Integer value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<Integer> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<Integer> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(Integer value1, Integer value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOdepartmentIsNull() {
            addCriterion("odepartment is null");
            return (Criteria) this;
        }

        public Criteria andOdepartmentIsNotNull() {
            addCriterion("odepartment is not null");
            return (Criteria) this;
        }

        public Criteria andOdepartmentEqualTo(String value) {
            addCriterion("odepartment =", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentNotEqualTo(String value) {
            addCriterion("odepartment <>", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentGreaterThan(String value) {
            addCriterion("odepartment >", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("odepartment >=", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentLessThan(String value) {
            addCriterion("odepartment <", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentLessThanOrEqualTo(String value) {
            addCriterion("odepartment <=", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentLike(String value) {
            addCriterion("odepartment like", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentNotLike(String value) {
            addCriterion("odepartment not like", value, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentIn(List<String> values) {
            addCriterion("odepartment in", values, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentNotIn(List<String> values) {
            addCriterion("odepartment not in", values, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentBetween(String value1, String value2) {
            addCriterion("odepartment between", value1, value2, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOdepartmentNotBetween(String value1, String value2) {
            addCriterion("odepartment not between", value1, value2, "odepartment");
            return (Criteria) this;
        }

        public Criteria andOperprizeIsNull() {
            addCriterion("operprize is null");
            return (Criteria) this;
        }

        public Criteria andOperprizeIsNotNull() {
            addCriterion("operprize is not null");
            return (Criteria) this;
        }

        public Criteria andOperprizeEqualTo(Float value) {
            addCriterion("operprize =", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeNotEqualTo(Float value) {
            addCriterion("operprize <>", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeGreaterThan(Float value) {
            addCriterion("operprize >", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeGreaterThanOrEqualTo(Float value) {
            addCriterion("operprize >=", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeLessThan(Float value) {
            addCriterion("operprize <", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeLessThanOrEqualTo(Float value) {
            addCriterion("operprize <=", value, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeIn(List<Float> values) {
            addCriterion("operprize in", values, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeNotIn(List<Float> values) {
            addCriterion("operprize not in", values, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeBetween(Float value1, Float value2) {
            addCriterion("operprize between", value1, value2, "operprize");
            return (Criteria) this;
        }

        public Criteria andOperprizeNotBetween(Float value1, Float value2) {
            addCriterion("operprize not between", value1, value2, "operprize");
            return (Criteria) this;
        }

        public Criteria andOeidIsNull() {
            addCriterion("oeid is null");
            return (Criteria) this;
        }

        public Criteria andOeidIsNotNull() {
            addCriterion("oeid is not null");
            return (Criteria) this;
        }

        public Criteria andOeidEqualTo(String value) {
            addCriterion("oeid =", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidNotEqualTo(String value) {
            addCriterion("oeid <>", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidGreaterThan(String value) {
            addCriterion("oeid >", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidGreaterThanOrEqualTo(String value) {
            addCriterion("oeid >=", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidLessThan(String value) {
            addCriterion("oeid <", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidLessThanOrEqualTo(String value) {
            addCriterion("oeid <=", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidLike(String value) {
            addCriterion("oeid like", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidNotLike(String value) {
            addCriterion("oeid not like", value, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidIn(List<String> values) {
            addCriterion("oeid in", values, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidNotIn(List<String> values) {
            addCriterion("oeid not in", values, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidBetween(String value1, String value2) {
            addCriterion("oeid between", value1, value2, "oeid");
            return (Criteria) this;
        }

        public Criteria andOeidNotBetween(String value1, String value2) {
            addCriterion("oeid not between", value1, value2, "oeid");
            return (Criteria) this;
        }

        public Criteria andOorderstimeIsNull() {
            addCriterion("oorderstime is null");
            return (Criteria) this;
        }

        public Criteria andOorderstimeIsNotNull() {
            addCriterion("oorderstime is not null");
            return (Criteria) this;
        }

        public Criteria andOorderstimeEqualTo(Date value) {
            addCriterion("oorderstime =", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeNotEqualTo(Date value) {
            addCriterion("oorderstime <>", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeGreaterThan(Date value) {
            addCriterion("oorderstime >", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oorderstime >=", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeLessThan(Date value) {
            addCriterion("oorderstime <", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeLessThanOrEqualTo(Date value) {
            addCriterion("oorderstime <=", value, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeIn(List<Date> values) {
            addCriterion("oorderstime in", values, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeNotIn(List<Date> values) {
            addCriterion("oorderstime not in", values, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeBetween(Date value1, Date value2) {
            addCriterion("oorderstime between", value1, value2, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOorderstimeNotBetween(Date value1, Date value2) {
            addCriterion("oorderstime not between", value1, value2, "oorderstime");
            return (Criteria) this;
        }

        public Criteria andOfirstIsNull() {
            addCriterion("ofirst is null");
            return (Criteria) this;
        }

        public Criteria andOfirstIsNotNull() {
            addCriterion("ofirst is not null");
            return (Criteria) this;
        }

        public Criteria andOfirstEqualTo(String value) {
            addCriterion("ofirst =", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstNotEqualTo(String value) {
            addCriterion("ofirst <>", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstGreaterThan(String value) {
            addCriterion("ofirst >", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstGreaterThanOrEqualTo(String value) {
            addCriterion("ofirst >=", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstLessThan(String value) {
            addCriterion("ofirst <", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstLessThanOrEqualTo(String value) {
            addCriterion("ofirst <=", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstLike(String value) {
            addCriterion("ofirst like", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstNotLike(String value) {
            addCriterion("ofirst not like", value, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstIn(List<String> values) {
            addCriterion("ofirst in", values, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstNotIn(List<String> values) {
            addCriterion("ofirst not in", values, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstBetween(String value1, String value2) {
            addCriterion("ofirst between", value1, value2, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOfirstNotBetween(String value1, String value2) {
            addCriterion("ofirst not between", value1, value2, "ofirst");
            return (Criteria) this;
        }

        public Criteria andOsecondIsNull() {
            addCriterion("osecond is null");
            return (Criteria) this;
        }

        public Criteria andOsecondIsNotNull() {
            addCriterion("osecond is not null");
            return (Criteria) this;
        }

        public Criteria andOsecondEqualTo(Float value) {
            addCriterion("osecond =", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondNotEqualTo(Float value) {
            addCriterion("osecond <>", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondGreaterThan(Float value) {
            addCriterion("osecond >", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondGreaterThanOrEqualTo(Float value) {
            addCriterion("osecond >=", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondLessThan(Float value) {
            addCriterion("osecond <", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondLessThanOrEqualTo(Float value) {
            addCriterion("osecond <=", value, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondIn(List<Float> values) {
            addCriterion("osecond in", values, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondNotIn(List<Float> values) {
            addCriterion("osecond not in", values, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondBetween(Float value1, Float value2) {
            addCriterion("osecond between", value1, value2, "osecond");
            return (Criteria) this;
        }

        public Criteria andOsecondNotBetween(Float value1, Float value2) {
            addCriterion("osecond not between", value1, value2, "osecond");
            return (Criteria) this;
        }

        public Criteria andOthirdIsNull() {
            addCriterion("othird is null");
            return (Criteria) this;
        }

        public Criteria andOthirdIsNotNull() {
            addCriterion("othird is not null");
            return (Criteria) this;
        }

        public Criteria andOthirdEqualTo(Date value) {
            addCriterion("othird =", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdNotEqualTo(Date value) {
            addCriterion("othird <>", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdGreaterThan(Date value) {
            addCriterion("othird >", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdGreaterThanOrEqualTo(Date value) {
            addCriterion("othird >=", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdLessThan(Date value) {
            addCriterion("othird <", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdLessThanOrEqualTo(Date value) {
            addCriterion("othird <=", value, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdIn(List<Date> values) {
            addCriterion("othird in", values, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdNotIn(List<Date> values) {
            addCriterion("othird not in", values, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdBetween(Date value1, Date value2) {
            addCriterion("othird between", value1, value2, "othird");
            return (Criteria) this;
        }

        public Criteria andOthirdNotBetween(Date value1, Date value2) {
            addCriterion("othird not between", value1, value2, "othird");
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