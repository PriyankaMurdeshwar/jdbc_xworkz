package com.xworkz.java.laptop.using.collection;

import java.util.List;

public class LaptopTester2 {
	public static void main(String[] args) {

		LaptopDAOImpl3 laptopDAOImpl = new LaptopDAOImpl3();
		List<LaptopEntity2> allRecords = laptopDAOImpl.readAllRecord();

		for (LaptopEntity2 laptopEntity : allRecords) {
			System.out.println(laptopEntity + "/t");
			System.out.println();
			System.out.println("------------------------------------------------------");
		}
	}
}
