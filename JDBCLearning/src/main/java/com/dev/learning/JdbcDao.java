package com.dev.learning;

import java.sql.SQLException;
import java.util.Scanner;

class Student{
    int id;
    String sname;
    int sage;
    String scity;
}
public class JdbcDao{
    public static void main(String args[]){
        int id;
        //main function will contain business logic-
        Student student = new Student();
        StudentDao studentdao = new StudentDao();
        System.out.println("Enter the id to extract name:");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        //Retrieval operation-
        try {
            studentdao.getStudentById(11);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The name of the Student with id " + id + " is "+ student.sname);

        //Insert/Create Operation:
        String sname = "";
        int sage = 0;
        String scity = "";
        System.out.println("Enter id : ");
        student.id = scanner.nextInt();
        System.out.println("Enter Student's name : ");
        student.sname = scanner.next();
        System.out.println("Enter Student's age : ");
        student.sage = scanner.nextInt();
        System.out.println("Enter Student's city : ");
        student.scity = scanner.next();
        try {
            studentdao.createStudent(student.id , student.sname , student.sage , student.scity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}