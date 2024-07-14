<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>YOUR TODO</h1>
		<pre>
			<strong style="color: red;">${errorMessage}</strong>
		</pre>
		<form action="" method="post">
			Name: <input type="text" name="userName"> Password: <input
				type="password" name="password"> <input type="submit">
		</form>
	</div>
</body>
</html>