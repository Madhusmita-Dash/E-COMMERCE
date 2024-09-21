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
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password= request.getParameter("password");

        RegModel regModel = new RegModel(fname,lname, email,username,password);
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
