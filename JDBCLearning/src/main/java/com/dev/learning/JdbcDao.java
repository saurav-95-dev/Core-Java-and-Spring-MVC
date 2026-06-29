package com.dev.learning;

import java.sql.SQLException;

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
        int id = 11;
        try {
            student = studentDao.getStudentById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Name of the student with id " + id + " is: " +student.sname);
    }
}