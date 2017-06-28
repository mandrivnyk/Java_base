package Lesson_0_10_HW;

public class Customer {
	Cart cart;
	String name;
	
	Customer(String name, Cart cart){
		this.name = name;
		this.cart = cart;
	}
	
	Customer(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void takeCart(Cart cart){
		if(this.cart == null){
			this.cart = cart;
		} else {
			System.out.println("Customer already have a cart.");
		}
	}
	
	void looseCart(Customer customerReceiver){
		if(this.cart != null && customerReceiver.cart == null ){
			customerReceiver.cart  = this.cart;
			this.cart = null;
		}
	}	
	
	void looseCart(){
		this.cart = null;		
	}	
	
}
