package com.arena.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(String value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(String value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(String value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(String value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(String value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(String value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLike(String value) {
            addCriterion("eid like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotLike(String value) {
            addCriterion("eid not like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<String> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<String> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(String value1, String value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(String value1, String value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEbacktimeIsNull() {
            addCriterion("ebacktime is null");
            return (Criteria) this;
        }

        public Criteria andEbacktimeIsNotNull() {
            addCriterion("ebacktime is not null");
            return (Criteria) this;
        }

        public Criteria andEbacktimeEqualTo(Date value) {
            addCriterion("ebacktime =", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeNotEqualTo(Date value) {
            addCriterion("ebacktime <>", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeGreaterThan(Date value) {
            addCriterion("ebacktime >", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ebacktime >=", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeLessThan(Date value) {
            addCriterion("ebacktime <", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeLessThanOrEqualTo(Date value) {
            addCriterion("ebacktime <=", value, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeIn(List<Date> values) {
            addCriterion("ebacktime in", values, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeNotIn(List<Date> values) {
            addCriterion("ebacktime not in", values, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeBetween(Date value1, Date value2) {
            addCriterion("ebacktime between", value1, value2, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andEbacktimeNotBetween(Date value1, Date value2) {
            addCriterion("ebacktime not between", value1, value2, "ebacktime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andErenttimeIsNull() {
            addCriterion("erenttime is null");
            return (Criteria) this;
        }

        public Criteria andErenttimeIsNotNull() {
            addCriterion("erenttime is not null");
            return (Criteria) this;
        }

        public Criteria andErenttimeEqualTo(Date value) {
            addCriterion("erenttime =", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeNotEqualTo(Date value) {
            addCriterion("erenttime <>", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeGreaterThan(Date value) {
            addCriterion("erenttime >", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("erenttime >=", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeLessThan(Date value) {
            addCriterion("erenttime <", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeLessThanOrEqualTo(Date value) {
            addCriterion("erenttime <=", value, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeIn(List<Date> values) {
            addCriterion("erenttime in", values, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeNotIn(List<Date> values) {
            addCriterion("erenttime not in", values, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeBetween(Date value1, Date value2) {
            addCriterion("erenttime between", value1, value2, "erenttime");
            return (Criteria) this;
        }

        public Criteria andErenttimeNotBetween(Date value1, Date value2) {
            addCriterion("erenttime not between", value1, value2, "erenttime");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIsNull() {
            addCriterion("rdepartment is null");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIsNotNull() {
            addCriterion("rdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andRdepartmentEqualTo(String value) {
            addCriterion("rdepartment =", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotEqualTo(String value) {
            addCriterion("rdepartment <>", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentGreaterThan(String value) {
            addCriterion("rdepartment >", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("rdepartment >=", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLessThan(String value) {
            addCriterion("rdepartment <", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLessThanOrEqualTo(String value) {
            addCriterion("rdepartment <=", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLike(String value) {
            addCriterion("rdepartment like", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotLike(String value) {
            addCriterion("rdepartment not like", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIn(List<String> values) {
            addCriterion("rdepartment in", values, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotIn(List<String> values) {
            addCriterion("rdepartment not in", values, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentBetween(String value1, String value2) {
            addCriterion("rdepartment between", value1, value2, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotBetween(String value1, String value2) {
            addCriterion("rdepartment not between", value1, value2, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNull() {
            addCriterion("etype is null");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNotNull() {
            addCriterion("etype is not null");
            return (Criteria) this;
        }

        public Criteria andEtypeEqualTo(String value) {
            addCriterion("etype =", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotEqualTo(String value) {
            addCriterion("etype <>", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThan(String value) {
            addCriterion("etype >", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThanOrEqualTo(String value) {
            addCriterion("etype >=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThan(String value) {
            addCriterion("etype <", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThanOrEqualTo(String value) {
            addCriterion("etype <=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLike(String value) {
            addCriterion("etype like", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotLike(String value) {
            addCriterion("etype not like", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeIn(List<String> values) {
            addCriterion("etype in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotIn(List<String> values) {
            addCriterion("etype not in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeBetween(String value1, String value2) {
            addCriterion("etype between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotBetween(String value1, String value2) {
            addCriterion("etype not between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEfactoryIsNull() {
            addCriterion("efactory is null");
            return (Criteria) this;
        }

        public Criteria andEfactoryIsNotNull() {
            addCriterion("efactory is not null");
            return (Criteria) this;
        }

        public Criteria andEfactoryEqualTo(String value) {
            addCriterion("efactory =", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryNotEqualTo(String value) {
            addCriterion("efactory <>", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryGreaterThan(String value) {
            addCriterion("efactory >", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryGreaterThanOrEqualTo(String value) {
            addCriterion("efactory >=", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryLessThan(String value) {
            addCriterion("efactory <", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryLessThanOrEqualTo(String value) {
            addCriterion("efactory <=", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryLike(String value) {
            addCriterion("efactory like", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryNotLike(String value) {
            addCriterion("efactory not like", value, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryIn(List<String> values) {
            addCriterion("efactory in", values, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryNotIn(List<String> values) {
            addCriterion("efactory not in", values, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryBetween(String value1, String value2) {
            addCriterion("efactory between", value1, value2, "efactory");
            return (Criteria) this;
        }

        public Criteria andEfactoryNotBetween(String value1, String value2) {
            addCriterion("efactory not between", value1, value2, "efactory");
            return (Criteria) this;
        }

        public Criteria andEseriesIsNull() {
            addCriterion("eseries is null");
            return (Criteria) this;
        }

        public Criteria andEseriesIsNotNull() {
            addCriterion("eseries is not null");
            return (Criteria) this;
        }

        public Criteria andEseriesEqualTo(String value) {
            addCriterion("eseries =", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesNotEqualTo(String value) {
            addCriterion("eseries <>", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesGreaterThan(String value) {
            addCriterion("eseries >", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesGreaterThanOrEqualTo(String value) {
            addCriterion("eseries >=", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesLessThan(String value) {
            addCriterion("eseries <", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesLessThanOrEqualTo(String value) {
            addCriterion("eseries <=", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesLike(String value) {
            addCriterion("eseries like", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesNotLike(String value) {
            addCriterion("eseries not like", value, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesIn(List<String> values) {
            addCriterion("eseries in", values, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesNotIn(List<String> values) {
            addCriterion("eseries not in", values, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesBetween(String value1, String value2) {
            addCriterion("eseries between", value1, value2, "eseries");
            return (Criteria) this;
        }

        public Criteria andEseriesNotBetween(String value1, String value2) {
            addCriterion("eseries not between", value1, value2, "eseries");
            return (Criteria) this;
        }

        public Criteria andEbuytimeIsNull() {
            addCriterion("ebuytime is null");
            return (Criteria) this;
        }

        public Criteria andEbuytimeIsNotNull() {
            addCriterion("ebuytime is not null");
            return (Criteria) this;
        }

        public Criteria andEbuytimeEqualTo(Date value) {
            addCriterion("ebuytime =", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeNotEqualTo(Date value) {
            addCriterion("ebuytime <>", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeGreaterThan(Date value) {
            addCriterion("ebuytime >", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ebuytime >=", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeLessThan(Date value) {
            addCriterion("ebuytime <", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeLessThanOrEqualTo(Date value) {
            addCriterion("ebuytime <=", value, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeIn(List<Date> values) {
            addCriterion("ebuytime in", values, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeNotIn(List<Date> values) {
            addCriterion("ebuytime not in", values, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeBetween(Date value1, Date value2) {
            addCriterion("ebuytime between", value1, value2, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEbuytimeNotBetween(Date value1, Date value2) {
            addCriterion("ebuytime not between", value1, value2, "ebuytime");
            return (Criteria) this;
        }

        public Criteria andEpriceIsNull() {
            addCriterion("eprice is null");
            return (Criteria) this;
        }

        public Criteria andEpriceIsNotNull() {
            addCriterion("eprice is not null");
            return (Criteria) this;
        }

        public Criteria andEpriceEqualTo(Float value) {
            addCriterion("eprice =", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceNotEqualTo(Float value) {
            addCriterion("eprice <>", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceGreaterThan(Float value) {
            addCriterion("eprice >", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("eprice >=", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceLessThan(Float value) {
            addCriterion("eprice <", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceLessThanOrEqualTo(Float value) {
            addCriterion("eprice <=", value, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceIn(List<Float> values) {
            addCriterion("eprice in", values, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceNotIn(List<Float> values) {
            addCriterion("eprice not in", values, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceBetween(Float value1, Float value2) {
            addCriterion("eprice between", value1, value2, "eprice");
            return (Criteria) this;
        }

        public Criteria andEpriceNotBetween(Float value1, Float value2) {
            addCriterion("eprice not between", value1, value2, "eprice");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeIsNull() {
            addCriterion("emaintaintime is null");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeIsNotNull() {
            addCriterion("emaintaintime is not null");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeEqualTo(Date value) {
            addCriterion("emaintaintime =", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeNotEqualTo(Date value) {
            addCriterion("emaintaintime <>", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeGreaterThan(Date value) {
            addCriterion("emaintaintime >", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("emaintaintime >=", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeLessThan(Date value) {
            addCriterion("emaintaintime <", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeLessThanOrEqualTo(Date value) {
            addCriterion("emaintaintime <=", value, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeIn(List<Date> values) {
            addCriterion("emaintaintime in", values, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeNotIn(List<Date> values) {
            addCriterion("emaintaintime not in", values, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeBetween(Date value1, Date value2) {
            addCriterion("emaintaintime between", value1, value2, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEmaintaintimeNotBetween(Date value1, Date value2) {
            addCriterion("emaintaintime not between", value1, value2, "emaintaintime");
            return (Criteria) this;
        }

        public Criteria andEspacefirstIsNull() {
            addCriterion("espacefirst is null");
            return (Criteria) this;
        }

        public Criteria andEspacefirstIsNotNull() {
            addCriterion("espacefirst is not null");
            return (Criteria) this;
        }

        public Criteria andEspacefirstEqualTo(String value) {
            addCriterion("espacefirst =", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstNotEqualTo(String value) {
            addCriterion("espacefirst <>", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstGreaterThan(String value) {
            addCriterion("espacefirst >", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstGreaterThanOrEqualTo(String value) {
            addCriterion("espacefirst >=", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstLessThan(String value) {
            addCriterion("espacefirst <", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstLessThanOrEqualTo(String value) {
            addCriterion("espacefirst <=", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstLike(String value) {
            addCriterion("espacefirst like", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstNotLike(String value) {
            addCriterion("espacefirst not like", value, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstIn(List<String> values) {
            addCriterion("espacefirst in", values, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstNotIn(List<String> values) {
            addCriterion("espacefirst not in", values, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstBetween(String value1, String value2) {
            addCriterion("espacefirst between", value1, value2, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacefirstNotBetween(String value1, String value2) {
            addCriterion("espacefirst not between", value1, value2, "espacefirst");
            return (Criteria) this;
        }

        public Criteria andEspacesecondIsNull() {
            addCriterion("espacesecond is null");
            return (Criteria) this;
        }

        public Criteria andEspacesecondIsNotNull() {
            addCriterion("espacesecond is not null");
            return (Criteria) this;
        }

        public Criteria andEspacesecondEqualTo(String value) {
            addCriterion("espacesecond =", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondNotEqualTo(String value) {
            addCriterion("espacesecond <>", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondGreaterThan(String value) {
            addCriterion("espacesecond >", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondGreaterThanOrEqualTo(String value) {
            addCriterion("espacesecond >=", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondLessThan(String value) {
            addCriterion("espacesecond <", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondLessThanOrEqualTo(String value) {
            addCriterion("espacesecond <=", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondLike(String value) {
            addCriterion("espacesecond like", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondNotLike(String value) {
            addCriterion("espacesecond not like", value, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondIn(List<String> values) {
            addCriterion("espacesecond in", values, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondNotIn(List<String> values) {
            addCriterion("espacesecond not in", values, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondBetween(String value1, String value2) {
            addCriterion("espacesecond between", value1, value2, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacesecondNotBetween(String value1, String value2) {
            addCriterion("espacesecond not between", value1, value2, "espacesecond");
            return (Criteria) this;
        }

        public Criteria andEspacethirdIsNull() {
            addCriterion("espacethird is null");
            return (Criteria) this;
        }

        public Criteria andEspacethirdIsNotNull() {
            addCriterion("espacethird is not null");
            return (Criteria) this;
        }

        public Criteria andEspacethirdEqualTo(Date value) {
            addCriterion("espacethird =", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdNotEqualTo(Date value) {
            addCriterion("espacethird <>", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdGreaterThan(Date value) {
            addCriterion("espacethird >", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdGreaterThanOrEqualTo(Date value) {
            addCriterion("espacethird >=", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdLessThan(Date value) {
            addCriterion("espacethird <", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdLessThanOrEqualTo(Date value) {
            addCriterion("espacethird <=", value, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdIn(List<Date> values) {
            addCriterion("espacethird in", values, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdNotIn(List<Date> values) {
            addCriterion("espacethird not in", values, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdBetween(Date value1, Date value2) {
            addCriterion("espacethird between", value1, value2, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspacethirdNotBetween(Date value1, Date value2) {
            addCriterion("espacethird not between", value1, value2, "espacethird");
            return (Criteria) this;
        }

        public Criteria andEspaceforthIsNull() {
            addCriterion("espaceforth is null");
            return (Criteria) this;
        }

        public Criteria andEspaceforthIsNotNull() {
            addCriterion("espaceforth is not null");
            return (Criteria) this;
        }

        public Criteria andEspaceforthEqualTo(Integer value) {
            addCriterion("espaceforth =", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthNotEqualTo(Integer value) {
            addCriterion("espaceforth <>", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthGreaterThan(Integer value) {
            addCriterion("espaceforth >", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthGreaterThanOrEqualTo(Integer value) {
            addCriterion("espaceforth >=", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthLessThan(Integer value) {
            addCriterion("espaceforth <", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthLessThanOrEqualTo(Integer value) {
            addCriterion("espaceforth <=", value, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthIn(List<Integer> values) {
            addCriterion("espaceforth in", values, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthNotIn(List<Integer> values) {
            addCriterion("espaceforth not in", values, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthBetween(Integer value1, Integer value2) {
            addCriterion("espaceforth between", value1, value2, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspaceforthNotBetween(Integer value1, Integer value2) {
            addCriterion("espaceforth not between", value1, value2, "espaceforth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthIsNull() {
            addCriterion("espacefifth is null");
            return (Criteria) this;
        }

        public Criteria andEspacefifthIsNotNull() {
            addCriterion("espacefifth is not null");
            return (Criteria) this;
        }

        public Criteria andEspacefifthEqualTo(Float value) {
            addCriterion("espacefifth =", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthNotEqualTo(Float value) {
            addCriterion("espacefifth <>", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthGreaterThan(Float value) {
            addCriterion("espacefifth >", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthGreaterThanOrEqualTo(Float value) {
            addCriterion("espacefifth >=", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthLessThan(Float value) {
            addCriterion("espacefifth <", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthLessThanOrEqualTo(Float value) {
            addCriterion("espacefifth <=", value, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthIn(List<Float> values) {
            addCriterion("espacefifth in", values, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthNotIn(List<Float> values) {
            addCriterion("espacefifth not in", values, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthBetween(Float value1, Float value2) {
            addCriterion("espacefifth between", value1, value2, "espacefifth");
            return (Criteria) this;
        }

        public Criteria andEspacefifthNotBetween(Float value1, Float value2) {
            addCriterion("espacefifth not between", value1, value2, "espacefifth");
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