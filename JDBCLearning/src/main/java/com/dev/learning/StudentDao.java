package com.dev.learning;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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

    //Method for creating a Student:
    public void createStudent(int id , String name , int age , String city) throws SQLException {
        try{
            con = JdbcDaoUtil.getConnection();
            String sql = "insert into Student values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, city);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student has been created !. ...ENJOY !");
            }
            else {
                System.out.println("Student creation failed !");
            }
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

    public void updateStudent(int id, String scity) throws SQLException {
        con = JdbcDaoUtil.getConnection();
        System.out.println("Enter new name of the city :");
        Scanner sc = new Scanner(System.in);
        scity = sc.next();
        String sql = "update Student set scity = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, scity);   // First ?
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Student has been updated !. ...ENJOY !");
            System.out.println("The new name of the city for Student - is " + scity);

        }
        else{
            System.out.println("Student update failed !");
        }

    }
}

