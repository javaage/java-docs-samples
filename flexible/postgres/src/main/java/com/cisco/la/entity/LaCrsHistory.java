package com.cisco.la.entity;
public class LaCrsHistory {
    private String hstrUsrId;
    private Object hstrCrsId;
    public LaCrsHistory() {
        super();
    }
    public LaCrsHistory(String hstrUsrId,Object hstrCrsId) {
        super();
        this.hstrUsrId = hstrUsrId;
        this.hstrCrsId = hstrCrsId;
    }
    public String getHstrUsrId() {
        return this.hstrUsrId;
    }

    public void setHstrUsrId(String hstrUsrId) {
        this.hstrUsrId = hstrUsrId;
    }

    public Object getHstrCrsId() {
        return this.hstrCrsId;
    }

    public void setHstrCrsId(Object hstrCrsId) {
        this.hstrCrsId = hstrCrsId;
    }

}
