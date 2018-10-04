package AlannaBotscharowch4exe;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 10/18
 * Calculator
 */

public class IfCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//get 2 numbers from user
		System.out.println("Please enter your first value.");
			double  num1 = input.nextDouble(); 
		System.out.println("Please enter your second value.");
			double num2 = input.nextDouble(); 
			
			//get operator
		System.out.println("Do you want to + - * / or %?");
			String opp = input.next(); 
			
	
		
			double total = 0;
			
		//test input
			if (opp.equals("+")) {
				total = num1 + num2;
			}
		   else if (opp.equals("-")) {
				total = num1 - num2; 
			}
		   else if (opp.equals("*")) {
			   total = num1 * num2;
		   }
		   else if (opp.equals("/")) {
			   total = num1 / num2; 
		   }
		   else if (opp.equals("%")) {
			   total = num1 % num2;
		   }
			//print output
		   else {
			   System.out.println("That wasn't an operator!");
		   }
		   System.out.println("Your total was: "+total);
			
		
		
		

			
			
	}		

}
