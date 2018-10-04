package AlannaBotscharowch4exe;
import java.util.Scanner;

/*
 * Alanna Botscharow
 * 10/18
 * compute the are of a circle.
 */
		
public class ExampleOne { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//1. Enter the radius of a circle
		//constant declarations.
		final double PI = 3.1415926535979323846264338327950288419716939;

		
		double radius;
		double area;
		 
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble();
		System.out.println(radius);
		
		if (radius < 0) {
			System.out.println("you can't have a - radius ya silly goose!");
		}
		else {
			
		
		//2. Compute the area using the following formula:
		//  area = radius*radius*radius*pi
			area = radius*radius*PI;
		
		//3. Display result
		System.out.println("the area of your circle is:" + area +"\"");
		}
		
	}

}
