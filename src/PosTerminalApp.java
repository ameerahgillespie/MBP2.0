
import java.util.Scanner;

public class PosTerminalApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Inventory inventory = new Inventory();

		System.out.println(inventory);
		System.out.println("Please select your item of choice.");

//public class PosTerminalApp {
//	public static void	main(String[] args){
//		System.out.println("Hello! And welcome to the MBP console shopping machine!");
//		System.out.println("Let me fetch our catalogue for you... ");
//		//methods that accomplish things?
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Please select an item: ");
//		String itemSelect = scan.nextLine().toLowerCase();
//		//MORE methods that accomplish things?
		
		
		scan.close();
	}
	
}
