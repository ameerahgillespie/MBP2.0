import java.util.ArrayList;

public class Checkout {
public static double cartTotal(ArrayList<Double> num){
	double total = 0;
	for (Double i: num) {
	    total = total + i;
	}
	return total;
}
}
