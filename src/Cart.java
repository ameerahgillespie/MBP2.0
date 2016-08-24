import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products;
	private ArrayList<Integer> quantities;
	
	public Cart() {
		products = new ArrayList<Product>();
		quantities = new ArrayList<Integer>();
	}
	
	public void addToCard(Product product, int quantity) {
		products.add(product);
		quantities.add(quantity);
	}
}