package com.crs.kpmg.dao;

import com.crs.kpmg.bean.Student;
import com.crs.kpmg.service.*;

import java.util.ArrayList;

public class StudentDao  {

    public static  ArrayList<Student> studentList= new ArrayList<Student>();
    public void addAllStudents() {
        Student student1 = new Student(100, "stud1", "EC");
        Student student2 = new Student(101, "stud2", "EC");
        Student student3 = new Student(102, "stud3", "EC");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

}
