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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


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
