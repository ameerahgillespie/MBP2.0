import java.util.Scanner;

public abstract class Payment {
	protected double amount;
	protected Scanner scan;

	public Payment() {

	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public abstract void processPayment(Scanner scan, double total);
}