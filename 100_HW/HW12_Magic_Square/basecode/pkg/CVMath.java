package pkg;

public class CVMath {		
    public static int[] findPerfectSquareFactorials(int a) {
        int[] result = new int[a];
        int index = 0; 
        int n = 1; 
        int fact = 1; 

        while (index < a) {
            fact *= n;
            if (isPerfectSquare(fact)) { 
                result[index] = fact;
                index++; 
            n++; 
            }
        }
        return result;
    }
    private static boolean isPerfectSquare(int num) {
        int sqrt = 1; 
        while (sqrt * sqrt <= num) {
            if (sqrt * sqrt == num) {
                return true;
            }
            sqrt++; 
        }
        return false;
    }
}
