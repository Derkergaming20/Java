package calculator;

public class calcu {

	private int operand1;
	private int operand2;
	private char operator;
	private int result;
	
	//Set
	public void setOperand1(int newOperand1) {
		this.operand1 = newOperand1;
	}
	public void setOperator(char newOperator) {
		this.operator = newOperator;
	}
	public void setOperand2(int newOperand2) {
		this.operand2 = newOperand2;
	}

	public void setResult(int newResult) {
		this.result = newResult;
	}
	
	
	//Get
	public int getOperand1() {
		return operand1;
	}public char getOperator() {
		return operator;
	}
	public int getOperand2() {
		return operand2;
	}
	public int getResult() {
		return result;
	}
}
