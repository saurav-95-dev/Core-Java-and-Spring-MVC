package com.dev.learning;

import java.sql.*;

//Dao-Design-Pattern :
public class JdbcDaoDemo {
    public static void main() throws SQLException {
        StudentDao studentDao = new StudentDao();
        //Retrieval Operation:
        Student s1 = studentDao.getStudent(21);
        System.out.println(s1.sname);
        //Adding a new entry:
        Student s2 = new Student();
        s2.sname = "Akash";
        s2.sage = 101;
        s2.id = 212;
        s2.scity = "NCR";
        studentDao.addStudent(s2);
        //Deletion Operation :
        studentDao.removeStudent(9);


    }
}

class StudentDao{
    //method for retrieving an entry:
    public Student getStudent(int age) throws SQLException {
        Student s = new Student();
        s.sage = age; //Assigning values
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "xyz";
        Connection con = DriverManager.getConnection(url , user, password);
        String query = "select sname from Student where sage =21 ";
        Statement st = con.createStatement();
        boolean status = st.execute(query);
        if (status) {
            ResultSet rs = st.getResultSet();
            rs.next();
            String sname = rs.getString(1);
            s.sname = sname;

        }
        else{
            int rows = st.getUpdateCount();
            if(rows>0){
                System.out.println("Operation Successful");
            }
            else{
                System.out.println("Operation Failed");
            }
        }
        return s;
    }

    //Method to add new entry:
    public void addStudent(Student s) throws SQLException {
        String query = "insert into Student values( ? ,? , ? , ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "xyz";
        Connection con = DriverManager.getConnection(url , user, password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,s.id);
        ps.setString(2 , s.sname);
        ps.setInt(3 , s.sage);
        ps.setString(4 , s.scity);
        int rows = ps.executeUpdate();
        if(rows>0){
            System.out.println("Operation Successful");
        }
        else{
            System.out.println("Operation Failed");
        }

    }

    //Deletion Operation:
    public void removeStudent(int id) throws SQLException {
        String query = "delete from Student where id =?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "xyz";
        Connection con = DriverManager.getConnection(url , user, password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();

        if(rows>0){
            System.out.println("Operation Successful");
        }
        else{
            System.out.println("Operation Failed");
        }
    }
}

class Student{
    int sage;
    String sname;
    int id;
    String scity;
}


