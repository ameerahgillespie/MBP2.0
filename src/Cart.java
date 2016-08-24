<<<<<<< HEAD
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
=======
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;



public class Cart extends Inventory {
	static ArrayList<Product> cart = new ArrayList<Product>();
	public Cart() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Product> addToCart() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the product that you want: ");
		int Mychoice = scan.nextInt();
		cart.add(productList.get(Mychoice - 1));
		System.out.println(cart);

		return cart;
	}

	@Override
	public String toString() {
		String ret = "";

		return ret;
	}

	public static String getCart() {
		StringBuffer myItems = new StringBuffer();
		for (Product items : cart) {
			myItems.append(items.getName() + " " + items.getPrice()).append("\n");

		}
		return myItems.toString();
	

	} 
}
>>>>>>> 1314b4084a7007ce0126fb2c1e20433a8ee137e0
