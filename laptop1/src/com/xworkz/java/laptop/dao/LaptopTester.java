package com.xworkz.java.laptop.dao;

public class LaptopTester {
	public static void main(String args[]) {

		LaptopDAO laptopDAOImpl = new LaptopDAOImpl();

		laptopDAOImpl.saveLaptopRecord();
		laptopDAOImpl.updateBrand();
		laptopDAOImpl.deleteLaptopByID();
		laptopDAOImpl.readSingleRecordById();
		laptopDAOImpl.readAllRecord();
		laptopDAOImpl.readLaptopPriceByID();
		laptopDAOImpl.readLaptopBrandByID();
		laptopDAOImpl.readLaptopColorSByID();
		laptopDAOImpl.updateBrandAndPrice();

	}

}
