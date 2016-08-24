import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
public class Cart extends Inventory {

	public Cart() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int addToCart(){
		
		
//		boolean finished = true;
//		String shopMore;
//		do{
		//print inventory here	
//		int itemSelect = scan.nextInt();
//		scan.nextLine(); //garbage shoot
		
		ArrayList<Product> cart = new ArrayList<Product>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the product that you want: ");
		int Mychoice = scan.nextInt();
		cart.add(productList.get(Mychoice - 1));
//		System.out.println(cart);
//		BigDecimal item1 = new BigDecimal(15);
//		BigDecimal item2 = new BigDecimal(15);
//		BigDecimal item3 = new BigDecimal(4);
//		BigDecimal item4 = new BigDecimal(11);

//		switch(itemSelect){
//		case 1:
//			cart.add(productList.get(1));
//			
//			System.out.println("Good choice. Anything else? (yes/no)");
//			shopMore = scan.nextLine();
//			
//			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
//				finished = false;
//			}else{
//				finished = true;
//			}
//			break;
//		case 2:
//			cart.add(productList.get(2));
//			
//			System.out.println("Good choice. Anything else? (yes/no)");
//			shopMore = scan.nextLine();
//			
//			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
//				finished = false;
//			}else{
//				finished = true;
//			}
//			break;
//		case 3:
//			cart.add(productList.get(3));
//			
//			System.out.println("Good choice. Anything else? (yes/no)");
//			shopMore = scan.nextLine();
//			
//			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
//				finished = false;
//			}else{
//				finished = true;
//			}
//			break;
//		case 4:
//			cart.add(productList.get(4));
//			System.out.println("Good choice. Anything else? (yes/no)");
//			shopMore = scan.nextLine();
//			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
//				finished = false;
//			}else{
//				finished = true;
//			}
//			break;
//		default:
//			System.out.println("I didn't quite catch that...");
//			finished = false;
//			break;
//		}
//		}while(finished);
		
		return Mychoice;
	}
}
