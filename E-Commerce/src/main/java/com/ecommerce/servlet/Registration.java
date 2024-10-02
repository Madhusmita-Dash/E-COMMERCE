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
        String mobileno = request.getParameter("mobileno");
        String password= request.getParameter("password");
        String confirmpassword= request.getParameter("confirmpassword");
        
        if (firstname == null || firstname.trim().isEmpty() ||
                lastname == null || lastname.trim().isEmpty() ||
                email == null || email.trim().isEmpty() ||
                mobileno == null || mobileno.trim().isEmpty() ||
                password == null || password.trim().isEmpty() ||
                confirmpassword == null || confirmpassword.trim().isEmpty()) {
                response.getWriter().append("All fields are required!");
                return;
        }
  
        RegModel regModel = new RegModel(firstname,lastname, email,mobileno,password,confirmpassword);
        RegistrationDao dao = new RegistrationDao();
        
        boolean isSaved = dao.saveRegistration(regModel);

        if (isSaved) {
            response.getWriter().append("Registration Successful!");
        } else {
            response.getWriter().append("Registration Failed!");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}