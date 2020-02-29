<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/29/2020
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login Form</title>
  </head>
  <body>
  <form action="/login">
    <table>
      <tr>
        <td>Username</td>
        <td><input type="text" name="user" placeholder="username"></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="password" name="pass" placeholder="password"></td>
      </tr>
      <tr>
        <td><input type="submit" value="Submit"></td>
        <td><input type="reset" value="Reset"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
