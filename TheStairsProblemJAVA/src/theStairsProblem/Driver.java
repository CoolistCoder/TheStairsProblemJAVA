package theStairsProblem;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please input a value for the number of steps in the stairs: ");
		int numsteps = stdin.nextInt();
		System.out.println();
		System.out.print("Please input how many steps you can take at one time: ");
		int numstepSize = stdin.nextInt();
		System.out.println();
		ClimbStairs climber = new ClimbStairs(numsteps, numstepSize);
		climber.print();
		stdin.close();
	}

}
