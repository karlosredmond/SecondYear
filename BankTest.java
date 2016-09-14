package Lab3a;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomer[] bankArray= new BankCustomer[10] ;
		for(int i =0; i<10;i++){
			
			bankArray[i] = new BankCustomer("Karl","Ramsfort") ;
		}
		for(int i =0; i <10 ; i++){
			System.out.println(bankArray[i].toString()) ;
		}
		BankCustomer bank1 = new BankCustomer("Karl Redmond", "Killybegs, Inch , Gorey") ; // create Bank Customer
		System.out.println(bank1.toString()) ; ////Name and Address of Bank Customer
		bank1.addAccount(500); // add Account 1
		bank1.addAccount(700);// add Account 2
		bank1.addAccount(800);// add Account 3
		System.out.println(bank1.balance()) ;// Print Total Savings
		bank1.summary() ; //Print Summary of Accounts
		
		BankCustomer bank2 = new BankCustomer("Becki McCarthy", "Killybegs, Inch , Gorey") ; // Create Bank Customer
		System.out.println(bank2.toString()) ;//Name and Address of Bank Customer
		bank2.addAccount(200) ;//Add Account 1
		bank2.addAccount(400) ;//Add Account 2
		System.out.println(bank2.balance()) ;//Total Balance to Screen
		bank2.summary() ;// Account Summary
		
		BankCustomer bank3 = new BankCustomer("Jumpin Jack Flash", "The Wild Wild West") ; // Create Bank Customer
		System.out.println(bank3.toString()) ;//Name and Address of Bank Customer
		System.out.println(bank3.balance()) ;//Total Balance of Accounts
		bank3.summary() ;//Summary of Accounts
	}

}
