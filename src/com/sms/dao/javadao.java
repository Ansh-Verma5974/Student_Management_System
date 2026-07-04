package com.sms.dao;

import com.sms.model.Student;
import com.sms.util.dbconnection;

import java.sql.*;

public class javadao {
    public void addStudent(Student student) {

        String sql = "INSERT INTO stu_data(name,age,course,branch,email) VALUES(?,?,?,?,?)";

        try {
            Connection con = dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getBranch());
            ps.setString(5, student.getEmail());

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("\nStudent Added Successfully.");
            else
                System.out.println("\nFailed to Add Student.");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewStudents() {

        String sql = "SELECT * FROM stu_data";

        try {

            Connection con = dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n==========================================================================");
            System.out.printf("%-5s %-20s %-5s %-12s %-12s %-25s%n",
                    "Roll_no", "NAME", "AGE", "COURSE", "BRANCH", "EMAIL");
            System.out.println("==========================================================================");

            while (rs.next()) {

                System.out.printf("%-5d %-20s %-5d %-12s %-12s %-25s%n",
                        rs.getInt("Roll_no"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getString("branch"),
                        rs.getString("email"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void searchStudent(int id) {

        String sql = "SELECT * FROM stu_data WHERE roll_no=?";

        try {

            Connection con =dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nStudent Found");

                System.out.println("Rollno : " + rs.getInt("roll_no"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Age : " + rs.getInt("age"));
                System.out.println("Course : " + rs.getString("course"));
                System.out.println("Branch : " + rs.getString("branch"));
                System.out.println("Email : " + rs.getString("email"));

            } else {

                System.out.println("\nStudent Not Found.");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateStudent(Student student) {

        String sql = "UPDATE stu_data SET name=?, age=?, course=?, branch=?, email=? WHERE id=?";

        try {

            Connection con = dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getBranch());
            ps.setString(5, student.getEmail());
            ps.setInt(6, student.getRollno());

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("\nStudent Updated Successfully.");
            else
                System.out.println("\nStudent Not Found.");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteStudent(int rollno) {

        String sql = "DELETE FROM stu_data WHERE roll_no=?";

        try {

            Connection con = dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("\nStudent Deleted Successfully.");
            else
                System.out.println("\nStudent Not Found.");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}