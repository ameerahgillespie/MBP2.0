
import java.io.IOException;
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

//		scan.close();
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
	
	public static Double getCartTotal() {
		String cartPrice = "";
		Double totalPrice = (double) 0;
		for (Product items : cart) {
//			items.getPrice(); 
			totalPrice += Double.parseDouble(items.getPrice());
		
			 
		}
//			totalPrice += cartPrice;
		return totalPrice;
	}
}
