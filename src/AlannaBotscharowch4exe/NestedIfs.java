package AlannaBotscharowch4exe;
/*Alanna Botscharow
 *10/18
 *Nested if statements
 */
public class NestedIfs {

	public static void main(String[] args) {
		int x = 1; 
		int y = 2;
		int z = 3;
		
		if (x < y) {
			System.out.println("x is less than y");
			if (z > y) {
				System.out.println("z is greater than y");
				if (x > z) {
					System.out.println("X is greater than z");
				}
				else {
					System.out.println("x is less than z");
				}
			}
			else {
				System.out.println("second condition wasn't true");
			}
		}
		else {
			System.out.println("first condition wasn't true");
		}
		
		System.out.println("Program is done");
	}

}
