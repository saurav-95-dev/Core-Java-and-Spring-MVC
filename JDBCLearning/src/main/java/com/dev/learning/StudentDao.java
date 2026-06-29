package com.dev.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//this class will contain all the jdbc logic-
public class StudentDao {
    public Student getStudentById(int id) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Student student = new Student();
            try {
                con = JdbcDaoUtil.getConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            String query = "select * from student where id = ?";
            ps =con.prepareStatement(query);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                student.sname=rs.getString(2);
            }
            return student;
        }
        catch(SQLException e){
            throw new RuntimeException(e);

        }
        finally {
            JdbcDaoUtil.closeConnection(con , ps , rs);
        }
    }
}
