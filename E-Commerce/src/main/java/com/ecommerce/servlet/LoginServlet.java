package com.ecommerce.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mens_kart";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isValidUser = false;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user_info WHERE username = ? AND password = ?")) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    isValidUser = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (isValidUser) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}