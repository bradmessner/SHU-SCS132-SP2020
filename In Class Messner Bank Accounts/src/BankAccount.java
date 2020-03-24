// Class Name:	BankAccount
// Purpose:		Create and store bank account info


public class BankAccount {

	// Declare variables
	public String name;
	private double balance;
	public char type;
	public double interestRate;
	public int accountNumber;
	
	// Build Constructor  (Note: Constructor name is the same as Class Name)
	// Constructor is ENTIRELY optional - you do NOT need constructor
	public BankAccount()
	{
		// Set the initial balance of account
		balance = 0;
		interestRate = .02;
	}
	
	// Deposit funds
	public void addDeposit(double dep) 
	{
		balance = balance + dep;
	}
	
	// Withdrawal funds
	public void subtractWithdrawal(double wit) 
	{
		if (balance < wit)
		{
			System.out.println("You do not have enough funds to withdrawal that amount.");
		}
		else
		{
			balance = balance - wit;
		}
	}
	
	// Check balance
	public double getBalance()
	{
		return balance;
	}
	
	// Calc interest
	public void calcInterest()
	{
		// only calculate interest for S or I accounts
		if (type =='S' || type =='I')
		{
			//double interestAmount;
			//interestAmount = balance * interestRate;
			//balance += interestAmount;
			balance = balance * (1+interestRate);
		}
	}
	
	
}
