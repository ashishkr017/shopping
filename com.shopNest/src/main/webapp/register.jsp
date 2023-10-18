<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Register</title>
<link rel="stylesheet" type="text/css" herf="style.css">
</head>
<body>
<h2>Register here</h2>
<div class="register">
<form method="post" action="reg">
  <label><b>User name
  </b></label>
  <br>
  <input type="text" name="uname" id="textBox" placeholder="Username">
  <br><br>
  
  <label><b>Email</b></label>
  <br>
  <input type="text" name="mail" id="textBox" placeholder="E mail">
  <br><br>
  <label><b>Password</b></label>
  <br>
  <input type="Password" name="pass" id="textBox" placeholder="Password">
  <br><br>
  
  <label><b>Gender</b></label>
  <br>
  <input type="radio" name="gender" value="male"/>Male
  <input type="radio" name="gender" value="female"/>FeMale
  <input type="radio" name="gender" value="other"/>Other
  <br><br>
  <label><b>Address</b></label>
  <br>
  <textarea rows="2" cols="20" id="textBox"></textarea>
  <br><br>
  <input type="submit" id="sub" value="Register">
  <br><br>
  <a href="login.jsp">Aready register? Sign in instead</a>
</form>
</div>

</body>
</html>