/*
 *	Author: val Shin
 *  Date: 9/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int y = sc.nextInt();
		if(x%2 == 0){
			System.out.print(x + " is a even integer\n");
		}
		else{
			System.out.print(x + " is a odd integer\n");
		}
		if(y%2 == 0){
			System.out.print(y + " is a even integer\n");
		}
		else{
			
			System.out.print(y + " is a odd integer\n"); 
		}
		
		boolean threex = (x%3 == 0);
		boolean fourx = (x%4 == 0);
		boolean fivex = (x%5 == 0);
		
		if(threex == true){
			System.out.print(x + " is divisible by 3\n");
		}
		if(fourx == true){
			System.out.print(x + " is divisible by 4\n");
		}
		if(fivex == true){
			System.out.print(x + " is divisible by 5\n");
		}
		else{
			System.out.print(x + " is not divisible by 3, 4, and 5\n");
		}
		
		boolean threey = (y%3 == 0);
		boolean foury = (y%4 == 0);
		boolean fivey = (y%5 == 0);
		
		if(threey == true){
			System.out.print(y + " is divisible by 3\n");
		}
		if(foury == true){
			System.out.print(y + " is divisible by 4\n");
		}
		if(fivey == true){
			System.out.print(y + " is divisible by 5\n");
		}
		else{
			System.out.print(y + " is not divisible by 3, 4, and 5\n");
		}
	}	
}
