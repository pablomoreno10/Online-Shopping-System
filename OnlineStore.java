/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

import java.util.ArrayList;

public class OnlineStore {
	
	//ArrayList for products
	ArrayList<Product> inventory = new ArrayList <>();
		
	//ArrayList for users		
	ArrayList<UserShoppingCart> users = new ArrayList<>();
	
	//adds product to the inventory
	public void addToInventory(Product product) {
		inventory.add(product);
		System.out.println("\nProduct added to inventory: " + product);
	}
	
	//registers users and assigns shopping cart
	public void registerUser(UserShoppingCart userFirstName) {
		users.add(userFirstName);
		System.out.println("\nNew user registered: " + userFirstName);
	}
	
	//display all products in inventory
	public void displayProducts() {
		System.out.println("\nInventory: ");
		for (Product products : inventory) {
			System.out.println(products);
		}
	}
	
	//adds product to the shopping cart of a user using the add to cart method
	public void addToCart(UserShoppingCart user, Product product) {
	    if (inventory.contains(product)) {
	        user.addToCart(product);
	    } else {
	        System.out.println("Product not found in inventory.");
	    }
	}

	//displays checkout method of the shopping cart of the user
    public void checkout(UserShoppingCart user) {
        user.checkout();
    }
	
}
