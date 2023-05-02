package com.crs.kpmg.service;
import com.crs.kpmg.bean.*;

import java.util.ArrayList;

public class StudentService implements StudentInterface {

    private AdminService adminService;

    public void courseRegister(){
        System.out.println("Course Register");
    }
    public void addCourse(Course course){
        System.out.println("Add Course");
    }
    public void dropCourse(Course course){
        System.out.println("Drop Course");
    }
    public void viewGrades(){
        System.out.println("View Grades");
    }
    public  void payFee(){
        System.out.println("Pay Fee");
    }
    public void viewCourses()
    {   AdminService adminService = new AdminService();
        adminService.viewCourses();
    }
}
