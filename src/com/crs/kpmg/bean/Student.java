package com.crs.kpmg.bean;

import com.crs.kpmg.service.AdminService;

import java.util.Scanner;

public class Student {
    private int studId;
    private String studName;
    private String studDept;

    private AdminService adminService;
    public Student(){

    }
    public Student(int studId, String studName, String studDept){
        this.studId = studId;
        this.studName = studName;
        this.studDept = studDept;

    }

    Scanner sc= new Scanner(System.in);
    public int getStudId() {
        return studId;
    }
    public String getStudName(){
        return studName;
    }
    public String getStudDept() {
        return studDept;
    }
    public void setStudId(int studId) {

        this.studId = studId;

    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public void setStudDept(String studDept) {
       this.studDept = studDept;
    }
}
