package com.arena.pojo;

import java.util.Date;

public class Departments {
    private Integer did;

    private String dname;

    private Date ddate;

    private String dfirst;

    private String ddetial;

    private String dsecond;

    private Integer dthird;

    private Float dforth;

    private String dfifth;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getDfirst() {
        return dfirst;
    }

    public void setDfirst(String dfirst) {
        this.dfirst = dfirst == null ? null : dfirst.trim();
    }

    public String getDdetial() {
        return ddetial;
    }

    public void setDdetial(String ddetial) {
        this.ddetial = ddetial == null ? null : ddetial.trim();
    }

    public String getDsecond() {
        return dsecond;
    }

    public void setDsecond(String dsecond) {
        this.dsecond = dsecond == null ? null : dsecond.trim();
    }

    public Integer getDthird() {
        return dthird;
    }

    public void setDthird(Integer dthird) {
        this.dthird = dthird;
    }

    public Float getDforth() {
        return dforth;
    }

    public void setDforth(Float dforth) {
        this.dforth = dforth;
    }

    public String getDfifth() {
        return dfifth;
    }

    public void setDfifth(String dfifth) {
        this.dfifth = dfifth == null ? null : dfifth.trim();
    }
}