import java.math.BigDecimal;
import java.util.Scanner;

public class CashPayment extends Payment {

	private double cashGiven;
	private double change;
	
	public CashPayment() {

	}

	@Override
	public void processPayment(Scanner scan, double total) {
		System.out.print("Enter amount of cash given: ");
		cashGiven = scan.nextDouble();
		scan.nextLine();

		BigDecimal change = new BigDecimal(cashGiven - total);
		change = change.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.change = change.doubleValue();
		
		System.out.println(changeToString());
	}
	
	public String changeToString() {
		return "Change is $" + change;
	}

	@Override
	public String toString() {
		String ret = "";

		ret += "Amount tendered: " + cashGiven + "\n";
		ret += changeToString();
		
		return ret;
	}
}