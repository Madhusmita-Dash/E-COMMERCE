package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.ecommerce.model.RegModel;

public class RegistrationDao {
    private static final String URL = "jdbc:mysql://localhost:3306/mens_kart";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public boolean saveRegistration(RegModel regModel) {
        boolean status = false;
        try (Connection connection = RegistrationDao.getConnection()) {
            String query = "INSERT INTO user_info (fname,lname, email,username,password) VALUES (?, ?, ?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, regModel.getfName());
            ps.setString(2, regModel.getlName());
            ps.setString(3, regModel.getEmail());
            ps.setString(4, regModel.getUsername());
            ps.setString(5, regModel.getPassword());
            status = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
}
