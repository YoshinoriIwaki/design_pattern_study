package interpreter;

public interface Operand {
	public String getOperandString();
}

public class Ingredient implements Operand() {
	private String operandString = null;

	public Ingredient(String operandString) {
		this.operandString = operandString;
	}

	public String getOperandString() {
		return this.operandString;
	}
}
