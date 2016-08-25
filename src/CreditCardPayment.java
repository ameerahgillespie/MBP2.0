import java.util.Scanner;

public class CreditCardPayment extends Payment {
	private String creditCardNum;
	private String expireDate;
	private String cvv;

	public CreditCardPayment() {

	}

	public CreditCardPayment(String creditCardNum, String expireDate, String cvv) {
		this.creditCardNum = creditCardNum;
		this.expireDate = expireDate;
		this.cvv = cvv;
	}

	public String getCVV() {
		return cvv;
	}

	public void setCVV(String cvv) {
		this.cvv = cvv;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	@Override
	public void processPayment(Scanner scan, double total) {
		System.out.print("Enter credit card number: ");
		creditCardNum = scan.nextLine();
		System.out.print("Enter credit card expiration date: ");
		expireDate = scan.nextLine();
		System.out.print("Enter credit card cvv: ");
		cvv = scan.nextLine();
	}
	
	@Override
	public String toString() {
		String ret = "";
		
		ret += "Credit card number: " + creditCardNum + "\n";
		ret += "Credit card expiration date: " + expireDate + "\n";
		ret += "Credit card cvv " + cvv;
		
		return ret;
	}
}