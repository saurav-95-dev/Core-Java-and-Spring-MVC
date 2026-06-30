package com.dev.learning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//This class will contain all the JDBC logic:
public class StudentDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    //Retrieval operation
    public Student getStudentById(int id) throws SQLException {

        try{
            Student student = new Student();
            //fetching data from DB via JDBC:
            con = JdbcDaoUtil.getConnection();
            String sql = "select * from Student where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                student.sname = rs.getString("sname");
            }
            return student;
        }
        catch(SQLException e){
            throw e;
        }
        catch(Exception e){
            throw new SQLException(e.getMessage());
        }
        finally {
            JdbcDaoUtil.closeConnection(con, ps , rs);
        }
    }
}

