/*
 *Author:  Val Shin
 *  Date:  10/24/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
String role;
int strength;
int dexterity;
int intelligence; 
int constitution;
int charisma; 

public myCharacter(){
role = "wizard";
strength = 5;
dexterity = 5; 
intelligence = 5; 
constitution = 5; 
charisma = 5; 
}

public void printMyCharacter(){
System.out.println("Your role is " + role);
System.out.println("Your strength trait is " + strength);
System.out.println("Your dexterity trait is " + dexterity);
System.out.println("Your intelligence trait is " + intelligence);
System.out.println("Your constitution trait is " + constitution);
System.out.println("Your charisma trait is " + charisma);

}

}
