<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/soopers.css" />
<link href='https://fonts.googleapis.com/css?family=Ranga:700' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

<header class="header">Grocery tracker</header>
<form action = "rest/name" method = "get" class="form" name="sooperList">
	<input class= "input" id = "storeName" name="storeName" type ="text" placeholder="Store Name"></input><br>
	<input class= "input" id = "amount" name="amount" type="text" placeholder="Amount Spent"></input><br>
	<input class= "input" id = "numItems" name="numItems" type="text" placeholder="# items" ></input><br>
	<input class= "input" id = "description" name="desc" type="text" placeholder="Describe list of items" ></input><br>
	
<input class="button" type="submit" value="🐷" name="submit"></input><br>

</form>

<table id="table">
</table>
<script src="js/sooper.js"></script>

</body>
</html>
