package calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		calcu calculate = new calcu();
		
		System.out.print("Enter First Number: ");
		calculate.setOperand1(Integer.parseInt(input.next()));
		
		System.out.print("Enter operator (+, -, *, /): ");
		calculate.setOperator(input.next().charAt(0));
		
		System.out.print("Enter Second Number: ");
		calculate.setOperand2(Integer.parseInt(input.next()));
		
		
		char operator = calculate.getOperator();
		int operand1 = calculate.getOperand1();
		int operand2 = calculate.getOperand2();
		int result;
		
		switch (operator) {
		case '+':
			result = operand1 + operand2;
			System.out.println("The Sum is "+ result);
			break;
		case '-':
			result = operand1 - operand2;
			System.out.println("The Difference is "+ result);
			break;
		case '*':
			result = operand1 * operand2;
			System.out.println("The Product is "+ result);
			break;
		case '/':
			if(operand2 != 0) {
				result = operand1 / operand2;
				System.out.println("The Quotient is "+ result);
			}else {
				System.out.println("Error! Divison is Zero!");
			}
			break;
		default:
			System.out.println("Error Operator!");
			break;
		}
		
		input.close();
	}

}
