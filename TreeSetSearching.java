package Project;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSearching {
	public static void main(String[] args) {
	        TreeSet<String> product = new TreeSet<String>();
	        Scanner sc = new Scanner(System.in);

	        product.add("keyboard");
	        product.add("mouse");
	        product.add("monitor");
	        product.add("cpu");
	        product.add("webcam");

	        System.out.println("Available products: " + product);
	        System.out.print("Enter product to search: ");
	        String input = sc.nextLine();

	        if (product.contains(input)) {
	            System.out.println("Found: " + input);
	        } else {
	            System.out.println("Not found: " + input);
	        }

	        sc.close(); 
	    }
}