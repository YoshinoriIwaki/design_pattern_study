package interpreter;

public class Wait implements Operator {
	private int minutes = -1;
	private Operand operand = null;

	public Wait(int minutes, Operand operand) {
		this.minutes = minutes;
		this.operand = operand;
	}

	public Operand execute() {
		return new Ingredient(operand.getOperandString() + "を" + minutes + "分置いたもの");
	}
}
