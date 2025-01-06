/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

public class Product {

	private int productID;
	private String name;
	private String description;
	private double price;
	
	public Product(int id, String n, String d, double p){
		this.productID=id;
		this.name=n;
		this.description=d;
		this.price=p;
	}

	//Setters and Getters
	
	public void setID(int newId) {
		this.productID = newId;
	}
	public int getID() {
		return productID;
	}
	
	public void setName(String newName) {
		this.name= newName;
	}
	public String getName() {
		return name;
	}
	
	public void setDescription(String newDesc) {
		this.description = newDesc;
	}
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	public double getPrice() {
		return price;
	}
	
	//To String Method
	
	public String toString() {
	    String s = "\nProduct ID: " + this.productID;
	    s += "\nName: " + this.name;
	    s += "\nDescription: " + this.description;
	    s += "\nPrice: " + this.price;
	    return s;
	}
}
