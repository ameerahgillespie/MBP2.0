import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class MainApp {

	private static final double salesTax = .06;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		// Ask the user for their name and store it
		System.out.print("Welcome to Grand Circus Computer Center. What is your name? ");
		String name = scan.nextLine();
		System.out.println();

		Inventory inventory = null;

		try {
			inventory = new Inventory();
		} catch (IOException e) {
			System.out.println("Inventory file error");
			System.exit(0);
		}

		String continueOrdering = "y";

		while (continueOrdering.equalsIgnoreCase("y")) {
			Cart cart = null;
			try {
				cart = new Cart();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Hi" + " " + name + "!");
			System.out.println();
			
			//run at least once
			int category = 1;
			while (category != 0) {
				// Present menu to user to choose category or complete purchase
				System.out.println("Please pick a category: ");
				System.out.println("1. Tech");
				System.out.println("2. Hair");
				System.out.println("3. Accessories");
				System.out.println("0. Exit");

				category = scan.nextInt();
				scan.nextLine();

				if (category == 0) {
					break;
				}

				// Present menu to user to choose item by number from chosen
				// category
				System.out.println(inventory);
				cart.addToCart();
			}

			// Show subtotal/sales tax/grand total
			System.out.println();
			BigDecimal subtotal = cart.getCartTotal();
			System.out.println("Subtotal: $" + subtotal);

			BigDecimal salestax = new BigDecimal(subtotal.doubleValue() * salesTax);
			salestax = salestax.setScale(2, BigDecimal.ROUND_HALF_EVEN);
			System.out.println("Sales Tax: $" + salestax);
			
			BigDecimal grandtotal = subtotal.add(salestax);
			System.out.println("Grand Total: $" + grandtotal);
			System.out.println();
			
			// Handle payment
			Payment payment = handlePayment(scan, grandtotal.doubleValue());
			
			// Show receipt
			printReceipt(cart, subtotal, grandtotal, payment);

			System.out.println();
			System.out.print("Would you like to make another order? (y/n) ");
			continueOrdering = scan.nextLine();
			System.out.println();
		}

		System.out.println("Thanks for shopping " + name + ".");
		System.out.println("Goodbye!");
		scan.close();
	}

	public static Payment handlePayment(Scanner scan, double total) {
		System.out.println("Please pick a payment type: ");
		System.out.println("1. Cash");
		System.out.println("2. Check");
		System.out.println("3. Credit");
		int paymentType = scan.nextInt();
		scan.nextLine();

		System.out.println();
		Payment payment;
		if (paymentType == 1)
			payment = new CashPayment();
		else if (paymentType == 2)
			payment = new CheckPayment();
		else
			payment = new CreditCardPayment();

		payment.processPayment(scan, total);
		
		return payment;
	}
	
	public static void printReceipt(Cart cart, BigDecimal subtotal, BigDecimal grandtotal, Payment payment) {
		System.out.println();
		System.out.println("===================================");
		System.out.println("Receipt");
		System.out.println("===================================");
		System.out.println(cart.getCart());
		System.out.println("===================================");
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Grand Total: $" + grandtotal);
		System.out.println("===================================");
		System.out.println("Payment Info");
		System.out.println(payment);
		System.out.println("===================================");
		System.out.println();
	}
}


/*
 * Ask the user for their name and store it
 * 
 * 1) Present menu to user to choose category or complete purchase
 * 
 * 2) Present menu to user to choose item by number from chosen category
 * 
 * 3) Allow the user to choose quantity for the item ordered
 * 
 * 4) Give the user a line total (item price * quantity)
 * 
 * 5) Go back to step 1
 * 
 * When user exists step 4 print subtotal, sales tax and grand total
 * 
 * Ask for payment type (cash, credit, or check)
 * 
 * for cash ask amount tendered and provide change
 * 
 * for check get the check number
 * 
 * for credit get the credit card number, expiration, and cvv
 * 
 * Display receipt with all items ordered, subtotal, grand total and appropriate
 * payment info
 * 
 * Return to step 1 with completely new order or exit
 */
