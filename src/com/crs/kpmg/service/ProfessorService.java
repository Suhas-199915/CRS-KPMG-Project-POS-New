package com.crs.kpmg.service;
import com.crs.kpmg.bean.*;
import com.crs.kpmg.service.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ProfessorService implements ProfessorInterface{
    AdminService adminService = new AdminService();
    public void addGrades() {
        System.out.println("Add Grades");
    }

    public void viewEnrolledStudents() {
        adminService.viewStudents();
    }

    public void viewCourses()
    {

        adminService.viewCourses();
    }

}