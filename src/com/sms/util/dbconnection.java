package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class dbconnection {
    public static final String url="jdbc:mysql://127.0.0.1:3306/student";
    public static final String user="root";
    public static final String password="Your_password";
    public static Connection getConnection() {
        Connection con=null;
        try{
            con=DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e) {

            e.printStackTrace();
        }
        return con;
    }
}