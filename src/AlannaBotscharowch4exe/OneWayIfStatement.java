package AlannaBotscharowch4exe;
/*Alanna Botscharow
 * 10/18
 */
import java.util.Scanner;

public class OneWayIfStatement {

	public static void main(String[] args) {
		 
			Scanner input = new Scanner(System.in);
			//1. Enter the radius of a circle
			//constant declarations.
			final double PI = 3.1415926535979323846264338327950288419716939;

			
			double radius;
			double area = 0;
			  
			
			//assign a value to radius
			System.out.println("enter the radius of a circle and press enter: ");
			radius = input.nextDouble();
			
			
			if (radius > 0) {
				area = radius*radius*PI;
			}
			
			System.out.println("after you entered the radius of " 
					+radius + " we have computed the area of your " 
					+ "circle as: "+ area +"\"");
			
			}
			
		}

	

		

	


