package com.dev.learning;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        System.out.println("Handling Exception in JDBC:");

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Step 1: Load and Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the Connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "xyz";

            con = DriverManager.getConnection(url, username, password);

            // Step 3: Create Statement
            st = con.createStatement();

            // Step 4: Execute Query
            String query = "SELECT * FROM Student";
            rs = st.executeQuery(query);

            // Step 5: Process the ResultSet
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3) + " " +
                                rs.getString(4)
                );
            }

        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
            e.printStackTrace();
        }
        finally {

            // Close ResultSet
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error while closing ResultSet.");
                    e.printStackTrace();
                }
            }

            // Close Statement
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    System.out.println("Error while closing Statement.");
                    e.printStackTrace();
                }
            }

            // Close Connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error while closing Connection.");
                    e.printStackTrace();
                }
            }
        }
    }
}