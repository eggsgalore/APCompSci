/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
	public static boolean isLeapYear(int year){
		int four = year%4;
		if(four!=0){
			return false;
		}else{
			return true;
		}
	}
	
	public static int getDigitSum(int number){
		int dig = number%10;
		int digg = (number/10)%10;
		int diggg = (number/100)%10;
		int digggg = (number/1000)%10;
		int diggggg = (number/10000)%10;
		return dig+digg+diggg+digggg+diggggg;
	}
	
	public static boolean IfConsecutive(int one, int two,int three){
		int first = two - one;
		int second = three - two;
		if(first == 1 && second == 1){
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		System.out.print(IfConsecutive(num1, num2, num3));
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
