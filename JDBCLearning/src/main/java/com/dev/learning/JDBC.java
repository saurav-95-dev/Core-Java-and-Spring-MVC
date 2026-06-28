package com.dev.learning;

import java.sql.*;

import static java.lang.Class.forName;

class JDBC{
    public static void main(String[] args){
        System.out.println("Handling Exception in JDBC:");
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            //Step:1 -- Load and register the driver:
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step:2 -- Create Connection:
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "Saurabh@123";
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            String query = "select * from Student";
            //this is select operation:
            rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " +  rs.getString(2) + " " +   rs.getInt(3) + " " + rs.getString(4));
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            // close the resources:
            try {
                con.close();
                st.close();
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }
}