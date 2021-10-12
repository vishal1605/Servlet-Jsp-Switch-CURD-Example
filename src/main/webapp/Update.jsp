<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.css">
</head>
<body>
<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="col-6 ">
				<form action="update" method="post" class="reg-form mt-3 p-3">
				
				
					<div class="form-group">
						<input type="hidden" class="form-control" value="${customer.id}" placeholder="Enter UserName" name="myId" required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Name</label> <input type="text"
							class="form-control" value="${customer.name}" placeholder="Enter UserName" name="myName"
							required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Address</label> <input type="text"
							class="form-control" value="${customer.address}" placeholder="Enter UserName" name="address"
							required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter email" value="${customer.email}"
							name="rEmail" required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">UserName</label> <input
							type="text" class="form-control" value="${customer.username}" placeholder="Enter UserName"
							name="rName" required>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Password" value="${customer.password}" name="rPassword" required>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Confirm Password</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Confirm Password" value="${customer.confirmpassword}" name="rPasswords" required>
					</div>

					<div class="btn1 text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
						<button class="btn btn-primary"><a href="viewAllUsers" style="text-decoration:none; color:white;">Cancel</a></button>

					</div>

				</form>



			</div>
		


		</div>

	</div>


</body>
</html>