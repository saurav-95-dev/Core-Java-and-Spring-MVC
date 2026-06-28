package  com.dev.learning;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

class JDBC{
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        //Step-1-Load and register the driver.

        //Step-2-Create Connection.
        try {
            con = JDBCUtil.getConnection();
            //st = con.createStatement();
            String query = "insert into Student(id , sname , sage , scity) values(?,?,?,?)";
            ps = con.prepareStatement(query);
            //taking user input:
            System.out.println("Enter the detail to store in DBs");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter you ID:");
            Integer id = sc.nextInt();
            System.out.println("Enter your name:");
            String name = sc.next();
            System.out.println("Enter your age:");
            Integer age = sc.nextInt();
            System.out.println("Enter your city:");
            String city = sc.next();
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, city);
            boolean status = ps.execute(); //don't pass query here
            if (status) {
                //retrieval operation:
                rs = st.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
                }
            }
            else{
                //data manipulation operation:

                int rows= ps.getUpdateCount();
                if (rows>0){
                    System.out.println("Successfully inserted "+rows+" records");
                }
                else{
                    System.out.println("Failed to insert "+rows+" records");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.closeConnection(con , ps , rs);
        }




    }
}