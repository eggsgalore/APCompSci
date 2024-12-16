/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman first = new Spiderman();
		Spiderman adnrew = new Spiderman("Andrew Garfield", 41, "electro");
		Spiderman tom = new Spiderman("Tom Holland", 28, "the vulture");
		Spiderman tobey = new Spiderman("Tobey Maguire", 49, "green goblin");
		System.out.println("tobeys name is " + tobey.getname());
		System.out.println(adnrew.getname() + "s villain is " + adnrew.getvillain());
		tom.setvillain("everyone");
		System.out.println("Toms villains are " + tom.getvillain());
		tom.fight();
		tom.printArt();

		
	}
}
