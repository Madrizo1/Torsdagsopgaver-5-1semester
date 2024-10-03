//2a 2b
import java.util.Scanner;

 class main {
public static void main(String [] args){
	Scanner scanner = new Scanner(System.In);
	System.out.println("Please type your name");

	String name = scanner.nextLine();
	System.out.println("Hello" + name +", please type your age");
		int age = scanner.nextInt();
		System.out.println("You are" + age + "years old");
		int retirementAge = 67; 
		int yearsUntilRetirement = retirementAge - age;

		if (yearsUntilRetirement > 0){
			System.out.println("You have " + yearsUntilRetirement + " years until retirement.");
        } else {
            System.out.println("You are already eligible for retirement or past the retirement age.");
        }
        scanner.close();

					}


}




