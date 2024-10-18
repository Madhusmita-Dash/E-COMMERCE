package com.ecommerce.servlet;

import com.ecommerce.dao.RegistrationDao;
import com.ecommerce.model.RegModel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Registration() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Received Data: ");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        if (firstname == null || firstname.trim().isEmpty() ||
                lastname == null || lastname.trim().isEmpty() ||
                email == null || email.trim().isEmpty() ||
                username == null || username.trim().isEmpty() ||
                password == null || password.trim().isEmpty()) {
            response.getWriter().append("All fields are required!");
            return;
        }

        RegModel regModel = new RegModel(firstname, lastname, email, username, password);
        RegistrationDao dao = new RegistrationDao();

        boolean isSaved = dao.saveRegistration(regModel);

        if (isSaved) {
            response.getWriter().append("Registration Successful!");
        } else {
            response.getWriter().append("Registration Failed!");
        }
    }
}