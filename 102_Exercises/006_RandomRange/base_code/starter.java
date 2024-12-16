/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number");
		Scanner scanners = new Scanner(System.in);
		System.out.println("Enter your second number, bigger than your first");
		
    	int fir = scanner.nextInt();
    	int sec = scanners.nextInt();


		for (int i =0; i<5; i++) {
		System.out.print((int)(Math.random()*(sec)) + (fir) + "   ");
		
		}

		
	}
}
