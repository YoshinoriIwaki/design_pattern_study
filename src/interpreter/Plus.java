package interpreter;

public class Plus implements Operator {
	private Operand operand1 = null;
	private Operand operand2 = null;

	public Plus(Operand operand1, Operand operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public Operand execute() {
		return new Ingredient(operand1.getOperandString() + "ど" + operand2.getOperandString() + "を足したもの");
	}
}
