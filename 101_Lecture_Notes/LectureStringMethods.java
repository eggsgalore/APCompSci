/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentence:");
        String word = sc.nextLine();
        int space1 = word.indexOf(" ");
        int space2 = word.indexOf(" ", space1+1);
        System.out.println(word.substring(0,space1));
        System.out.println(word.substring(space1+1, space2));
        
        while(true){
            if(word.indexOf(" ") == -1){
                break;
            }
            int space = word.indexOf(" ");
            System.out.println(word.substring(0,space1));
            word = word.substring(space1+1);
            

        }
	}
}