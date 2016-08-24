import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
public class switchfobrainz {

	public static BigDecimal getCart(int choice){
		Scanner scan = new Scanner(System.in);
		boolean finished = true;
		String shopMore;
		do{
		//print inventory here	
		int itemSelect = scan.nextInt();
		scan.nextLine(); //garbage shoot
		
		ArrayList<BigDecimal> cart = new ArrayList<BigDecimal>();
		
		BigDecimal item1 = new BigDecimal(10);
		BigDecimal item2 = new BigDecimal(15);
		BigDecimal item3 = new BigDecimal(4);
		BigDecimal item4 = new BigDecimal(11);

		switch(itemSelect){
		case 1:
			cart.add(item1);
			
			System.out.println("Good choice. Anything else? (yes/no)");
			shopMore = scan.nextLine();
			
			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
				finished = false;
			}else{
				finished = true;
			}
			break;
		case 2:
			cart.add(item2);
			
			System.out.println("Good choice. Anything else? (yes/no)");
			shopMore = scan.nextLine();
			
			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
				finished = false;
			}else{
				finished = true;
			}
			break;
		case 3:
			cart.add(item3);
			
			System.out.println("Good choice. Anything else? (yes/no)");
			shopMore = scan.nextLine();
			
			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
				finished = false;
			}else{
				finished = true;
			}
			break;
		case 4:
			cart.add(item4);
			System.out.println("Good choice. Anything else? (yes/no)");
			shopMore = scan.nextLine();
			if (shopMore.equalsIgnoreCase("yes")||shopMore.equalsIgnoreCase("y")){
				finished = false;
			}else{
				finished = true;
			}
			break;
		default:
			System.out.println("I didn't quite catch that...");
			finished = false;
			break;
		}
		}while(finished);
		
		return null;
	}
}
