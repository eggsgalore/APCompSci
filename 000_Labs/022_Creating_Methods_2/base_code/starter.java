/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        int base = 2;
        int exponent = 3;
        int result = pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
	}
}
