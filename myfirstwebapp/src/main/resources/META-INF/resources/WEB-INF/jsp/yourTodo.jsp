<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add Todo Page</title>
</head>
<body>
	<div class="container">
		<h1>Enter Todo Details:</h1>
		<form method="post">
			Description : <input type="text" name="description"/>
			Target Date : <input type="date" name="targetDate"/>
			<input type="submit" class="btn btn-success"/>
		</form>
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>