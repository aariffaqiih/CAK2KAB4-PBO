package com.javatpoint.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {
    "/viewusers.jsp",
    "/adduserform.jsp",
    "/adduser.jsp",
    "/adduser-success.jsp",
    "/adduser-error.jsp",
    "/userform.jsp",
    "/editform.jsp",
    "/edituser.jsp",
    "/deleteuser.jsp"
})
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);

        if (session != null && session.getAttribute("username") != null) {
            chain.doFilter(request, response);
            return;
        }

        httpResponse.sendRedirect(httpRequest.getContextPath() + "/LoginServlet");
    }
}
