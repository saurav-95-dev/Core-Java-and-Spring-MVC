package  com.dev.learning;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC{
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        //Step-1-Load and register the driver.

        //Step-2-Create Connection.
        try {
            con = JDBCUtil.getConnection();
            st = con.createStatement();
            String query = "insert into Student values(14 , 'Mona' , 321 , 'Gaziabad')";
            boolean status = st.execute(query);
            if (status) {
                //retrieval operation:
                rs = st.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
                }
            }
            else{
                //data manipulation operation:
                int rowsAffected = st.getUpdateCount();
                if(rowsAffected>0){
                    System.out.println("Operation Successful , ");
                    System.out.println("rows affected = "+rowsAffected);
                }
                else{
                    System.out.println("Operation Failed ");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.closeConnection(con , st , rs);
        }




    }
}