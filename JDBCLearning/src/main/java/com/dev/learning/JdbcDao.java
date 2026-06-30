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

    }
}