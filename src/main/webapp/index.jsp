<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="bootstrap.css">
</head>
<body>
<div style="text-align:center;">
<h4><a href="<%=request.getContextPath()%>/viewAllUsers">View Users</a></h4>
</div>
<br/>
<div style="text-align:center;">
<h1>Register new Customer</h1>

</div>

<h1>==================================================</h1>
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="col-6 ">
				<form action="insert" method="post" class="reg-form mt-3 p-3">
					<div class="form-group">
						<label for="exampleInputEmail1">Name</label> <input type="text"
							class="form-control" placeholder="Enter UserName" name="myName"
							required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Address</label> <input type="text"
							class="form-control" placeholder="Enter UserName" name="address"
							required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter email"
							name="rEmail" required>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">UserName</label> <input
							type="text" class="form-control" placeholder="Enter UserName"
							name="rName" required>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Password" name="rPassword" required>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Confirm Password</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Confirm Password" name="rPasswords" required>
					</div>

					<div class="btn1 text-center">
					 
						<button type="submit" class="btn btn-primary">Submit</button>

					</div>

				</form>



			</div>
		


		</div>

	</div>

</body>
</html>