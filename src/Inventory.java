import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Inventory extends FileReaderWriter{

//	private static final String FIELD_SEP = "/t";
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
//				System.out.println(name + description + Category + price);
//				System.out.println(line + " this is the array list");


			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error \t%s" + e);
		} 
	}

	public static ArrayList<Product> getProducts() {
		return productList;
	}

	public String toString() {
		String ret = "";

		for (int x = 0; x < productList.size(); x++) {
			Product currentProduct = productList.get(x);
			String name = currentProduct.getName();
			String Description = currentProduct.getDescription();
			String category = currentProduct.getCategory();
			String price = currentProduct.getPrice();
			String formattedString = String.format("%-20s %-20s %-20s %-20s", name, Description, category,price);
			ret += (x + 1);
		}

		return ret;
	}
}