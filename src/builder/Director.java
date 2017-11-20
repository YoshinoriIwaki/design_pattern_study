package builder;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void constract() {
		builder.addSoluent(100);
		builder.addSolute(40);
		builder.abandonSolution(70);
		builder.addSoluent(100);
		builder.addSolute(15);
	}
}
