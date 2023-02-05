package src;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount saveAcount = new SavingsAccount();
		System.out.println();
		saveAcount.setAccountNumber(50);
		saveAcount.setAccountHolderName("Ahmed");
		saveAcount.setBalance(10);
		System.out.println("     Savings Accoun ");
		System.out.println("Account Number:     " + saveAcount.getAccountNumber());
		System.out.println("Acount Holder Name: " + saveAcount.getAccountHolderName());
		System.out.println("Balance:            " + saveAcount.getBalance());
		saveAcount.deposit(11);
		saveAcount.withdraw();
		saveAcount.calculateInterestFunctionality();
		System.out.println("_________________________________ ");
		
		
		CheckingAccount checkAccount = new CheckingAccount();
		System.out.println();
		checkAccount.setAccountNumber(25);
		checkAccount.setAccountHolderName("Salim");
		checkAccount.setBalance(30);
		System.out.println("    Checking Accoun ");
		System.out.println("Account Number:     " + checkAccount.getAccountNumber());
		System.out.println("Acount Holder Name: " + checkAccount.getAccountHolderName());
		System.out.println("Balance:            " + checkAccount.getBalance());
		checkAccount.deposit(15);
		checkAccount.withdraw(500);
		System.out.println("_________________________________ ");
		
		//    ****** Save Data to file  *****
		try (FileWriter file = new FileWriter("AccountFile.txt");
				PrintWriter writer = new PrintWriter(file)) {
			writer.println("Savings Account");
			writer.println("Account Number: " + saveAcount.getAccountNumber());
			writer.println("Account Holder Name: " + saveAcount.getAccountHolderName());
			writer.println("Balance: " + saveAcount.getBalance());
			writer.println();
			
			writer.println("Checking Account");
			writer.println("Account Number: " + checkAccount.getAccountNumber());
			writer.println("Account Holder Name: " + checkAccount.getAccountHolderName());
			writer.println("Balance: " + checkAccount.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
