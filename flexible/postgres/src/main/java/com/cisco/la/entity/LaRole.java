package com.cisco.la.entity;
public class LaRole {
    private String rlName;
    private String rlBu;
    private String rlTitle;
    private String rlGrade;
    private Object rlActive;
    public LaRole() {
        super();
    }
    public LaRole(String rlName,String rlBu,String rlTitle,String rlGrade,Object rlActive) {
        super();
        this.rlName = rlName;
        this.rlBu = rlBu;
        this.rlTitle = rlTitle;
        this.rlGrade = rlGrade;
        this.rlActive = rlActive;
    }
    public String getRlName() {
        return this.rlName;
    }

    public void setRlName(String rlName) {
        this.rlName = rlName;
    }

    public String getRlBu() {
        return this.rlBu;
    }

    public void setRlBu(String rlBu) {
        this.rlBu = rlBu;
    }

    public String getRlTitle() {
        return this.rlTitle;
    }

    public void setRlTitle(String rlTitle) {
        this.rlTitle = rlTitle;
    }

    public String getRlGrade() {
        return this.rlGrade;
    }

    public void setRlGrade(String rlGrade) {
        this.rlGrade = rlGrade;
    }

    public Object getRlActive() {
        return this.rlActive;
    }

    public void setRlActive(Object rlActive) {
        this.rlActive = rlActive;
    }

}
