package com.xworkz.fooodDelivery.entity;

import com.xworkz.fooodDelivery.constants.FooodType;

public class FooodItemEntity {
	String name;
	double price;
	FooodType foodType;
	int quantity;
	double discount;
	
	public FooodItemEntity(){
		System.out.println("created " +this.getClass().getSimpleName());  
	
	}

	public FooodItemEntity(String name, double price, FooodType foodType, int quantity, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FooodItemEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", quantity="
				+ quantity + ", discount=" + discount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FooodItemEntity other = (FooodItemEntity) obj;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (foodType != other.foodType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FooodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FooodType foodType) {
		this.foodType = foodType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	
}
