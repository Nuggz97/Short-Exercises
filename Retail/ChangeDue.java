/**
 * The ChangeDue program implements an application that
 * simply displays the remaining balance due after a transaction.
 *
 * @author  Adam Nguyen
 * @since   2020-10-22 
 */
package myproject;

public class ChangeDue {

	public static void main(String[] args) {
		CalculateChangeDue(5.67);
	}

	/**
	 * Calculating the remaining balance that is due
	 *
	 * @param  total   the remaining balance due
	 * @return 0  
	 */
	public static double CalculateChangeDue(double total) {

		int remainingAccount = (int)(total * 100);

		int numberOfOneToonie = remainingAccount / 200; // Calculating Toonies
		remainingAccount = remainingAccount % 200;
		System.out.println (numberOfOneToonie + " * $2.00");

		int numberOfOneDollars = remainingAccount / 100; // Calculating Loonies
		remainingAccount = remainingAccount % 100;
		System.out.println (numberOfOneDollars + " * $1.00");

		int numberOfOneQuarters = remainingAccount / 25; // Calculating Quarters
		remainingAccount = remainingAccount % 25;
		System.out.println (numberOfOneQuarters + " * $0.25");

		int numberOfOneDimes = remainingAccount / 10; // Calculating Dimes
		remainingAccount = remainingAccount % 10;
		System.out.println (numberOfOneDimes + " * $0.10");

		int numberOfOneNickels = remainingAccount / 5; // Calculating Nickels
		remainingAccount = remainingAccount % 5;
		System.out.println (numberOfOneNickels + " * $0.05");

		double numberOfOnePennies = (double)remainingAccount / 100; // Calculating the remaining balance
		System.out.println ("And $" + numberOfOnePennies + " goes to charity!");

		return 0;
	}
}
