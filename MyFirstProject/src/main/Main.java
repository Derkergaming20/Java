package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int operand1, operand2, result;
		char operator;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		operand1 = myObj.nextInt();
		
		System.out.print("Enter an Operator (+, -, *, /, %): ");
		operator = myObj.next().charAt(0);
		
		System.out.print("Enter Second Number: ");
		operand2 = myObj.nextInt();
		
		switch(operator) {
		case '+':
			result = operand1 + operand2;
			System.out.println("The sum is " + result);
			break;
		case '-':
			result = operand1 - operand2;
			System.out.println("The difference is " + result);
			break;
		case '*':
			result = operand1 * operand2;
			System.out.println("The product is " + result);
			break;
		case '/':
			 if (operand2 != 0) {
                 result = operand1 / operand2;
                 System.out.println("The quotient is " + result);
             } else {
                 System.out.println("Error: Division by zero.");
             }
             break;
         default:
             System.out.println("Error: Invalid operator.");
             break;
         case '%':
 			result = operand1 % operand2;
 			System.out.println("The modulus is " + result);
 			break;
		}
	}

}
