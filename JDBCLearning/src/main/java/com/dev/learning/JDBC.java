package com.dev.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

class JDBC{
    public static void main(String[] args){
        System.out.println("Handling Exception in JDBC:");
        Connection con = null;
        Statement stmt = null;
        try{
            //Step:1 -- Load and register the driver:
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step:2 -- Create Connection:
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "Saurabh@123";
            con = DriverManager.getConnection(url, username, password);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            // close the resources:
            try {
                con.close();
                stmt.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }
}