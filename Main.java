/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

public class Main {
	public static void main(String[] args) {
	    
		// Create an instance of the online store
	    OnlineStore onlineStore = new OnlineStore();
	   
	    // Create product instances
	    ElectronicsProduct laptop = new ElectronicsProduct(152334, "Laptop", "Powerful laptop with high-speed processor", 1200.00, "Dell", "Inspiron", 12);
	    ElectronicsProduct smartphone = new ElectronicsProduct(366321, "Smartphone", "Latest smartphone with advanced features", 899.99, "Samsung", "Galaxy S21", 24);
	    ElectronicsProduct headphones = new ElectronicsProduct(575424, "Headphones", "Premium over-ear headphones", 149.99, "Sony", "WH-1000XM4", 12);
	    ClothingProduct jeans = new ClothingProduct(487945, "Jeans", "Comfortable denim jeans", 39.95, "L", "Denim", "Blue; Black");
	    ClothingProduct tShirt = new ClothingProduct(264843, "T-Shirt", "Casual cotton t-shirt", 20.99, "M", "Cotton", "Red; Blue; Green");

	    // Add products to the inventory
	    onlineStore.addToInventory(laptop);
	    onlineStore.addToInventory(smartphone);
	    onlineStore.addToInventory(headphones);
	    onlineStore.addToInventory(jeans);
	    onlineStore.addToInventory(tShirt);

	    // Display available products
	    onlineStore.displayProducts();

	    // Create user shopping carts and register users
	    UserShoppingCart pablo = new UserShoppingCart();
	    UserShoppingCart valeria = new UserShoppingCart();

	    onlineStore.registerUser(pablo);
	    onlineStore.registerUser(valeria);

	    // Add items to the shopping carts using overloaded methods
	    onlineStore.addToCart(pablo, laptop);  
	    onlineStore.addToCart(pablo, smartphone);  
	    
	    //checkout
	    onlineStore.checkout(pablo);
	    
	    // Add items to the shopping carts using overloaded methods
	    onlineStore.addToCart(valeria, jeans);  
	   
	    //checkout
	    onlineStore.checkout(valeria);
	}
}