package com.arena.pojo;

import java.util.Date;

public class Maintain {
    private Integer wid;

    private String weid;

    private String wname;

    private Date wmaintaintime;

    private String wcomponent;

    private String wreason;

    private String wresult;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWeid() {
        return weid;
    }

    public void setWeid(String weid) {
        this.weid = weid == null ? null : weid.trim();
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public Date getWmaintaintime() {
        return wmaintaintime;
    }

    public void setWmaintaintime(Date wmaintaintime) {
        this.wmaintaintime = wmaintaintime;
    }

    public String getWcomponent() {
        return wcomponent;
    }

    public void setWcomponent(String wcomponent) {
        this.wcomponent = wcomponent == null ? null : wcomponent.trim();
    }

    public String getWreason() {
        return wreason;
    }

    public void setWreason(String wreason) {
        this.wreason = wreason == null ? null : wreason.trim();
    }

    public String getWresult() {
        return wresult;
    }

    public void setWresult(String wresult) {
        this.wresult = wresult == null ? null : wresult.trim();
    }
}