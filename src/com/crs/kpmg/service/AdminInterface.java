package com.crs.kpmg.service;

import com.crs.kpmg.bean.Course;
import com.crs.kpmg.bean.Professor;
import com.crs.kpmg.bean.Student;

import java.util.ArrayList;

public interface AdminInterface {

    void generateReportCard();
    void addProfessor(Professor professor);
    void addCourse();
    void removeCourse(int courseId);
    void approveStudentRegistration(Student student);
    void removeStudent(int studId);

    static void addStudent() {

    }

    void sendBillingInfo();
    void viewStudents();
    void viewCourses() ;
}
