package src;
import java.util.*;

public class CheckingAccount extends Account {
	Scanner scan = new Scanner(System.in);
	
	public CheckingAccount() {
		System.out.println("Checking Account Class constructor");
	}
	
	int withdraw() {
		//to allow for overdraft up to a specified limit
		//limit only accessible with it
		System.out.println("Enter number of withraw limit ");
		int limit = scan.nextInt();
		
		//System.out.println("Limit of Checking Account = " + limit);
		
		
		try {
			for(int i = 0; i < limit; i++) {
			System.out.println("Enter withraw amount: ");
			int amount = scan.nextInt();
			try {
				
				if(amount > balance) {
					System.out.println("withdraw was stopped (Balance less than Amount)");
					
				}
				else {
					balance = balance - amount;
					System.out.println("withraw " + amount +" ROM succefully");
					System.out.println("Balance now: " + balance + " ROM");
				}
				
			}
			catch(Exception e) {
				System.out.println("Some Error Happened ");
			}
			}
		}
		catch(Exception e) {
			System.out.println("Enter a valid input ");
		}
		return limit;
		
	}
	
}
