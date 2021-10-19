package com.xworkz.java.laptop.using.collection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.java.laptop.util.ConnectionProvider;

public class LaptopDAOImpl3 implements LaptopDAO3{

	public List<LaptopEntity2> readAllRecord() {
		System.out.println("invoked readAllRecord");
		String readAllRecord = "SELECT * FROM laptop";

		List<LaptopEntity2> container = new ArrayList<LaptopEntity2>();

		LaptopEntity2 laptopEntity = null;
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(readAllRecord);

			ResultSet resultSet = preparedStatement.executeQuery(readAllRecord);
			while (resultSet.next()) {

				int id = resultSet.getInt(1);
				String brand = resultSet.getString(2);
				String color = resultSet.getString(3);
				double price = resultSet.getDouble(4);
				int ram = resultSet.getInt(5);
				String processor = resultSet.getString(6);
				boolean isCameraPresent = resultSet.getBoolean(7);
				boolean isGraphicCardPresent = resultSet.getBoolean(8);
				int screeansize = resultSet.getInt(9);
				int weight = resultSet.getInt(10);
				boolean isCdSupported = resultSet.getBoolean(11);

				laptopEntity = new LaptopEntity2(id, brand, color, price, ram, processor, isCameraPresent,
						isGraphicCardPresent, screeansize, weight, isCdSupported);
				container.add(laptopEntity);

			}
		} catch (SQLException sqlException) {
			System.out.println("inside catch block exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		return container;
	}

}
