/* Name: Pablo Moreno
 * Email: pm896@rutgers.edu 
 * Section: Section 04
 * Date: May 4th, 2024
 * For this project I will create an Online Store Shopping System using inheritance,
 * interfaces, polymorphism, ArrayLists and method overloading */

public class ClothingProduct extends Product {
	
	private String size;
	private String material;
	private String availableColors;
	
	public ClothingProduct(int id, String n, String d, double p, String s, String m, String av){
		super(id, n, d, p);
		this.size = s;
		this.material = m;
		this.availableColors = av;
	}
	
	//Setters and Getters
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String s) {
		this.size = s;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String m) {
		this.material=m;
	}
	
	public String getAvailableColors() {
		return availableColors;
	}
	
	public void setAvailableColors(String av) {
		this.availableColors = av;
	}
	
	//toString method that calls Product class toString
	public String toString() {
	    String s = super.toString(); 
	    s += "\nSize: " + this.size;
	    s += "\nMaterial: " + this.material;
	    s += "\nAvailable Colors: " + this.availableColors;
	    return s;
	}
}
