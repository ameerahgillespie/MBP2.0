import java.math.BigDecimal;
import java.util.ArrayList;

public class Checkout {
	
	
public static BigDecimal cartSubtotal(ArrayList<BigDecimal> num){
	BigDecimal total = BigDecimal.ZERO;
	for (BigDecimal i: num) {
		total = total.add(i);
	}
	return total;
}

public static BigDecimal cartTax(ArrayList<BigDecimal> num){
	BigDecimal tax = new BigDecimal(.06);
	BigDecimal subTotal = cartSubtotal(num);
	BigDecimal taxAmount = BigDecimal.ZERO;
	taxAmount = subTotal.multiply(tax);
	return taxAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
}

public static BigDecimal cartTotal(ArrayList<BigDecimal> num){
	BigDecimal subTotal = cartSubtotal(num);
	BigDecimal taxAmount = cartTax(num);
	BigDecimal cartTotal = subTotal.add(taxAmount);
	return cartTotal.setScale(2, BigDecimal.ROUND_HALF_UP);
}
public static ArrayList<BigDecimal> removeItem(ArrayList<BigDecimal> array, int arraySpot){
	array.remove(arraySpot);
	return array;
}
public static ArrayList<BigDecimal> printReceipt(ArrayList<BigDecimal> array){
	for (BigDecimal number : array) {
		   System.out.println("This item is: $" + number );
		   }
	System.out.println("And your total is: $" + cartTotal(array));
	return null;
}
}
