package interpreter;

public class Expression implements Operand {
	private Operator operator = null;

	public Expression(Operator operator) {
		this.operator = operator;
	}

	public String getOperandString() {
		return operator.execute().getOperandString();
	}
}
