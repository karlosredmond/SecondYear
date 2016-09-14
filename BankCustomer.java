package Lab3a;

public class BankCustomer {
	


	private String name ;
	private String address;
	private SavingsAccount savings1;
	private SavingsAccount savings2 ;
	private SavingsAccount savings3;
	private int accountAmount = 0  ;
	
	public BankCustomer(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name = name ;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public void addAccount(double savings) {
		if(accountAmount == 0)
		this.savings1 = new SavingsAccount(savings);
		else if(accountAmount == 1)
		this.savings2 = new SavingsAccount(savings);
		else if(accountAmount == 2)
		this.savings3 = new SavingsAccount(savings);
		accountAmount++ ;
	}

	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", address=" + address +  "]";
				
	}

	public String balance(){
		switch(accountAmount){
		case 1:return "Savings total = " + this.savings1.getSavingsBalance() ;
		case 2:return "Savings total = " + (this.savings1.getSavingsBalance() + this.savings2.getSavingsBalance()) ;
		case 3:return "Savings total = " + (this.savings1.getSavingsBalance() + this.savings2.getSavingsBalance() + this.savings3.getSavingsBalance()) ;
		default: return "No Accounts Added" ;
		}
		}

	public void summary(){
		switch(accountAmount){
		case 1: System.out.println(this.savings1.toString()) ;
				break;
		case 2: System.out.println(this.savings1.toString() + this.savings2.toString()) ;
				break;
		case 3: System.out.println(this.savings1.toString() +  this.savings2.toString() + this.savings3.toString()) ;
				break;
		default: System.out.println("No Accounts Added" );
				break;
		}
		}
}



