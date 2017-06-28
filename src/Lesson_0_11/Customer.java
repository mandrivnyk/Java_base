package Lesson_0_11;

public class Customer {
	Cart cart;

	public Cart getCart(){	
		Cart cartTo=cart;
		cart=null;
		return cartTo;
	}
}
