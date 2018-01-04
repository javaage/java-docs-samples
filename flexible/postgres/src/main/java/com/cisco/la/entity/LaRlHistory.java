package com.cisco.la.entity;
public class LaRlHistory {
    private String hstrUsrId;
    private java.util.Date hstrUpdateTime;
    private String hstrRlHistory;
    private String hstrRlName;
    public LaRlHistory() {
        super();
    }
    public LaRlHistory(String hstrUsrId,java.util.Date hstrUpdateTime,String hstrRlHistory,String hstrRlName) {
        super();
        this.hstrUsrId = hstrUsrId;
        this.hstrUpdateTime = hstrUpdateTime;
        this.hstrRlHistory = hstrRlHistory;
        this.hstrRlName = hstrRlName;
    }
    public String getHstrUsrId() {
        return this.hstrUsrId;
    }

    public void setHstrUsrId(String hstrUsrId) {
        this.hstrUsrId = hstrUsrId;
    }

    public java.util.Date getHstrUpdateTime() {
        return this.hstrUpdateTime;
    }

    public void setHstrUpdateTime(java.util.Date hstrUpdateTime) {
        this.hstrUpdateTime = hstrUpdateTime;
    }

    public String getHstrRlHistory() {
        return this.hstrRlHistory;
    }

    public void setHstrRlHistory(String hstrRlHistory) {
        this.hstrRlHistory = hstrRlHistory;
    }

    public String getHstrRlName() {
        return this.hstrRlName;
    }

    public void setHstrRlName(String hstrRlName) {
        this.hstrRlName = hstrRlName;
    }

}
