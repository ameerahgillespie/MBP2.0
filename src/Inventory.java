import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory extends FileReaderWriter{

	protected static ArrayList<Product> productList;

	public Inventory() throws IOException {
		try {
			BufferedReader in = new BufferedReader(
									new FileReader(productsFile));
			productList = new ArrayList<Product>();
			String line = in.readLine();
			
			while(line != null){
				line = in.readLine();
				Product product = new Product(line);
				productList.add(product);
				System.out.println(line + " this is the array list");


			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error \t%s" + e);
		} 
//		for (Product product: productList) {
//		    productList.add(new Product("name"+ product, "description"+product, "category"+product, 0));
//		    StringBuilder stringBuilder = new StringBuilder();
//			stringBuilder.append(product);
//			stringBuilder.append("This is the array list");
//			System.out.println(product.toString());
//		}
	}

	public static ArrayList<Product> getProducts() {
		return productList;
	}

	public String toString() {
		String ret = "";

		for (int x = 0; x < productList.size(); x++) {
			Product currentProduct = productList.get(x);
			String name = currentProduct.getName();

			ret += (x + 1) + ". " + name + "\n";
		}

		return ret;
	}
}