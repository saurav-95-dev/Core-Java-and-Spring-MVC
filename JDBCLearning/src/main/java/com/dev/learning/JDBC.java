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
        String query = "select * from Student";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "  + rs.getInt(3) + " " + rs.getString(4));
        }
        rs.close();
        st.close();
        con.close();


    }
}