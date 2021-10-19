package com.xworkz.java.laptopusing.entityclassorencapsulation;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;

import com.xworkz.java.laptop.entity.LaptopEntity;
import com.xworkz.java.laptop.util.ConnectionProvider;

public class LaptopDAOImpl2 implements LaptopDAO2{

	@Override
	public void saveLaptopRecord(LaptopEntity laptopEntity) {
		System.out.println("invoked saveLaptopRecord(LaptopEntity laptopEntity)");
		String insertQuery = "INSERT INTO laptop VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		try{
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement =  connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, laptopEntity.getId());
			preparedStatement.setString(2, laptopEntity.getBrand());
			preparedStatement.setString(3, laptopEntity.getColor());
			preparedStatement.setDouble(4, laptopEntity.getPrice());
			preparedStatement.setInt(5, laptopEntity.getRam());
			preparedStatement.setString(6, laptopEntity.getProcessor());
			preparedStatement.setBoolean(7, laptopEntity.isCameraPresent());
			preparedStatement.setBoolean(8, laptopEntity.isGraphicCardPresent());
			preparedStatement.setInt(9, laptopEntity.getScreensize());
			preparedStatement.setInt(10, laptopEntity.getWeight());
			preparedStatement.setBoolean(11, laptopEntity.isCdSupported());

			preparedStatement.executeUpdate();
			System.out.println("one row is inserted");


		}
		catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();


		}
	}
}
