package com.xworkz.java.laptopusing.entityclassorencapsulation;

import com.xworkz.java.laptop.entity.LaptopEntity;

public class LaptopTester2 {

	public static void main(String args[]) {
		LaptopDAO2 laptopDAO2 = new LaptopDAOImpl2();
		
		LaptopEntity laptopEntity = new LaptopEntity(10,"Apple","White",90000,5,"i5",true,true,12,3,true);
		laptopDAO2.saveLaptopRecord(laptopEntity); 
		
		
	}
}
