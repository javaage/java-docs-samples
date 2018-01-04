package com.cisco.la.entity;
public class LaUser {
    private String usrId;
    private Object usrBalance;
    private Object usrActive;
    private String usrTitle;
    private String usrRlName;
    private String usrName;
    private String usrGrade;
    private String usrBu;
    private Object usrBudget;
    public LaUser() {
        super();
    }
    public LaUser(String usrId,Object usrBalance,Object usrActive,String usrTitle,String usrRlName,String usrName,String usrGrade,String usrBu,Object usrBudget) {
        super();
        this.usrId = usrId;
        this.usrBalance = usrBalance;
        this.usrActive = usrActive;
        this.usrTitle = usrTitle;
        this.usrRlName = usrRlName;
        this.usrName = usrName;
        this.usrGrade = usrGrade;
        this.usrBu = usrBu;
        this.usrBudget = usrBudget;
    }
    public String getUsrId() {
        return this.usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Object getUsrBalance() {
        return this.usrBalance;
    }

    public void setUsrBalance(Object usrBalance) {
        this.usrBalance = usrBalance;
    }

    public Object getUsrActive() {
        return this.usrActive;
    }

    public void setUsrActive(Object usrActive) {
        this.usrActive = usrActive;
    }

    public String getUsrTitle() {
        return this.usrTitle;
    }

    public void setUsrTitle(String usrTitle) {
        this.usrTitle = usrTitle;
    }

    public String getUsrRlName() {
        return this.usrRlName;
    }

    public void setUsrRlName(String usrRlName) {
        this.usrRlName = usrRlName;
    }

    public String getUsrName() {
        return this.usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrGrade() {
        return this.usrGrade;
    }

    public void setUsrGrade(String usrGrade) {
        this.usrGrade = usrGrade;
    }

    public String getUsrBu() {
        return this.usrBu;
    }

    public void setUsrBu(String usrBu) {
        this.usrBu = usrBu;
    }

    public Object getUsrBudget() {
        return this.usrBudget;
    }

    public void setUsrBudget(Object usrBudget) {
        this.usrBudget = usrBudget;
    }

}
