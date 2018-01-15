package com.arena.pojo;

import java.util.Date;

public class Items {
    private String eid;

    private String ename;

    private Date ebacktime;

    private String status;

    private Date erenttime;

    private String rname;

    private String rdepartment;

    private String etype;

    private String efactory;

    private String eseries;

    private Date ebuytime;

    private Float eprice;

    private Date emaintaintime;

    private String espacefirst;

    private String espacesecond;

    private Date espacethird;

    private Integer espaceforth;

    private Float espacefifth;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Date getEbacktime() {
        return ebacktime;
    }

    public void setEbacktime(Date ebacktime) {
        this.ebacktime = ebacktime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
       this.status = status;
    	
    }

    public Date getErenttime() {
        return erenttime;
    }

    public void setErenttime(Date erenttime) {
        this.erenttime = erenttime;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdepartment() {
        return rdepartment;
    }

    public void setRdepartment(String rdepartment) {
        this.rdepartment = rdepartment == null ? null : rdepartment.trim();
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype == null ? null : etype.trim();
    }

    public String getEfactory() {
        return efactory;
    }

    public void setEfactory(String efactory) {
        this.efactory = efactory == null ? null : efactory.trim();
    }

    public String getEseries() {
        return eseries;
    }

    public void setEseries(String eseries) {
        this.eseries = eseries == null ? null : eseries.trim();
    }

    public Date getEbuytime() {
        return ebuytime;
    }

    public void setEbuytime(Date ebuytime) {
        this.ebuytime = ebuytime;
    }

    public Float getEprice() {
        return eprice;
    }

    public void setEprice(Float eprice) {
        this.eprice = eprice;
    }

    public Date getEmaintaintime() {
        return emaintaintime;
    }

    public void setEmaintaintime(Date emaintaintime) {
        this.emaintaintime = emaintaintime;
    }

    public String getEspacefirst() {
        return espacefirst;
    }

    public void setEspacefirst(String espacefirst) {
        this.espacefirst = espacefirst == null ? null : espacefirst.trim();
    }

    public String getEspacesecond() {
        return espacesecond;
    }

    public void setEspacesecond(String espacesecond) {
        this.espacesecond = espacesecond == null ? null : espacesecond.trim();
    }

    public Date getEspacethird() {
        return espacethird;
    }

    public void setEspacethird(Date espacethird) {
        this.espacethird = espacethird;
    }

    public Integer getEspaceforth() {
        return espaceforth;
    }

    public void setEspaceforth(Integer espaceforth) {
        this.espaceforth = espaceforth;
    }

    public Float getEspacefifth() {
        return espacefifth;
    }

    public void setEspacefifth(Float espacefifth) {
        this.espacefifth = espacefifth;
    }
}