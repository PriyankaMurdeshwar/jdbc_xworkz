package com.xworkz.java.laptopdaousingstatic;

import com.xworkz.java.laptop.dao.LaptopDAO;
import com.xworkz.java.laptop.dao.LaptopDAOImpl;

public class LaptopTester1 {

	public static void main(String[] args) {
		
		LaptopDAO1 laptopDAOImpl1 = new LaptopDAOImpl1();
		
//		laptopDAOImpl1.readSingleRecordById();
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.readAllRecord();
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.readLaptopPriceByID();
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.readLaptopColorSByID();
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.readLaptopBrandByID();
//		System.out.println("-----------------------------------------------------------");
		
//		laptopDAOImpl1.saveLaptopRecord(7, "lenovo", "black", 90000);
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.updateBrand("mac");
//		System.out.println("-----------------------------------------------------------");
//		laptopDAOImpl1.updateBrandAndPrice("lenovo", 50000);
//		System.out.println("-----------------------------------------------------------");
//		
//		laptopDAOImpl1.deleteLaptopByID(1);
//		System.out.println("-----------------------------------------------------------");
		
//		laptopDAOImpl1.readLaptopPriceByID(5);
//		System.out.println("-----------------------------------------------------------");
//		
//		laptopDAOImpl1.readSingleRecordById(5);
//		System.out.println("-----------------------------------------------------------");
		
		laptopDAOImpl1.readLaptopBrandByID(5);
		System.out.println("-----------------------------------------------------------");

	}

}
