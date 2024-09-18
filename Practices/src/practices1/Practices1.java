package practices1;

import java.util.Scanner;

public class Practices1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2, number3, result;
		
		System.out.print("Enter your First Number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter your Second Number: ");
		number2 = input.nextInt();
		
		System.out.print("Enter your Third Number: ");
		number3 = input.nextInt();

		result = (number1 + number2 + number3) / 3;
		
		System.out.println("The Average is "+ result);
		
		input.close();	
	}
}
