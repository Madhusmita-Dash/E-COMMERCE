package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.ecommerce.model.RegModel;

public class RegistrationDao {
    private static final String URL = "jdbc:mysql://localhost:3306/advancejava";
    private static final String USER = "root";
    private static final String PASSWORD = "biswa083."; // Consider moving this to a config file
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Database Driver not found", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public boolean saveRegistration(RegModel regModel) {
        boolean status = false;
        String query = "INSERT INTO signup (firstname, lastname, email, mobileno, password, confirmpassword) VALUES (?, ?, ?, ?, ?, ?)";

        // Use try-with-resources to ensure resources are closed properly
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
             
            // Set parameters for the PreparedStatement
            ps.setString(1, regModel.getFirstname());
            ps.setString(2, regModel.getLastname());
            ps.setString(3, regModel.getEmail());
            ps.setString(4, regModel.getMobileno());
            ps.setString(5, regModel.getPassword());
            ps.setString(6, regModel.getConfirmpassword());  // Corrected method to get confirm password
            
            // Execute the update and check the result
            status = ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage()); // Print specific error
            e.printStackTrace(); // Log the full stack trace for debugging
        }
        
        return status;
    }
}
