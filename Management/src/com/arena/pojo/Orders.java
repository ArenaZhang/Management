package com.arena.pojo;

import java.util.Date;

public class Orders {
    private Integer oid;

    private String oname;

    private Date orenttime;

    private Date obacktime;

    private Float oprize;

    private Integer onumber;

    private String odepartment;

    private Float operprize;

    private String oeid;

    private Date oorderstime;

    private String ofirst;

    private Float osecond;

    private Date othird;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Date getOrenttime() {
        return orenttime;
    }

    public void setOrenttime(Date orenttime) {
        this.orenttime = orenttime;
    }

    public Date getObacktime() {
        return obacktime;
    }

    public void setObacktime(Date obacktime) {
        this.obacktime = obacktime;
    }

    public Float getOprize() {
        return oprize;
    }

    public void setOprize(Float oprize) {
        this.oprize = oprize;
    }

    public Integer getOnumber() {
        return onumber;
    }

    public void setOnumber(Integer onumber) {
        this.onumber = onumber;
    }

    public String getOdepartment() {
        return odepartment;
    }

    public void setOdepartment(String odepartment) {
        this.odepartment = odepartment == null ? null : odepartment.trim();
    }

    public Float getOperprize() {
        return operprize;
    }

    public void setOperprize(Float operprize) {
        this.operprize = operprize;
    }

    public String getOeid() {
        return oeid;
    }

    public void setOeid(String oeid) {
        this.oeid = oeid == null ? null : oeid.trim();
    }

    public Date getOorderstime() {
        return oorderstime;
    }

    public void setOorderstime(Date oorderstime) {
        this.oorderstime = oorderstime;
    }

    public String getOfirst() {
        return ofirst;
    }

    public void setOfirst(String ofirst) {
        this.ofirst = ofirst == null ? null : ofirst.trim();
    }

    public Float getOsecond() {
        return osecond;
    }

    public void setOsecond(Float osecond) {
        this.osecond = osecond;
    }

    public Date getOthird() {
        return othird;
    }

    public void setOthird(Date othird) {
        this.othird = othird;
    }
}