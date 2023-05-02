package com.crs.kpmg.dao;

import com.crs.kpmg.bean.Course;
import com.crs.kpmg.bean.Professor;

import java.util.ArrayList;

public class CourseDao {
    public static ArrayList<Course> courseList= new ArrayList<Course>();
    public void addAllCourses() {
        Course course1 = new Course("course1",100);
        Course course2 = new Course("course2",101);
        Course course3 = new Course("course3",103);
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
    }
}
