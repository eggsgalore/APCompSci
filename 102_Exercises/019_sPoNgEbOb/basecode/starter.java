/*
	Author:
	Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String capitalizedSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 0) {
                String now = (sentence.substring(i,i+1));
                capitalizedSentence = capitalizedSentence + (now.toLowerCase()); // Lowercase even letters
            } else {
                String now = (sentence.substring(i,i+1));
                capitalizedSentence = capitalizedSentence + (now.toUpperCase()); // Uppercase odd letters
            }
        }
        System.out.println(capitalizedSentence);
    }
}