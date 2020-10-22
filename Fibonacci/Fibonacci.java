/**
 * The Fibonacci program implements an application that
 * simply displays the Fibonacci numbers depending on the length of the array.
 *
 * @author  Adam Nguyen
 * @since   2020-10-22 
 */
package myproject;
import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int [] fib = FibonacciSequence(6); // Assigning the function to the array
		System.out.println( Arrays.toString(fib)); // Display all the values in the array			
	}

	/**	
	 * Calculating the numbers and storing it into an array
	 *
	 * @param  max  Length of the array
	 * @return num  Returning the array
	 */	
	public static int[] FibonacciSequence(int max) {
		int[] num = new int[max]; //  Creating a array to hold the Fibonacci values
		int n1 = 0; // Setting n1 initial value to 0
		int n2 = 1; // Setting n2 initial value to 1
		int n3 = 0; // Setting n3 initial value to 0

		num[0] = n1; // Storing n1 value into the first slots of the array 
		num[1] = n2; // Storing n2 value into the second slots of the array 

		for(int i = 2; i < max; i++) { 
			n3= n1 + n2; // Addition calculation
			num[i] = n3; // Adding the next number to the next slot of the array
			n1 = n2; // Assigning n1 to n2
			n2 = n3; // Assigning n2 to n3
		}		 
		return num;
	}	 	
}
