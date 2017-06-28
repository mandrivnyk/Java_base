package Lesson_0_10_HW;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> productsInCart = new ArrayList<>(10);	
	double total;
	
	void addProduct(Product product){
		
		if(productsInCart.size() < 10 && !checkExisting(product)){
			
			productsInCart.add(product);
			this.total += product.getPrice();
		}
		else
		{
			System.out.println("You can't add this product to your cart, because the cart is full or dublicated product: "+product.getName()+" "+product.getPrice() );
		}
	}
	
	void removeProduct(String productName){
		for (Product p : productsInCart)
		{
		    if(p.getName().equals(productName)){
		    	System.out.println(" remove: "+p.getName());
		    	productsInCart.remove(p);
		    	this.total -= p.getPrice(); 
		    	break;
		    }
		}
	}
	
	void clearCart(){
		productsInCart.clear();
		total = 0;
	}
	
	void showProducts(){
		String listString ="";
		
		int i=1;
		for (Product s : productsInCart)
		{
		    listString += i+++". "+s.getName()+"\t "+s.getPrice()+"\n";
		}
		System.out.println("--------------------------------");
		System.out.print((listString == null)?"Your cart is empty":listString);
		System.out.println("Total: "+this.total);
		System.out.println("--------------------------------");
	}
	
	boolean checkExisting(Product product){
		for (Product p : productsInCart)
		{
		    if(p.getName().equals(product.getName())){
		    	return true;
		    }
		}
		return false;
	}
	
}
