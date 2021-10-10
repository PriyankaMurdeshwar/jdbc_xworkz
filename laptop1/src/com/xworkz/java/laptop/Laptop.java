package com.xworkz.java.laptop;
import java.sql.*;
//import java sql.Connection;
//import 

public class Laptop {
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";
		
		Connection connection = null;

		String sqlQuery = "INSERT INTO laptopdb.laptop VALUES(1, 'dell','black',35000)";
		String sqlQuery1 = "INSERT INTO laptop VALUES(2,'lenovo','silver',50000)";
		String sqlQuery2 = "INSERT INTO laptop VALUES(3,'HP',' BLACK',40000)";
		String sqlQuery3 = "INSERT INTO laptop values(4,'apple','blue',100000)";

		String updateQuery = "UPDATE laptop set COLOR = 'silver' where ID = 1";

		String deleteQuery = "delete from laptop where id = 2";
		
		String readSingleRecordById = "SELECT * FROM laptop WHERE ID = 1";
		
		String readAllRecord = "SELECT * FROM laptop";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			
//			statement.executeUpdate(sqlQuery);
//			System.out.println("1st row inserted");
//			
//			statement.executeUpdate(sqlQuery1);
//			System.out.println("2nd row inserted");
//			
//			statement.executeUpdate(sqlQuery2);
//			System.out.println("3rd row inserted");
//			
//			statement.executeUpdate(sqlQuery3);
//			System.out.println("4th row inserted");
//			
//			statement.executeUpdate(updateQuery);
//			System.out.println("1st row updated");
//			
//			statement.executeUpdate(deleteQuery);
//			System.out.println("2nd row deleted");
			
//			ResultSet resultSet = statement.executeQuery(readSingleRecordById);
//			by default resultSet is pointing to column so
//			resultSet.next();
//			System.out.println("id"+ resultSet.getInt(1));
//			System.out.println("Brand"+ resultSet.getString(2));
//			System.out.println("Color"+ resultSet.getString(3));
//			System.out.println("Price"+ resultSet.getDouble(4));
			
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			//boolean isRowPresent = resultSet.next();
			//while(isRowPresent)
			while(resultSet.next()) {
				System.out.println("id " + resultSet.getInt(1));
				System.out.println("Brand " + resultSet.getString(2));
				System.out.println("Color " + resultSet.getString(3));
				System.out.println("Price " + resultSet.getDouble(4));

			}
			
		} catch (SQLException sqlException) {
			// TODO Auto-generated catch block
			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		  catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {
			if(connection != null) {
				System.out.println("connection closed");
			}
			else {
				System.out.println("connection is not closed");
			}
			
		}
	}
}