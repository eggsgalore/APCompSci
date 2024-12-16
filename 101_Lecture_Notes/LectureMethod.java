/* 
    Lecture note example - Methods
*/

class LectureMethod{
    

    public static void main(String args[]) { 
        printAnimal();
        greeting("me");
        System.out.print(raiseSalary(10000000.0,50));
	}
	
	public static void printAnimal(){
        System.out.println("       _..---...,''-._     ,/}/)");
        System.out.println("     .''        ,      ``..'(/-<");
        System.out.println("    /   _      {      )         \\");
        System.out.println("   ;   _ `.     `.   (         c(");
        System.out.println(" ,'   ( \\  )      `.  \\ __.._ .: )");
        System.out.println("(  .\\_-) )'-.____...\\  `._   //-'");
        System.out.println(" `. `-' /-._)))      `-._)))");
        System.out.println("   `...' ");
    }
    public static void greeting(String a){
        System.out.println("hello " + a);
    }
    
    public static double raiseSalary(double a, int b){
        double raisedSalary = a + (a*(b/100.0));
        return raisedSalary;
    }
        
}
