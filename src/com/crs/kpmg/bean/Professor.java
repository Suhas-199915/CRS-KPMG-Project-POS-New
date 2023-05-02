package com.crs.kpmg.bean;

public class Professor {
    private String profName;
    private  int profId;

    public Professor(){

    }
    public Professor(String profName, int profId){
        this.profName = profName;
        this.profId = profId;
    }

    public int getProfId() {
        return profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
}
