package com.crs.kpmg.service;
import com.crs.kpmg.bean.*;
public interface StudentInterface {
    void courseRegister();
    void addCourse(Course course);
    void dropCourse(Course course);
    void viewGrades();
    void payFee();
    void viewCourses();

}
