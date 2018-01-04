package com.cisco.la.entity;
public class LaCourse {
    private Object crsId;
    private String crsName;
    private java.util.Date crsEnddate;
    private java.util.Date crsStartdate;
    private Object crsActive;
    private Object crsPrice;
    public LaCourse() {
        super();
    }
    public LaCourse(Object crsId,String crsName,java.util.Date crsEnddate,java.util.Date crsStartdate,Object crsActive,Object crsPrice) {
        super();
        this.crsId = crsId;
        this.crsName = crsName;
        this.crsEnddate = crsEnddate;
        this.crsStartdate = crsStartdate;
        this.crsActive = crsActive;
        this.crsPrice = crsPrice;
    }
    public Object getCrsId() {
        return this.crsId;
    }

    public void setCrsId(Object crsId) {
        this.crsId = crsId;
    }

    public String getCrsName() {
        return this.crsName;
    }

    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public java.util.Date getCrsEnddate() {
        return this.crsEnddate;
    }

    public void setCrsEnddate(java.util.Date crsEnddate) {
        this.crsEnddate = crsEnddate;
    }

    public java.util.Date getCrsStartdate() {
        return this.crsStartdate;
    }

    public void setCrsStartdate(java.util.Date crsStartdate) {
        this.crsStartdate = crsStartdate;
    }

    public Object getCrsActive() {
        return this.crsActive;
    }

    public void setCrsActive(Object crsActive) {
        this.crsActive = crsActive;
    }

    public Object getCrsPrice() {
        return this.crsPrice;
    }

    public void setCrsPrice(Object crsPrice) {
        this.crsPrice = crsPrice;
    }

}
