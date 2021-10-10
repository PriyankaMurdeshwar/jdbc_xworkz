package com.xworkz.java.laptop.dao;

public interface LaptopDAO {

	void saveLaptopRecord();

	void updateBrand();

	void updateBrandAndPrice();

	void deleteLaptopByID();

	void readSingleRecordById();

	void readAllRecord();
	
	void readLaptopPriceByID();
	
	void readLaptopBrandByID();
	
	void readLaptopColorSByID();
}
