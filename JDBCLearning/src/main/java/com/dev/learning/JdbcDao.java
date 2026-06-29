package com.dev.learning;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

class Student{
    int id;
    String sname;
    int sage;
    String scity;
}

public class JdbcDao {
    public static void main(String[] args) {
        //Business logic inside main function-
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        System.out.println("Enter the id of Student you want to fetch:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        try {
            student = studentDao.getStudentById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Name of the student with id " + id + " is: " +student.sname);
    }
}