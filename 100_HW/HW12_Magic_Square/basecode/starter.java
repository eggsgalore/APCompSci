import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of perfect square factorials to find: ");
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("enter a positive integer.");
        } else {
            int[] perfectSquares = CVMath.findPerfectSquareFactorials(a);
       
            System.out.println("The first " + a + " perfect square factorials are:");
            for (int i = 0; i < perfectSquares.length; i++) {
			   System.out.println(perfectSquares[i]);
			}
        }
	}
}
