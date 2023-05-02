package com.crs.kpmg.service;
import com.crs.kpmg.bean.*;
import com.crs.kpmg.bean.Professor;
import java.util.*;


public class AdminService implements AdminInterface{
    public  static  ArrayList<Student> studentList = new ArrayList<>();
    public static ArrayList<Course> courseList = new ArrayList<>();
    public  static ArrayList<Professor> professorList = new ArrayList<>();
    public  static ArrayList<User> userList = new ArrayList<User>();

    Scanner sc= new Scanner(System.in);
    public void generateReportCard() {
        System.out.println("Generate Report Card");
    }

    public void addProfessor(Professor professor) {
        System.out.println("Add Professor");
    }

    public void addStudent() {

        System.out.println("Enter Student ID: ");
        int studId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student name: ");
        String studName = sc.nextLine();
        System.out.println("Enter Student Dept: ");
        String studDept = sc.nextLine();
        Student student = new Student();
        student.setStudId(studId);
        student.setStudDept(studDept);
        student.setStudName(studName);

        studentList.add(student);
    }
    public void viewStudents(){
        for(Student value : studentList) {
            System.out.println("Name-->"+value.getStudName()+"-->ID-->"+value.getStudId()+"-->Dept-->"+value.getStudDept());
        }
    }



    public void removeStudent(int studId) {
       for(Student value : studentList){
           if(value.getStudId() == studId){
              studentList.remove(value);
              break;
           }
       }
    }

    public void addCourse() {
        System.out.println("Enter course name:");
        String courseName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter course ID:");
        int courseId = sc.nextInt();
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        courseList.add(course);

    }
    public void removeCourse(int courseId) {
        for(Course value : courseList){
            if(value.getCourseId() == courseId){
                courseList.remove(value);
                break;
            }
        }
    }
    public  void viewCourses()
    {
        for(Course value : courseList) {
            System.out.println("Course Name-->" + value.getCourseName() + "-->Course ID-->" + value.getCourseId());
        }
    }
    public void addUser(String userName, String password){
        User user = new User(userName,password);
        userList.add(user);
    }

    public void approveStudentRegistration(Student student) {
        System.out.println("Approve Student Registration");
    }

    public void sendBillingInfo(){
        System.out.println("Send Billing Info");
    }

}
