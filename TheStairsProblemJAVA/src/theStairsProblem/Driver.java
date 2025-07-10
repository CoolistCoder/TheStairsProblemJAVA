package theStairsProblem;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//create stdin for user input, then prompt
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please input a value for the number of steps in the stairs: ");
		
		//retrieve user input for the number of steps in the stairs
		int numsteps = stdin.nextInt();
		System.out.println();
		
		//prompt again, then take user input for step size
		System.out.print("Please input how many steps you can take at one time: ");
		int numstepSize = stdin.nextInt();
		System.out.println();
		
		//create the ClimbStairs object, run the print function
		ClimbStairs climber = new ClimbStairs(numsteps, numstepSize);
		climber.print();
		stdin.close();
	}

}
