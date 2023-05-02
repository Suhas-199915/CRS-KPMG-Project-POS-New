package com.crs.kpmg.service;

import java.lang.reflect.InvocationTargetException;

public interface ProfessorInterface {
    void addGrades();
    void viewEnrolledStudents();
    void viewCourses() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

}
