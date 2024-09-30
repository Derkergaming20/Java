package Bank_Info;

public class SavingsAccount extends Savings{
	int interest = 2;
	double appliedInterest, newBalance;
	
	public SavingsAccount() {
        appliedInterest = balance * 0.02;
        newBalance = appliedInterest + balance;
    }
	
	void Interest() {
		System.out.println("Your New Balance is "+ newBalance);
	}

}
