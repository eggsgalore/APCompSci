/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] threes = new int[1001];
		 int c = 0;
		 while (c<1001){
		 	int b = c+1;
		 	int a = 3*b;
		 	threes[c]=a;
		 	System.out.println("count " + c + " has the value of " + threes[c]);
		 	c++;
		 }
		 int[] ones = new int[1001];
		 int count = 0;
		 while (count<1001){
		 	int out = 1000-count;
		 	ones[count] = out;
		 	System.out.println("count " + count + " has the value of " + ones[count]);
		 	count++;
		 }
		 
	}
}
