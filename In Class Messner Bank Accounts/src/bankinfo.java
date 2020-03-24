// Name:	Class Example of Classes
// Author:	Brad D Messner
// Date:	March 24, 2020

import java.util.Scanner;

public class bankinfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare our Variables
		Scanner keyboard = new Scanner (System.in);
		double deposit = 0;
		double withdrawal = 0;
		
		// Create a Checking account of BankAccount
		BankAccount checking = new BankAccount();
						// What this creates:
						// checking.name   OR checking.accountNumber
		checking.name = "Brad's Primary Checking";
		checking.accountNumber = 85914;
		checking.type = 'C';
		
		// Create a Savings account
		BankAccount savings = new BankAccount();
		savings.type = 'S';
		BankAccount ibChecking = new BankAccount();
		ibChecking.type = 'I';
		
		
		
		// Lets set the initial balance
		// checking.balance = 200.00;
		// I CANNOT do this because balance is PRIVATE
		checking.addDeposit(200.00);
		System.out.println("Your starting balance is: $" + checking.getBalance());
		
		// Make deposit
		System.out.print("How much would you like to deposit? ");
		deposit = keyboard.nextDouble();
		checking.addDeposit(deposit);
		
		// Make withdrawal
		System.out.print("How much would you like to withdrawal? ");
		withdrawal = keyboard.nextDouble();
		checking.subtractWithdrawal(withdrawal);
		
		// Transfer funds from Checking to Savings
		checking.subtractWithdrawal(50.00);
		savings.addDeposit(50.00);
		
		// Calculate interest
		ibChecking.calcInterest();
		checking.calcInterest();
		savings.calcInterest();
		
		
		// Check Balance
		System.out.println("Your final checking balance is: $" + checking.getBalance());
		System.out.println("Your final savings balance is: $" + savings.getBalance());
		
		

	}

}
