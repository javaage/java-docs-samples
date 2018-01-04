package com.cisco.la.entity;
public class LaGoldenSample {
    private String smplOptional;
    private String smplMandatory;
    private String smplName;
    private String smplRlName;
    private java.util.Date smplUpdateTime;
    private String smplRole;
    private Object smplActive;
    public LaGoldenSample() {
        super();
    }
    public LaGoldenSample(String smplOptional,String smplMandatory,String smplName,String smplRlName,java.util.Date smplUpdateTime,String smplRole,Object smplActive) {
        super();
        this.smplOptional = smplOptional;
        this.smplMandatory = smplMandatory;
        this.smplName = smplName;
        this.smplRlName = smplRlName;
        this.smplUpdateTime = smplUpdateTime;
        this.smplRole = smplRole;
        this.smplActive = smplActive;
    }
    public String getSmplOptional() {
        return this.smplOptional;
    }

    public void setSmplOptional(String smplOptional) {
        this.smplOptional = smplOptional;
    }

    public String getSmplMandatory() {
        return this.smplMandatory;
    }

    public void setSmplMandatory(String smplMandatory) {
        this.smplMandatory = smplMandatory;
    }

    public String getSmplName() {
        return this.smplName;
    }

    public void setSmplName(String smplName) {
        this.smplName = smplName;
    }

    public String getSmplRlName() {
        return this.smplRlName;
    }

    public void setSmplRlName(String smplRlName) {
        this.smplRlName = smplRlName;
    }

    public java.util.Date getSmplUpdateTime() {
        return this.smplUpdateTime;
    }

    public void setSmplUpdateTime(java.util.Date smplUpdateTime) {
        this.smplUpdateTime = smplUpdateTime;
    }

    public String getSmplRole() {
        return this.smplRole;
    }

    public void setSmplRole(String smplRole) {
        this.smplRole = smplRole;
    }

    public Object getSmplActive() {
        return this.smplActive;
    }

    public void setSmplActive(Object smplActive) {
        this.smplActive = smplActive;
    }

}
