package theStairsProblem;

public class ClimbStairs {
	//private class vars for number of steps in stair and step size
	private int steps, stepsize;
	
	//setter for steps
	public void setSteps(int val) {
		this.steps = val;
	}
	
	//setter for step size
	public void setStepSize(int val) {
		this.stepsize = val;
	}
	
	//method to run the steps solver
	public int climb() {
		//set up array with the steps in the stair
		int[] sz = new int[this.steps+1];
		
		//min answer will always be one step
		sz[0] = 1;
		
		//go through each step and compare to next
		//if equal or greater than the next, increase
		//this step by next step size
		for (int i=1; i<=this.steps; ++i) {
			sz[i]=0;
			for (int j=0; j<=this.stepsize; ++j) {
				if (i - j >= 0) {
					sz[i]+=sz[i-j];
				}
			}
		}
		
		//return the result
		int result = sz[this.steps];
		return result;
	}
	
	public void print() {
		System.out.println("The possible number of combinations is: " + this.climb());
	}
	
	public ClimbStairs(int nsteps, int xstepSize){
		this.setSteps(nsteps);
		this.setStepSize(xstepSize);
	}
	
	public ClimbStairs(){
		this(1, 1);
	}
}
