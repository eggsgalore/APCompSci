/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int total = 0;
		int num = 0;
		
		while(num!=5){
			Scanner myObj = new Scanner(System.in);
			System.out.println("give me a score");
			String nu = myObj.next();
			int number = Integer.valueOf(nu);
			total = total+number;
			num = num+1;
		}
	System.out.print("the average is around " + total/num);
    }
}
