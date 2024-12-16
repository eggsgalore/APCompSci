/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Ds = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee Jh = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee Pb = new Employee(2011, "Pam", "Beasly", 2250);
		Employee Ms = new Employee(1234, "RealMichael", "Scott", 100000.0);
		
		Jh.raiseSalary(50);
		Pb.raiseSalary(50);
		
		Ds.employeeToString();
		System.out.print("annual salary is " + Ds.getAnnualSalary());
		Jh.employeeToString();
		System.out.print("annual salary is " + Jh.getAnnualSalary());
		Pb.employeeToString();
		System.out.print("annual salary is " + Pb.getAnnualSalary());
		Ms.employeeToString();
		System.out.print("annual salary is " + Ms.getAnnualSalary());

	}
	
	
}

