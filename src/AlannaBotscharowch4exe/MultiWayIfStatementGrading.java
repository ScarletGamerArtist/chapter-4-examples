package AlannaBotscharowch4exe;
import java.util.Scanner;
/*
 * Alanna botscharow
 * 10/18
 * Multi-way if statements
 */
public class MultiWayIfStatementGrading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt output
			//Input 10 grades
		System.out.println("Enter a grade: ");
			double grade1 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade2 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade3 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade4 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade5 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade6 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade7 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade8 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade9 = input.nextDouble(); 
		System.out.println("Enter a grade: ");
			double grade10 = input.nextDouble(); 
			
			
		
		
		//Add the ten grades.
			double sum =  grade1 +  grade2 +  grade3 +  grade4 +  grade5 +  grade6 +  grade7 +  grade8 +  grade9 +  grade10; 
		
			
		//Calculate averages.
			//Divide the sum by 10
			double avg = sum / 10; 
			
			
		//assign grade
			//output grade and average 
			if (avg>=90) {
				System.out.println("Your grade is A, and your average is "+avg+"%");
			}
			else if (avg>=80) {
				System.out.println("Your grade is B, and your average is "+avg+"%");
			}
			else if (avg>=70) {
				System.out.println("Your grade is C, and your average is "+avg+"%");
			}
			else if (avg>=60) {
				System.out.println("Your grade is D, and your average is "+avg+"%");
			}
			else if (avg>=50) {
				System.out.println("Your grade is F, and your average is "+avg+"%");
			}
			else {
				System.out.println("Something went wrong...");
			}
		
		//end 
		

	}

	

}
