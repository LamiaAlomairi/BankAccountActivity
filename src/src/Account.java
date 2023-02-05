package src;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Account {
	//have getters/ setters and constructors
	
	Scanner scan = new Scanner(System.in);
	String className;
	int accountNumber;
	String accountHolderName;
	int balance;
	
	//  *****   constructor    *******
	/*public Account(){
		System.out.println("An Account class constructor ");
	}
	*/
	
	//   *****   getters/ setters    *******
	public void setAccountNumber( int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
		return accountNumber;  
    }
    
    
    public void setAccountHolderName( String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName(){
		return accountHolderName;  
    }
    
    
    public void setBalance( int balance){
        this.balance = balance;
    }
    public int getBalance(){
		return balance;  
    }
	
	
	//deposit functionality
	int deposit(int amount) {
		//takes an amount as an argument and adds it to the balance
		try {
			balance = balance + amount;
			System.out.println("Deposit " + amount + " ROM succesfully");
			System.out.println("Balance now: " + balance + " ROM");
			
		}
		catch(Exception e)	{
			System.out.println("Some Error happend ");
		}
		return amount;
	}
	
	int withdraw() {
		//stop the function from withdraw amount is greater than available balance amount-balance
		boolean repeat = true;
		try {
			while(repeat) {
			System.out.println("Enter withdraw amount: ");
			int amount = scan.nextInt();
			try {
				
				if(amount > balance) {
					System.out.println("withdraw was stopped (Balance less than Amount)");
					
				}
				else {
					balance = balance - amount;
					System.out.println("withdraw " + amount + " ROM");
					System.out.println("Balance now: " + balance + " ROM");
					repeat = false;
				}
				try (FileWriter file = new FileWriter("AccountFile.txt");
						PrintWriter writer = new PrintWriter(file)) {
					writer.println("Balance = " + balance);
				} catch (Exception e) {
					e.printStackTrace();
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
		return accountNumber;
		
	}
}
