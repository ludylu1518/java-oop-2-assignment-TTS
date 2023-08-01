package com.tts;

public class MobilePhone {
	
	private String brand;
	private String model;
	private String number;
	private int capacity;
	
	public MobilePhone(String brand, String model, String number, int capacity) {
		this.brand = brand;
		this.model = model;
		this.number = number;
		this.capacity = capacity;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}	
	
	public void makeCall(String phone_number) {
		System.out.printf("We are calling %s from our %s %s phone!\n", phone_number, this.brand, this.model);
	}
	
	public void installApp(String app) {
		System.out.printf("Installing %s on our %s %s phone!\n", app, this.brand, this.model);
	}
	
	public void displayInfo() {
		System.out.printf(" Brand: %s\n Model: %s\n Phone Number: %s\n Storage Capacity: %dGB\n", this.brand, this.model, this.number, this.capacity);
	}
	
}
