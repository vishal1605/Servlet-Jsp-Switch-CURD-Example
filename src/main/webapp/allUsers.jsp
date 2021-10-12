<%@ page import="java.util.List" %>
<%@ page import="com.crud.Beans.Customers" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%
List<Customers> list=(List<Customers>)session.getAttribute("AllUsers");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.css">
</head>
<body>
<div style="text-align:center;">
<h4><a href="index.jsp">Add New User</a></h4>
</div>
<h1>===========================================================================</h1>
<table class="table">
  <caption>Student details</caption>
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">name</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">UserName</th>
      <th scope="col">password</th>
      <th scope="col">ConfirmPassword</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${AllUsers}" var="s">
    <tr>
      <td><c:out value="${s.id}"></c:out></td>
      <td><c:out value="${s.name}"></c:out></td>
      <td><c:out value="${s.address}"></c:out></td>
      <td><c:out value="${s.email}"></c:out></td>
      <td><c:out value="${s.username}"></c:out></td>
      <td><c:out value="${s.password}"></c:out></td>
      <td><c:out value="${s.confirmpassword}"></c:out></td>
      <td><a href="getUser?id=<c:out value='${s.id }'></c:out>">Edit</a></td>
      <td><a href="delete?Cid=<c:out value='${s.id }'></c:out>">Delete</a></td>
    </tr>
    </c:forEach>
      </tbody>
</table>

<h1>==========================================================================</h1>



</body>
</html>