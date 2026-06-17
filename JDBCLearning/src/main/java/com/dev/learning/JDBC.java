package com.dev.learning;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         //Step 1 : Load and register the driver:
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Step 2 : Establish connection to the database :
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "xyz";
        Connection connect = DriverManager.getConnection(url , user , password);

        //Step 3 : Create statement object upon which SQL query will be performed:
        Statement statement = connect.createStatement();

        //Step 4 : Execute the query on statement object:
        //*Whenever we do on-select operation , we'll use executeUpdate() method:
        String query = "insert into Student values(11 , 'Nikita' , 23 , 'Gorakhpur')";
        int rows = statement.executeUpdate(query);
        if(rows>0){
            System.out.println("Student has been inserted successfully");
        }
        else{
            System.out.println("Student has NOT been inserted successfully");
        }


    }
}
