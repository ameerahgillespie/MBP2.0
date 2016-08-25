import java.io.IOException;
import java.util.Scanner;

public class PosTerminalApp extends Cart {
//	private static int paymentType;

	public PosTerminalApp() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void loadInventory(Inventory inventory) {
	}
	//public static void printInventory(){

	 //}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Inventory inventory = new Inventory();

		// load inventory
		loadInventory(inventory);

		int numProducts = Inventory.getProducts().size();
		int[] cart = new int[numProducts];

		Boolean orderIncomplete = true;
		// loop to get customer's order
		do {

			// print inventory

//			String myscan = null;
			do {
				System.out.println(inventory);
				// read a line of text from the user.
				// That gets stored in the String input.
				// Then firstChar is the first character of input converted to
				// uppercase.
				// The idea is to check for E or C
				// so the user can enter numbers for the items
				// or E to empty the cart
				// make shopping cart
				//			System.out.println("Please select your item of choice.");
				// add extra options
				addToCart();
				System.out.println("Would you like to continue shopping? (y/n)");
//				myscan = scan.nextLine();
			} while (scan.nextLine().equalsIgnoreCase("y"));
				System.out.println(getCart());
				System.out.println(getCartTotal());
			//give three options from list (or)
			//
			System.out.println("C to check out. E to empty your cart.");
			String input = scan.nextLine();
			char firstChar = input.charAt(0);
			if (firstChar == ('C')) {
				orderIncomplete = false;
			} else if (firstChar == ('E')) {
				// cart - new int[numProducts];
			} else {
				// make sure the input was a valid number from 1 to numProducts
				int i = Integer.parseInt(input);
				// later, handle if the user enters something that is not an
				// integer and not E or C

				if (i < 1 || i > numProducts) {
					// error message?
				} else {

					// ask how many to add
					System.out.println("How many would you like?");
					int count = Integer.parseInt(scan.nextLine());
					// later, handle if the user enters something that is not
					// valid
					cart[i - 1] += count;
				}
			}
		} while (orderIncomplete);
		// Check out
		// test if there are any items
		Boolean itemsExist = false;
		for (int i = 0; i < numProducts; i++)
			if (cart[i] > 0) {
				itemsExist = true;
			}
		if (itemsExist) {
			// compute and show the pretax total, tax, and total

			// choose the payment type
			System.out.println("(1)Cash (2)Check (3)Credit/Debit?");
//			setPaymentType(Integer.parseInt(scan.nextLine()));

		} else { // no items in cart
			System.out.println("Nothing this time? Have a nice day.");
			scan.close();
		}

	
//		//Welcome! Who do I have the pleasure 
//		
		//pick a category first and give them options from TECH, HAIR, ACCESORIES, etc etc.  - only tech will work
		//print inventory
//		System.out.println(inventory); - tech list will pop up 1-10 list from the inventory class
//		//We want it to ask the user to pick an item by number from the list
		
//		System.out.println("Please select your item of choice."
		
//		
//		System.out.println("scanner.nextln");
//		//do you want to add? y/n
		
//		System.out.println("Would you like to continue shopping? yes or no"); if yes do loop 
//		//if n then pull all items picked in shopping cart and it should list items they have in shopping cart
//		System.out.println("scanner.nextln");
//		//get total price  - get from ben 
//		System.out.println("get total price");
//		//when finished ask payment method from user - cash, check or credit payment
//		System.out.println("cash check or creeeedit?");
//		System.out.println("scanner.nextln");
//				//if cash pull from cash
//		//if check pull from check
//		//if credit pull from credit
		//after payment successful ask if they would like a reciept
		//if y print to console items purchased
//		


			//Payment.paymentType(scanstuffanswer);
		
//		System.out.println(Checkout.cartTotal(cart));
		//Payment.paymentType(scanAnswer); <<<<<DO NOT REMOVE
		
		
		//Tell them their items will arrive in 4-7 business days (more like 7).
//		Checkout.printReceipt(cart);
		System.out.println("bye felicia.");
		//Tell them thanks for shopping and come again!


		

//		switchfobrainz.getCart(3);

		scan.close();

	}
}

//	private static void printInventory() {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static int getPaymentType() {
//		return paymentType;
//	}
//
//	public static void setPaymentType(int paymentType) {
//		PosTerminalApp.paymentType = paymentType;
//	}
//}

// //Welcome! Who do I have the pleasure
// //print inventory
// System.out.println(inventory);
// //We want it to ask the user to pick an item
// System.out.println("Please select your item of choice.");
// //Then we want the user to enter the item they picked
// System.out.println("scanner.nextln");
// //do you want to add? y/n
// System.out.println("Would you like to add an item to your cart?");
// //if n then pull all items picked in shopping cart
// System.out.println("scanner.nextln");
// //get total price
// System.out.println("get total price");
// //when finished ask payment method from user - cash, check or credit
// System.out.println("cash check or creeeedit?");
// System.out.println("scanner.nextln");
// //if cash pull from cash
// //if check pull from check
// //if credit pull from credit
// // Payment.paymentType(scanstuffanswer);
//
//// ArrayList<BigDecimal> cart = new ArrayList<BigDecimal>();
//// BigDecimal anumber= new BigDecimal (12.00).setScale(2,
// BigDecimal.ROUND_HALF_UP);
//// BigDecimal anotherone = new BigDecimal (8.50).setScale(2,
// BigDecimal.ROUND_HALF_UP);
//// BigDecimal meth = new BigDecimal (0.55).setScale(2,
// BigDecimal.ROUND_HALF_UP);
//// cart.add(meth);
//// cart.add(anotherone);
//// cart.add(anumber);
//// System.out.println(Checkout.cartTotal(cart));
//
// //Payment.paymentType(scanstuffanswer);
//
//// System.out.println(Checkout.cartTotal(cart));
// //Payment.paymentType(scanAnswer); <<<<<DO NOT REMOVE
//
//
// //Tell them their items will arrive in 4-7 business days (more like 7).
// System.out.println("bye felicia.");
// //Tell them thanks for shopping and come again!
//
//
// scan.close();
// }
//
//
//
// }
