
import java.util.Scanner;

public class PosTerminalApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Inventory inventory = new Inventory();

		System.out.println(inventory);
		System.out.println("Please select your item of choice.");
		
		scan.close();
	}
	
}
