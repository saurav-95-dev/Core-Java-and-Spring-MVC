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
        String query = "Update Student set sage = '21' where id = '11'";
        int rows = st.executeUpdate(query);
        if(rows == 0){
            System.out.println("Operation failed");
        }
        else{
            System.out.println("Operation successful");
        }
        st.close();
        con.close();


    }
}