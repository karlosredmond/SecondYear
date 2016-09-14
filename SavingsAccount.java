package Lab3a;

public class SavingsAccount {
	private static int count = 1  ;
	private static double annualInterestRate ;
	private int accountNo ;
	private double savingsBalance ;

	public SavingsAccount() {
		accountNo = count ;
		count++ ;
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(double savings) {
		accountNo = count ;
		savingsBalance = savings ;
		count++ ;
		// TODO Auto-generated constructor stub
	}
	public static int getCount() {
		return count;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public static void modifyInterestRate(double rate){
		annualInterestRate = rate ;
	}
	@Override
	public String toString() {
		
			return " [accountNo=" + accountNo + ", Balance="
				+ savingsBalance + "]";
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest(){
		this.savingsBalance =  savingsBalance + (savingsBalance * annualInterestRate / 12) ;
	}
}
