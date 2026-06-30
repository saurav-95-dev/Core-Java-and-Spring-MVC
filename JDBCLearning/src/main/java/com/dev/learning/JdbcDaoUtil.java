package com.dev.learning;

import java.sql.*;

public class JdbcDaoUtil {
    //this class will contain common JDBC steps:
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //Method for creating connection:
    public static Connection getConnection() throws SQLException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "Saurabh@123";
        return DriverManager.getConnection(url, user, password);
    }
    //Method for closing the connection:
    public static void closeConnection(Connection con , PreparedStatement ps , ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}