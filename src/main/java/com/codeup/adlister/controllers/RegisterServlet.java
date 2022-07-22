package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/users/register.jsp")
                .forward(req, res);
        // TODO: show the registration form
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Users usersDao = DaoFactory.getUsersDao();
        boolean duplicate = usersDao.findByUsername(username) != null;

        if(username.isEmpty() || email.isEmpty() || password.isEmpty() || duplicate){
            res.sendRedirect("/register");
        }else{
            User user = new User(
                    username,
                    email,
                    password
            );
            DaoFactory.getUsersDao().insert(user);
            res.sendRedirect("/login");
        }


        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
    }

}
