/*
 *Author:Val
 *  Date:9/21
 *Collaborator(s):Matthew 
*/

import java.util.Scanner;

	class starter {
		public static void main(String args[]) {
// the string "I love to learn coding remotely." will appear in
// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter what day it is today\nSun = 0 \nMon = 1 \nTues = 2 \nWed = 3 \nThurs = 4 \nFri = 5 \nSat = 6");
		int day = sc.nextInt();
	if(day == 0){
		System.out.print("It is 7:00 AM. Wake up");
	}
	else if(day == 1){
		System.out.print("It is 7:00 AM. Wake up");
	}
	else if(day == 2){
		System.out.print("It is 7:00 AM. Wake up");
	}
	else if(day == 3){
		System.out.print("It is 7:00 AM. Wake up");
	}
	else if(day == 4){
		System.out.print("It is 7:00 AM. Wake up");
	}
	else{
		System.out.print("It is 10:00 AM. Wake up");
	}
	

}
}