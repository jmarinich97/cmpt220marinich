package cmpt220;

public class Problem9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Balance: " + account.getBalance() + "\nMonthly Interest: " + account.getMonthlyInterest()
		+ "%\nDate Created: " + account.getDateCreated());
	}

}
