import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  
        
        int one = 0;
        int two = 0;
        int three = 0;
        int i = 0;
        boolean oneflag=false;
        boolean twoflag = false;
        String word = passwords[0];
        if(word.length()>=8){
            one=one+1;
            oneflag = true;
        }
        if(word.contains("!")||word.contains("@")||word.contains("#")||word.contains("$")||word.contains("%"))
            two = two+1;
            twoflag = true;
        }
        if(oneflag && twoflag){
            three = three+1;
        }
        System.out.println("strength 1" + one);
        System.out.println("strength 2" + two);
        System.out.println("strength 3" + three);

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords

		
	}
}
