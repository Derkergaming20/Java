package practices;

import java.util.Scanner;

public class Practices {
	
	public static void main(String[] args) {
		int operand1, operand2, operand3, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a First Number: ");
		operand1 = input.nextInt();
		
		System.out.print("Enter a Second Number: ");
		operand2 = input.nextInt();
		
		System.out.print("Enter a Third Number: ");
		operand3 = input.nextInt();
		
		result = (operand1 + operand2 + operand3) / 3;
		
		System.out.println("The average is: "+ result);

	}
	
}
