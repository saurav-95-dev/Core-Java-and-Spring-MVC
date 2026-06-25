package com.dev.learning;
import java.sql.*;

class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Step-1 : Load and register the driver:
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Step-2 :
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "xyz"; // your real password
        Connection con =  DriverManager.getConnection(url, username, password);
        //Ste-3 : Create Statement upon which query will be executed:
        Statement st = con.createStatement();
        String query = "Delete from Student where id = '12'";
        int rows = st.executeUpdate(query);
        if (rows > 0) {
            System.out.println("Student deleted successfully");
        }
        else {
            System.out.println("Student not deleted successfully");
        }
        st.close();
        con.close();


    }
}