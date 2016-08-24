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
