import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderWriter {
	
	static String fileString = "products.txt";
	static Path productPath = Paths.get(fileString);
	static File productsFile = productPath.toFile();
	public static void fileWriter() {
		Scanner scan = new Scanner(System.in);
		try {
			PrintWriter out;

			do {
				// String dirString = "C:/Users/Topo/Desktop/java/MBP2.0/src";
				out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
				out.println(scan.nextLine());
			} while (scan.nextLine().equalsIgnoreCase("quit"));
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error \t%s" + e);
		} catch (IOException e) {
			System.out.println("Error \t%s" + e);
		}
		scan.close();
	}
	public static void fileReader() {
		ArrayList<Product> productsList = null;
		try {
			String line;
			BufferedReader in = new BufferedReader(
					new FileReader(productsFile));
			do {
				line = in.readLine();
				productsList = new ArrayList<Product>();
				System.out.println(line);
			} while (line != null);
			Product product = new Product(line);
			productsList.add(product);
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
//		for (Product product : productsList ) {
//			System.out.println(product + "this is the arraylist");
//		}
	}
}
