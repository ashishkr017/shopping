package com.shopNest.dbHandler;
import java.sql.*;
public class DataInjector {
 public static String Customer(String uname,String mail,String pass,String gender,String address) {
	// String driver="ora";
	 String url="jdbc:mysql://localhost/bank";
	 String user="root";
	 String password="root";
	 
	 String sql="INSERT INTO CUSTOMER VALUES(?,?,?,?,?)";
	 String regStatus="";
	 try {
		 //Class.forName(driver);
		 Connection con=DriverManager.getConnection(url,user,password);
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setString(1,uname);
		 ps.setString(2,mail);
		 ps.setString(3,pass);
		 ps.setString(4,gender);
		 ps.setString(5,address);
		 ps.executeUpdate();
		 regStatus="success";
	 }
	 catch (SQLException e) {
			System.out.println("probel, in adding customer");
			e.printStackTrace();
			regStatus="fail";
		}
	 finally {
		 return regStatus;
	 }
 }
}
