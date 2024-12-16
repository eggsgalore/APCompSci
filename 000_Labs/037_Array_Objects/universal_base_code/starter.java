/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Wizard [] w = new Wizard[99];
	Warrior [] a = new Warrior[99];
	int i = 0;
	int j = 0;
	while(i < w.length || j < a.length){
		w[i].attack(a[j]);
		if (a[j].isDead()){
			j++;
		} else{
			a[j].attack(w[i]);
			if ( w[i].isDead()){
				i++;
			}
		}
	}
	
	System.out.print("The wizards killed this many warriors : " + j);
	System.out.print("The warriors killed this many wizards : " + i);
	}
}
