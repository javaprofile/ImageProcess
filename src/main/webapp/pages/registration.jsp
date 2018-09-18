<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="userForm" action="registerUser" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="userName">Username</form:label>
                        </td>
                        <td>
                            <form:input path="userName" name="userName" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="firstName">FirstName</form:label>
                        </td>
                        <td>
                            <form:input path="firstName" name="firstName" id="firstname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lastName">LastName</form:label>
                        </td>
                        <td>
                            <form:input path="lastName" name="lastName" id="lastname" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="/">Login</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>