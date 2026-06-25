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
        String query = "insert into Student values(13 , 'Subhash' , 43 , 'lucknow')";
        boolean status = st.execute(query);
        ResultSet rs = st.getResultSet();
        if(status){

            while(rs.next()){
                System.out.println(rs.getInt(1)+ " ");
                System.out.println(rs.getString(2)+" ");
                System.out.println(rs.getInt(3)+" ");
                System.out.println(rs.getString(4)+" ");
            }
        }
        else{
            int rows = st.getUpdateCount();
            if(rows>0){
                System.out.println(rows+" rows updated");

            }
            else{
                System.out.println("Operation failed");
            }
        }
        if(rs != null){
            rs.close();
        }
        st.close();
        con.close();


    }
}