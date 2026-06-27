<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect(request.getContextPath() + "/LoginServlet");
    } else {
        response.sendRedirect(request.getContextPath() + "/viewusers.jsp");
    }
%>
