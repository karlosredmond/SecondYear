package Lab3a;

public class SavingTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(2000.00) ;
		SavingsAccount saver2 = new SavingsAccount(3000.00) ;

		SavingsAccount.modifyInterestRate(0.04) ;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Savings Balance 1 for first month"+ saver1.getSavingsBalance() ) ;
		System.out.println("Savings Balance 2 for first month"+ saver2.getSavingsBalance() ) ;		SavingsAccount.modifyInterestRate(0.05) ;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Savings Balance 1 for second month"+ saver1.getSavingsBalance() ) ;
		System.out.println("Savings Balance 2 for second month"+ saver2.getSavingsBalance() ) ;		SavingsAccount.modifyInterestRate(0.05) ;
	}

}
