package calcute;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        calcu calculate = new calcu();
        
        // Loop for multiple calculations
        for (int i = 0; ; i++) {  // Infinite loop, will break based on user input
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

            if (operator == '+') {
                result = operand1 + operand2;
                System.out.println("The Sum is " + result);
            } else if (operator == '-') {
                result = operand1 - operand2;
                System.out.println("The Difference is " + result);
            } else if (operator == '*') {
                result = operand1 * operand2;
                System.out.println("The Product is " + result);
            } else if (operator == '/') {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("The Quotient is " + result);
                } else {
                    System.out.println("Error! Division by Zero!");
                }
            } else {
                System.out.println("Error: Invalid Operator!");
            }
            
            // Ask if the user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userInput = input.next();
            if (!userInput.equalsIgnoreCase("yes") || !userInput.equalsIgnoreCase("y")) {
                break;  // Exit the loop
            }
        }
        
        input.close();
    }
}

