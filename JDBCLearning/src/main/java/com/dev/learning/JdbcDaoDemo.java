package com.dev.learning;

import java.sql.*;

//Dao-Design-Pattern :
public class JdbcDaoDemo {
    public static void main() throws SQLException {
        StudentDao studentDao = new StudentDao();
        Student s1 = studentDao.getStudent(21);
        System.out.println(s1.sname);

    }
}

class StudentDao{
    public Student getStudent(int age) throws SQLException {
        Student s = new Student();
        s.age = age; //Assigning values
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
}

class Student{
    int age;
    String sname;
}


