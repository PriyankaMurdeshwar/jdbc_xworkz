package com.xworkz.java.laptopDAOUsingStatic;

import com.xworkz.java.laptop.dao.LaptopDAO;
import com.xworkz.java.laptop.dao.LaptopDAOImpl;

public class LaptopTester1 {

	public static void main(String[] args) {
		
		LaptopDAO1 laptopDAOImpl1 = new LaptopDAOImpl1();
		laptopDAOImpl1.readSingleRecordById();
		System.out.println("-----------------------------------------------------------");
		laptopDAOImpl1.readAllRecord();
		System.out.println("-----------------------------------------------------------");
		laptopDAOImpl1.readLaptopPriceByID();
		System.out.println("-----------------------------------------------------------");
		laptopDAOImpl1.readLaptopColorSByID();
		System.out.println("-----------------------------------------------------------");
		laptopDAOImpl1.readLaptopBrandByID();
		System.out.println("-----------------------------------------------------------");

	}

}
