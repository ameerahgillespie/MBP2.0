import java.util.Scanner;

public class CheckPayment extends Payment {
	
	private String checkNumber;
	
	public CheckPayment() {
		
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
	public void processPayment(Scanner scan, double total) {
		System.out.print("Enter check number: ");
		checkNumber = scan.nextLine();
	}
	
	@Override
	public String toString() {
		String ret = "";
		
		ret += "Check number: " + checkNumber;
		
		return ret;
	}
}