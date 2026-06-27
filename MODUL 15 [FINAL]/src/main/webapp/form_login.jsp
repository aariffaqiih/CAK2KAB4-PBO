<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <% if (session.getAttribute("username") !=null) { response.sendRedirect(request.getContextPath() + "/viewusers.jsp"
        ); return; } %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Login</title>
        </head>

        <body>
            <h1>Login</h1>

            <% if (request.getAttribute("message") !=null) { %>
                <p>
                    <%= request.getAttribute("message") %>
                </p>
                <% } %>

                    <% if (request.getAttribute("loginError") !=null) { %>
                        <p>
                            <%= request.getAttribute("loginError") %>
                        </p>
                        <% } %>

                            <form method="post" action="<%= request.getContextPath() %>/LoginServlet">
                                <table>
                                    <tr>
                                        <td>Username:</td>
                                        <td><input type="text" name="user" autocomplete="username" required></td>
                                    </tr>
                                    <tr>
                                        <td>Password:</td>
                                        <td><input type="password" name="pass" autocomplete="current-password" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"><input type="submit" value="Login"></td>
                                    </tr>
                                </table>
                            </form>
        </body>

        </html>