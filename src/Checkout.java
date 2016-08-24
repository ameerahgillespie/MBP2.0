import java.math.BigDecimal;
import java.util.ArrayList;

public class Checkout {
public static BigDecimal cartTotal(ArrayList<BigDecimal> num){
	BigDecimal total = new BigDecimal(0);
	for (BigDecimal i: num) {
	    total = total.add(i);
	}
	return total;
}
}
