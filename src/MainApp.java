import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		// Ask the user for their name and store it
		System.out.print("Welcome to ENTER NAME OF STORE. What is your name? ");
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
			Cart cart = new Cart();
			
			System.out.println("Hi" + " " + name + "!");
			System.out.println();
			
			// 1) Present menu to user to choose category or complete purchase
			System.out.println(inventory);
			System.out.print("Please pick a category: ");
			String category = scan.nextLine();
			
			// 2) Present menu to user to choose item by number from chosen category
			System.out.println(inventory);
			System.out.print("Please pick a product: ");
			int productNumber = scan.nextInt();
//			Product product = 
			
			// 3) Allow the user to choose quantity for the item ordered
			System.out.print("Please enter quantity: ");
			int numItems = scan.nextInt();
			
			// 4) Give the user a line total (item price * quantity)
//			System.out.println("Line total for " + );
			
			
			
			System.out.println("Would you like to make another order? (y/n) ");
			continueOrdering = scan.nextLine();
			
			scan.close();
		}
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
 * When user exists step 4 print subtotal, sales tax and grand tota
 * 
 * 
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
