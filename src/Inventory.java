import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Inventory extends FileReaderWriter{

	protected static ArrayList<Product> productList;

	public Inventory() throws IOException {
		productList = new ArrayList<Product>();
		try {
			BufferedReader in = new BufferedReader(
									new FileReader(productsFile));
			String line = in.readLine(); //read and discard row header
			 line = in.readLine(); //read the first line
			while(line  != null){
				String[] columns = line.split("\t");
				String name = columns[0];
				String description = columns[1];
				String category = columns[2];
				String price = columns[3];
				Product product = new Product(name, description, category, price);
				product.setName(name);
				product.setDescription(description);
				product.setCategory(category);
				product.setPrice(price);
				productList.add(product);
				line = in.readLine();


			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error \t%s" + e);
		} 
	}

	public static ArrayList<Product> getProducts() {
		return productList;
	}

	public String toString() {
		String formattedString = "";
		for (int x = 0; x < productList.size(); x++) {
			Product currentProduct = productList.get(x);
			String name = currentProduct.getName();
			String Description = currentProduct.getDescription();
			String category = currentProduct.getCategory();
			String price = currentProduct.getPrice();
			formattedString += String.format("%2d. %-25s %-25s %-20s %-20s\n", (x+1), name, Description, category,price);
			
		}

		return formattedString;
	}
}