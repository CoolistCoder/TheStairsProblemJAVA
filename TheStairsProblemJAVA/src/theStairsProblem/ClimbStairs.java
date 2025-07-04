package theStairsProblem;

public class ClimbStairs {
	private int steps, stepsize;
	
	public void setSteps(int val) {
		this.steps = val;
	}
	
	public void setStepSize(int val) {
		this.stepsize = val;
	}
	
	public int climb() {
		int[] sz = new int[this.steps+1];
		sz[0] = 1;
		
		for (int i=1; i<=this.steps; ++i) {
			sz[i]=0;
			for (int j=0; j<=this.stepsize; ++j) {
				if (i - j >= 0) {
					sz[i]+=sz[i-j];
				}
			}
		}
		
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
