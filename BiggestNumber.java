package Project;

import java.util.Scanner;

public class BiggestNumber {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        String input = sc.nextLine();

	        System.out.println("Digits:");
	        for (int i = 0; i < input.length(); i++) {
	            System.out.println(input.charAt(i));
	        }

	        System.out.println("Biggest digit: " + maximum(input));
	    }
	    public static int maximum(String input) {
	        int max = 0;
	        for (int i = 0; i < input.length(); i++) {
	            int digit = Character.getNumericValue(input.charAt(i));
	            if (digit > max) {
	                max = digit;
	            }
	        }
	        return max;
	    }
	}
