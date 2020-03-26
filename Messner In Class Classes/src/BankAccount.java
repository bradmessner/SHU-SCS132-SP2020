// Class Header

public class BankAccount {

	// Declare Variables
    private double balance;
    public String name;
    
    // Constructor 
    public BankAccount()
    {
        // This would be your OPENING or STARTING Balance
        balance = 0;
    }
    
    public void setBalance(double bal)
    {
        balance = bal;
    }
    
    public void addDeposit(double dep)
    {
        balance += dep;
    }
    
    public void subtractWithdrawal(double wit)
    {
        balance -= wit;
        // Why can we access balance but not dep from the previous method
    }
    
    public double getBalance()
    {
        return balance;
    }
  
}
