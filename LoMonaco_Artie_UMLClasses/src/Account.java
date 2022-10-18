public class Account {
	private long account;
	private String type;
	private double balance;
	private float interestRate;
	
	public Account(long acct, String typ, double bal) {
		account = acct;
		type = typ;
		balance = bal;
		interestRate = 0.0f;
	}

	//setter method
	public void setInterestRate(float i) {
		interestRate = i;
	}
	
	//withdraw
	public boolean withdraw(double amt) {
		if (balance - amt < 0) {
			return false;
		}
		else {
			balance -= amt;
			return true;
		}
	}
	
	//deposit
	public void deposit(double amt) {
		balance += amt;
	}

	//getter methods
	public long getAccount() {
		return account;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}
	
	//interest calculation
	public void calcInterest() {
		balance += (balance * interestRate)/12; 
	}
	
	
}
