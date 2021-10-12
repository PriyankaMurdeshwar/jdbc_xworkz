package com.xworkz.java.laptopDAOUsingStatic;

public interface LaptopDAO1 {
	
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
