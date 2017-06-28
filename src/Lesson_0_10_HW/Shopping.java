package Lesson_0_10_HW;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("Petya", new Cart());
		customer1.cart.showProducts();
		customer1.cart.addProduct(new Product("baton", 5));
		customer1.cart.showProducts();
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.showProducts();
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers", 10.5));
		customer1.cart.addProduct(new Product("Snikers3", 10.5));
		customer1.cart.addProduct(new Product("Snikers33", 10.5));
		customer1.cart.showProducts();
		customer1.cart.removeProduct("Snikers");
		customer1.cart.removeProduct("Snikers3");
		customer1.cart.removeProduct("Snikers33");
		customer1.cart.addProduct(new Product("Banana", 30));
		customer1.cart.showProducts();

		Customer customer2 = new Customer("customer2");
		Cart cart = new Cart();
		customer2.takeCart(cart);
		customer2.looseCart();

		

		customer1.looseCart(customer2);
		customer2.cart.showProducts();
		customer2.cart.addProduct(new Product("Moloko", 23));
		customer2.cart.addProduct(new Product("Moloko", 23));
		customer2.cart.showProducts();
		customer2.cart.clearCart();
		customer2.cart.showProducts();
		
		
	}
}
