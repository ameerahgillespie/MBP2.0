
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private String category;
    private double price;
    
    public Product(Scanner file) {
        name = file.nextLine();
        description = file.nextLine();
        category = file.nextLine();
        price = Double.parseDouble(file.nextLine());
    }
    
    public Product(String name, String description, String category, double price) {
        this.name = name;   
        this.description = description;
        this.category = category;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    public String toString() {
        String ret = "";
        
        ret += "Name: " + name + "\n";
        ret += "Description: " + description + "\n";
        ret += "Category: " + category + "\n";
        ret += "Price: " + price + "\n";
        
        return ret;
    }
}