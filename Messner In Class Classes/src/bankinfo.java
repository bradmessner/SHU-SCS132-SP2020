// Header
import java.util.Scanner;

public class bankinfo {

	public static void main(String[] args) {
        // Declare your variables
        Scanner keyboard = new Scanner (System.in);
        BankAccount checking = new BankAccount();
        double deposit, withdrawal;
        
        
        // We can't access this way.  Why not?
        // checking.balance = 200.00;
        
        // Set the initial balance
        checking.setBalance(200.00);
        
        //Display the initial balance
        System.out.printf("Your starting balance is: $%,.2f\n", checking.getBalance() );
        
        // Prompt the user to enter deposits and withdrawals
        System.out.print("How much would you like to deposit? ");
        deposit = keyboard.nextDouble();
        System.out.print("How much would you like to withdrawal? ");
        withdrawal = keyboard.nextDouble();
        
        // Update the values in the bank account
        checking.addDeposit(deposit);
        checking.subtractWithdrawal(withdrawal);
        
        // Display final balance
        System.out.printf("Your ending balance is: $%,.2f\n", checking.getBalance() );
        
	}

}
