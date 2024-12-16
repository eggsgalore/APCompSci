/*
 *	Author:  Val Shin
 *  Date: 09-26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name?\n");
		String name = sc.nextLine();
		System.out.print("What is your title?\n");
		String title = sc.nextLine();
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue?\n");
		String x = sc.nextLine();
		if (x.equals("Wizard")||x.equals("wizard")){
			System.out.print("You've chosen the Wizard! Excelsior!\n");
		}
		else if (x.equals("Warrior")||x.equals("warrior")){
			System.out.print("You've chosen the Warrior! For honor!\n");
		}
		else if (x.equals("Rogue")||x.equals("rogue")){
			System.out.print("You've chosen the Rogue! How cunning!\n");
		}
		else{
			System.out.print("That is not a valid choice. Choose again\n");
			x = sc.nextLine();
			if (x.equals("Wizard")){
			System.out.print("You've chosen the Wizard! Excelsior!\n");
			}
			else if (x.equals("Warrior")){
			System.out.print("You've chosen the Warrior! For honor!\n");
			}
			else if (x.equals("Rogue")){
			System.out.print("You've chosen the Rogue! How cunning!\n");
			}
		}
		
		System.out.print("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.\n");
		int points = 20;
		
		System.out.print("Strength (1-10): \n");
		int strength = sc.nextInt();
		if (strength>10){
			System.out.print("Please input smaller value\n");
			strength = sc.nextInt();
		}
		System.out.print("You now have " + (points - strength) + " points remaining\n");
		int totalpoints1 = points - strength;
		
		
		System.out.print("Dexterity (1-10): \n");
		int dexterity = sc.nextInt();
		if (dexterity>10){
			System.out.print("Please input smaller value\n ");
			dexterity = sc.nextInt();
		}
		System.out.print("You now have " + (totalpoints1 - dexterity) + " points remaining\n");
		int totalpoints2 = totalpoints1 - dexterity;
		
		System.out.print("Intelligence (1-10): \n");
		int intelligence = sc.nextInt();
		if (intelligence > totalpoints2){
				System.out.print("You do not have enough points\n");
		}
		else if (intelligence>10){
			System.out.print("Please input smaller value\n");
		}
		else{
			System.out.print("You now have " + (totalpoints2 - intelligence) + " points remaining\n");
		}
		int totalpoints3 = totalpoints2 - intelligence;
		
		System.out.print("Charisma (1-10): \n");
		int charisma = sc.nextInt();
		if (charisma > totalpoints3){
				System.out.print("You do not have enough points\n");
		}
		else if (charisma>10){
			System.out.print("Please input smaller value\n");
		}
		else{
			System.out.print("You now have " + (totalpoints3 - charisma) + " points remaining\n"); 
		}	
		int totalpoints4 = totalpoints3-charisma;
		
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You are a " + x + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.print("Charisma - " + charisma);
		
		
		
	}
}
