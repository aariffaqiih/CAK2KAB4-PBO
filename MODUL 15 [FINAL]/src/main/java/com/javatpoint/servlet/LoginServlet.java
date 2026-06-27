package com.javatpoint.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (request.getParameter("logout") != null) {
            if (session != null) {
                session.invalidate();
            }
            request.setAttribute("message", "Logout berhasil.");
            request.getRequestDispatcher("/form_login.jsp").forward(request, response);
            return;
        }

        if (session != null && session.getAttribute("username") != null) {
            response.sendRedirect(request.getContextPath() + "/viewusers.jsp");
            return;
        }

        request.getRequestDispatcher("/form_login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("pass");

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            HttpSession oldSession = request.getSession(false);
            if (oldSession != null) {
                oldSession.invalidate();
            }

            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/viewusers.jsp");
            return;
        }

        request.setAttribute("loginError", "Username atau password salah.");
        request.getRequestDispatcher("/form_login.jsp").forward(request, response);
    }
}
