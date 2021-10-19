package com.xworkz.java.laptop.using.collection;

public class LaptopEntity2 {

	int id;
	String brand;
	String color;
	double price;
	int ram;
	String processor;
	boolean isCameraPresent;
	boolean isGraphicCardPresent;
	int screensize;
	int weight;
	boolean isCdSupported;

	public LaptopEntity2(int id, String brand, String color, double price, int ram, String processor,
			boolean isCameraPresent, boolean isGraphicCardPresent, int screensize, int weight, boolean isCdSupported) {
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.isCameraPresent = isCameraPresent;
		this.isGraphicCardPresent = isGraphicCardPresent;
		this.screensize = screensize;
		this.weight = weight;
		this.isCdSupported = isCdSupported;

	}

	@Override
	public String toString() {
		return "LaptopEntity2 [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", processor=" + processor + ", isCameraPresent=" + isCameraPresent + ", isGraphicCardPresent="
				+ isGraphicCardPresent + ", screensize=" + screensize + ", weight=" + weight + ", isCdSupported="
				+ isCdSupported + ", getId()=" + getId() + ", getBrand()=" + getBrand() + ", getColor()=" + getColor()
				+ ", getPrice()=" + getPrice() + ", getRam()=" + getRam() + ", getProcessor()=" + getProcessor()
				+ ", isCameraPresent()=" + isCameraPresent() + ", isGraphicCardPresent()=" + isGraphicCardPresent()
				+ ", getScreensize()=" + getScreensize() + ", getWeight()=" + getWeight() + ", isCdSupported()="
				+ isCdSupported() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public boolean isCameraPresent() {
		return isCameraPresent;
	}

	public void setCameraPresent(boolean isCameraPresent) {
		this.isCameraPresent = isCameraPresent;
	}

	public boolean isGraphicCardPresent() {
		return isGraphicCardPresent;
	}

	public void setGraphicCardPresent(boolean isGraphicCardPresent) {
		this.isGraphicCardPresent = isGraphicCardPresent;
	}

	public int getScreensize() {
		return screensize;
	}

	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isCdSupported() {
		return isCdSupported;
	}

	public void setCdSupported(boolean isCdSupported) {
		this.isCdSupported = isCdSupported;
	}

}
