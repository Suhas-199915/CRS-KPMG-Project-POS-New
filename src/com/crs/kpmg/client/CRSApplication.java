package com.crs.kpmg.client;
import com.crs.kpmg.service.*;
import com.crs.kpmg.bean.*;
import com.crs.kpmg.dao.*;
import java.util.*;
public class CRSApplication{

    public static void main(String[] args){
        AdminService adminService = new AdminService();
        StudentService studentService = new StudentService();
        ProfessorService professorService = new ProfessorService();

        User user = new User();
        Scanner sc= new Scanner(System.in);

        /* System.out.println("Welcome to CRS Application");
        System.out.println("1.Login");
        System.out.println("2.Student Sign up");
        System.out.println("3.Update Password");
        System.out.println("4.Exit");


        String userType = "q";
        System.out.println("Enter your choice:");
        int mainOption = sc.nextInt();
        sc.nextLine();
        switch (mainOption){
            case 1 :{
                System.out.println("Enter Username:");
                String username = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter password:");
                String password = sc.nextLine();
                if((username != user.getUserName()) || (password != user.getPassword())){
                    System.out.println("Login unsuccessful");
                }

                break;
            }
            case 2 :{
                System.out.println("Enter Username:");
                String username = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter password:");
                String password = sc.nextLine();
                user.setUserName(username);
                user.setPassword(password);
                break;
            }
            case 3 :{

                System.out.println("Enter Username:");
                String username = sc.nextLine();
                if(username != user.getUserName()){
                    System.out.println("Password reset unsuccessful");
                    break;
                }
                System.out.println("Enter password:");
                String updatedPassword = sc.nextLine();
                user.setPassword(updatedPassword);
                break;

            }
            case 4:{
                System.out.println("-----EXIT----");
                break;
            }*/


        }

    }




