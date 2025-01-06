/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

public class ElectronicsProduct extends Product {

	private String brand;
	private String model;
	private int warrantyPeriod;
	
	public ElectronicsProduct (int id, String n, String d, double p, String b, String m, int wp) {
		super(id, n, d, p);
		this.brand = b;
		this.model = m;
		this.warrantyPeriod = wp;
	}
	
	//Setters and Getters
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String br) {
		this.brand = br;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String mo) {
		this.model = mo;
	}
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	
	public void setWarrantyPeriod(int wpd) {
		this.warrantyPeriod = wpd;
	}
	
	//toString method that calls Product class toString
	public String toString() {
	    String s = super.toString(); 
	    s += "\nBrand: " + this.brand;
	    s += "\nModel: " + this.model;
	    s += "\nWarranty Period: " + this.warrantyPeriod;
	    return s;
	}
}
