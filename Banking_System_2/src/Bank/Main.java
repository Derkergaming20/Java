package Bank;


//Create for file handling

//Make this with the Encapsulation, Inheritance, Polymorphism

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int accountnumber = 12345;
		double balance = 100;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your Account Number: ");
		int inputAccountNumber = input.nextInt();
		
		if(inputAccountNumber == accountnumber) {
			System.out.print("Do you want to Withdraw or Deposit? (W/D): ");
			char choice = input.next().charAt(0);
			
			if(choice == 'D' || choice == 'd') {
				System.out.print("Enter Amount to Deposit: ");
				int depositAmount = input.nextInt();
				balance += depositAmount;
			} else if(choice == 'W' || choice == 'w') {
				System.out.print("Enter Amount to Withdraw: ");
				int withdrawAmount = input.nextInt();
				
				if(withdrawAmount <= balance) {
					balance -= withdrawAmount;
					System.out.println("Your New Balance after withdrawal is "+ balance);
				} else {
					System.out.println("Insufficient Funds!");
				}
			} else {
				System.out.println("Invalid Choice. Please Choose W for Withdrawal and D for Deposit!");
			}
		} else {
			System.out.println("Incorrect Account Number!");
		}
		
		//new balance
		System.out.println("Your New Balance is " + balance);

		//interest
		balance *= 0.02;
		System.out.println("You Earned " + balance + " per annum");
		
		input.close();
	}

}
