package practice.entities;

import jakarta.persistence.Entity;

@Entity
public class Bottle extends Product {
	private String brand;
	private double bottleCost;
	private double bottleCapacity;

	public Bottle() {
		super();
	}

	public Bottle(String brand, double bottleCost, double bottleCapacity) {
		super();
		this.brand = brand;
		this.bottleCost = bottleCost;
		this.bottleCapacity = bottleCapacity;
	}

	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", bottleCost=" + bottleCost + ", bottleCapacity=" + bottleCapacity + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getBottleCost() {
		return bottleCost;
	}

	public void setBottleCost(double bottleCost) {
		this.bottleCost = bottleCost;
	}

	public double getBottleCapacity() {
		return bottleCapacity;
	}

	public void setBottleCapacity(double bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}
}
