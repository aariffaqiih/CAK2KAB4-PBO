<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.javatpoint.dao.UserDao"%>
<%@page import="com.javatpoint.bean.User"%>
<%@page import="java.util.*"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>View Users</title>
</head>

<body>

    <h1>Users List</h1>

    <p>
        Login sebagai: ${sessionScope.username} |
        <a href="${pageContext.request.contextPath}/LoginServlet?logout=true">Logout</a>
    </p>

    <%
        List<User> list = UserDao.getAllRecords();
        request.setAttribute("list", list);
    %>

    <table border="1" width="90%">

        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Sex</th>
            <th>Country</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach items="${list}" var="u">

            <tr>

                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.password}</td>
                <td>${u.email}</td>
                <td>${u.sex}</td>
                <td>${u.country}</td>

                <td>
                    <a href="editform.jsp?id=${u.id}">
                        Edit
                    </a>
                </td>

                <td>
                    <a href="deleteuser.jsp?id=${u.id}">
                        Delete
                    </a>
                </td>

            </tr>

        </c:forEach>

    </table>

    <br>

    <a href="adduserform.jsp">
        Add New User
    </a>

</body>
</html>
