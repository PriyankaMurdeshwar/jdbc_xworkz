package com.xworkz.java.laptopdaousingstatic;

public interface LaptopDAO1 {

	void saveLaptopRecord();

	void saveLaptopRecord(int laptopID, String laptopBrand, String laptopColor, double laptopPrice );

	void updateBrand();

	void updateBrand(String laptopBrand);

	void updateBrandAndPrice();

	void updateBrandAndPrice(String laptopBrand, double laptopPrice);

	void deleteLaptopByID();

	void deleteLaptopByID(int laptopID);

	void readSingleRecordById();

	void readSingleRecordById(int laptopID);

	void readAllRecord();

	void readLaptopPriceByID();

	void readLaptopPriceByID(int laptopID);

	void readLaptopBrandByID();

	void readLaptopBrandByID(int laptopID );

	void readLaptopColorSByID();

	void readLaptopColorSByID(int laptopID);


}
