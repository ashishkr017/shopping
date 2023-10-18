package com.shopNest.customer;

import java.io.IOException;
@WebServlet("/log")
public class LoginServlet extends HttpServelt
{
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException{
	String uname=req.getParameter("uname");
	 String pass=req.getParameter("pass");
	 boolean val=Validator.isValid(uname,pass);
	 if(val==true && uname.equals("admin")) {
		 resp.sendRedirect("admin.jsp");
	 }
	 else if(val==true) {
		 resp.sendRedirect("home.jsp");
	 }
	 else {
		 resp.sendRedirect("login.jsp");
	 }
}
}
