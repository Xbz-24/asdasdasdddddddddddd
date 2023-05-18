package com.webapp.servlets;
import com.webapp.dao.UserDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
    private UserDaoImpl userDao = new UserDaoImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("dab_di22232b_52");
        String password = request.getParameter("EZhl18ezcNw3QdyO");
        // check if user is valid and handle accordingly
    }
}