/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

import java.util.ArrayList;

public class UserShoppingCart implements ShoppingCart {
    
	ArrayList<Product> shoppingCart = new ArrayList<>(); 

    // Implementation of the interface method
    @Override
	public void addToCart(Product product) {
    	shoppingCart.add(product);
        System.out.println("\n" + product.getName() + " added to the cart.");
    }

    // Overloaded methods for adding products of specific types
    public void addToCart(ClothingProduct product) {
        shoppingCart.add(product);
        System.out.println("\n" + product.getName() + " added to the cart.");
    }

    public void addToCart(ElectronicsProduct product) {
        shoppingCart.add(product);
        System.out.println("\n" + product.getName() + " added to the cart.");
    }

    //checkout method for shopping cart
    
    @Override
    public void checkout() {
        double totalPrice = 0;
        for (Product item : shoppingCart) {
            totalPrice += item.getPrice();    
        }
        System.out.println("\nTotal price of your shopping cart: " + totalPrice);
    }
}
