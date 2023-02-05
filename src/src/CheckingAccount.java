package src;
import java.util.*;

public class CheckingAccount extends Account {
	Scanner scan = new Scanner(System.in);
	
	public CheckingAccount() {
		System.out.println("Checking Account Class constructor");
	}
	
	int withdraw(int limit) {
		//to allow for overdraft up to a specified limit
		//limit only accessible with it
		boolean repeat = true;
		while(repeat) {
			try {
				System.out.println("Enter withraw amount: ");
				int amount = scan.nextInt();
				if(amount >limit) {
					System.out.println("withraw amount should be less than "+limit+" ROM ");
				}
				else {
					try {
						
						if(amount > balance) {
							System.out.println("withdraw was stopped (Balance less than Amount)");
							
						}
						else {
							balance = balance - amount;
							System.out.println("withraw " + amount +" ROM succefully");
							System.out.println("Balance now: " + balance + " ROM");
							repeat = false;
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
		}
		
		return limit;
		
	}
	
}
