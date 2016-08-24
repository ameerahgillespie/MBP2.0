
import java.math.BigDecimal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PosTerminalApp {
	public PosTerminalApp() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		Inventory inventory = new Inventory();
	
		//Welcome! Who do I have the pleasure 
		//print inventory
		System.out.println(inventory);
		//We want it to ask the user to pick an item
		System.out.println("Please select your item of choice.");
		//Then we want the user to enter the item they picked
		System.out.println("scanner.nextln");
		//do you want to add? y/n
		System.out.println("Would you like to add an item to your cart?");
		//if n then pull all items picked in shopping cart
		System.out.println("scanner.nextln");
		//get total price 
		System.out.println("get total price");
		//when finished ask payment method from user - cash, check or credit
		System.out.println("cash check or creeeedit?");
		System.out.println("scanner.nextln");
				//if cash pull from cash
		//if check pull from check
		//if credit pull from credit
		
		//vvv pseudo cart for example vvv
	ArrayList<BigDecimal> cart = new ArrayList<BigDecimal>();
		BigDecimal anumber= new BigDecimal (12.00).setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal anotherone = new BigDecimal (8.50).setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal meth = new BigDecimal (0.55).setScale(2, BigDecimal.ROUND_HALF_UP);
		//vvv pseudo cart items for example vvv
		cart.add(anumber);
		cart.add(anotherone);
		cart.add(meth);
		
		//vvv print math totals for the entire array vvv
		System.out.println(Checkout.cartSubtotal(cart));
		System.out.println(Checkout.cartTax(cart));
		System.out.println(Checkout.cartTotal(cart));
		
		// vvv print array contents vvv
		for (BigDecimal number : cart) {
			   System.out.println("Number = " + number);
			   }
			//Payment.paymentType(scanstuffanswer);
		
//		System.out.println(Checkout.cartTotal(cart));
		//Payment.paymentType(scanAnswer); <<<<<DO NOT REMOVE
		
		
		//Tell them their items will arrive in 4-7 business days (more like 7).
		System.out.println("bye felicia.");
		//Tell them thanks for shopping and come again!
	
		
		scan.close();
	}

	
	
}
