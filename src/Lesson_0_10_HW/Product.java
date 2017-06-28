package Lesson_0_10_HW;

public class Product {
	String name;
	double price;
	
	Product(String name, double price) {
		if ((name == null) || (name.trim().equals(""))) {
		      throw new IllegalArgumentException("Name has no content.");
		}
		
		if (price <= 0.0) {
		      throw new IllegalArgumentException("price should more than 0: " + price);
		}
		 
		this.name = name;
		this.price = price;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

}
