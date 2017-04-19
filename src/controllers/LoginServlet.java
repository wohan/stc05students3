package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 18.04.2017.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
        //dispatcher.forward(req, resp);
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if ("user".equals(login) && "password".equals(password)) { //login/pas может быть null, по этому такая конструкция на проверку что там есть значение
            //хардкорная проверка на заполненность полей
            resp.sendRedirect(req.getContextPath()+"/list");
        } else {
            resp.sendRedirect("/error");
        }
    }
}
