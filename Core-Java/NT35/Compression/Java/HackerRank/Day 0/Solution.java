import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		//scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
        System.out.println(inputString);      
		
		int j = scan.nextInt();
		double d1 = scan.nextDouble();
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}