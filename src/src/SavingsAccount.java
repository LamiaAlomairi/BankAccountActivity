package src;
import java.util.*;

public class SavingsAccount extends Account {
	//has additional functionality
	Scanner scan = new Scanner(System.in);
	
	public SavingsAccount() {
		System.out.println("Savings Account Class constructor");
	}
	
	int calculateInterestFunctionality() {
		//calculate interest earned
		try {
			System.out.println("Enter Rate = ");
			int rate = scan.nextInt();
			System.out.println("Enter time: ");
			int time = scan.nextInt();
			
			int interest = balance * rate * time;
			//gives us interest earned
			System.out.println("Interest earned = " + interest + " ROM");
			
		}
		catch(Exception e) {
			System.out.println("Inter valid input");
		}
		return accountNumber;
	}
}
