package com.crs.kpmg.dao;

import com.crs.kpmg.bean.Professor;
import com.crs.kpmg.bean.Student;

import java.util.ArrayList;

public class ProfessorDao {
    public static ArrayList<Professor> professorList= new ArrayList<Professor>();
    public void addAllProfessor() {
        Professor professor1 = new Professor( "prof1",100);
        Professor professor2 = new Professor("prof2",101);
        Professor professor3 = new Professor("prof3",103);
        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);
    }
}
