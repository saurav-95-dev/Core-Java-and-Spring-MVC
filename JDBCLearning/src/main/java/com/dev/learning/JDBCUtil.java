package com.dev.learning;

import java.sql.*;

public class JDBCUtil {
     static {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
     }
     //Common methods :
    //Creating Connection:
    public static Connection getConnection() throws SQLException {
         String url = "jdbc:mysql://localhost:3306/jdbclearning";
         String user = "root";
         String password = "xyz";
        return DriverManager.getConnection(url, user, password);
    }

    //Closing the Connection:
    public static void closeConnection(Connection con , Statement st, ResultSet rs) {
         try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
    }
}
