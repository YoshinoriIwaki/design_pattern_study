package builder;

public interface Builder {
	public void addSolute(double soluteAmount);
	public void addSoluent(double soluentAmount);
	public void abandonSolution(double solutionAmount);
	public Object getResult();
}

