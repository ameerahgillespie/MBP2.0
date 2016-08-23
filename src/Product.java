<<<<<<< HEAD
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Product {
	String name;
	String description;
	double price;
	String category;
	
	
	public Product(String name, String description, double price, String category) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", category=" + category
				+ "]";
	}
=======

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
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f

	public String getName() {
		return name;
	}

<<<<<<< HEAD

=======
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f
	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD

=======
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f
	public String getDescription() {
		return description;
	}

<<<<<<< HEAD

=======
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f
	public void setDescription(String description) {
		this.description = description;
	}

<<<<<<< HEAD

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


=======
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f
	public String getCategory() {
		return category;
	}

<<<<<<< HEAD

	public void setCategory(String category) {
		this.category = category;
	}
	


	public void fileWriter() throws IOException{
		Scanner scan = new Scanner(System.in);
		File path = new File("producsts");
		int newProducts = scan.nextInt();
		OutputStream outStream = new FileOutputStream(path);
		outStream.write(newProducts);
		outStream.close();
		scan.close();
	}

}
=======
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
>>>>>>> 4c381bc7bd817226dcb61ace1da526472f1f5d3f
