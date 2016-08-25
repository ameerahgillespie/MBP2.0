
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
		
		System.out.println(productList.get(Mychoice - 1));

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
	
	public static BigDecimal getCartTotal() {
		Double totalPrice = 0.0;
		
		for (Product items : cart) {
//			if(items.getName().equals(items.getName())){
//				String sum = items.getPrice() + items.getPrice();
//				System.out.println(sum);
//			}
			totalPrice += Double.parseDouble(items.getPrice());
			 
		}
		 String StringTotalPrice = Double.toString(totalPrice);
		 BigDecimal bdTotalPrice = new BigDecimal(StringTotalPrice);
		 bdTotalPrice = bdTotalPrice.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return bdTotalPrice;
	}
}
