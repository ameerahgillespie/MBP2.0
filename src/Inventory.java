import java.util.ArrayList;

public class Inventory {

	private ArrayList<Product> products;

	public Inventory() {
		products = new ArrayList<Product>();
		
		for (int x = 1; x < 13; x++) {
		    products.add(new Product("name"+x, "description"+x, "category"+x, x));
		}
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public String toString() {
		String ret = "";

		for (int x = 0; x < products.size(); x++) {
			Product currentProduct = products.get(x);
			String name = currentProduct.getName();

			ret += (x + 1) + ". " + name + "\n";
		}

		return ret;
	}
}