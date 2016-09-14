package Lab5;

public class EmployeeTest {
	public static void main(String[]args){
		Employ[] empArray = new Employ[10] ;
		
		for(int i = 0; i <5; i++){
			empArray[i] = new Employ(Employ.getNumber1(),"Karl","Ramsfort") ;
			empArray[i].setSalary(50000);
		}
		for(int i =5 ; i < 10 ; i++){
			empArray[i] = new Employ(Employ.getNumber1(),"Becki","Killybegs","Sales",20000.00,"04MN2309") ;	
		}
		System.out.println(  empArray[4].getName() + " Salary : " + empArray[4].getSalary() + " tax owed :" + empArray[4].taxPayable());
		System.out.println(  empArray[5].getName() + " Salary : " + empArray[5].getSalary() + " tax owed :" + empArray[5].taxPayable());
		empArray[4].setName("Brendan");
		empArray[4].setAddress("Gorey");
		empArray[4].setNumber(20);
		empArray[4].setDepartment("Stock Management");
		empArray[4].setSalary(150000.00);
		System.out.println(empArray[4].print() + " tax owed : " + empArray[4].taxPayable()) ;
		empArray[4].addCar("Toyota","Corolla", 1.4,"Petrol");
		empArray[4].addCar("Audi","A4", 1.8,"Diesel");
		empArray[4].printCars();
		empArray[1].addCar("Audi","A4", 1.8,"Diesel");
		empArray[1].printCars();
		empArray[1].addCar("Toyota","Avensis", 1.8,"Diesel");
		empArray[1].addCar("Toyota","Avensis", 1.8,"Diesel");
		empArray[1].printCars();
	
	}


	
	
	
	
}
