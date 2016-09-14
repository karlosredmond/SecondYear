package Lab5;

public class Employ {
		private int number ;
		private String name ;
		private String address ;
		private String department ;
		private double salary ;
		private Cars carArray[] = new Cars[2];
		private int numCars = 0 ;
		private static int number1 = 0 ;
		
		public Employ() {
		}
		
		public Employ(int number, String name, String address) {
			this.number = number;
			this.name = name;
			this.address = address;
			this.department = null ;
			this.salary = 0;
			number1++ ;
		}
		public int getNumCars() {
			return numCars;
		}

		public void setNumCars(int numCars) {
			this.numCars = numCars;
		}

		public Employ(int number, String name, String address,String department,double salary,String carReg) {
			
			this.number = number;
			this.name = name;
			this.address = address;
			this.department = department ;
			this.salary = salary;
			number1++ ;
		}

		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String lastName) {
			this.name = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double taxPayable(){
			if(salary >20000)
				return ((salary - 20000) * 0.4) + (20000 * 0.2)  ; 
			else
				return (salary * 0.2);
		}
		
		public String print() {
			return "Employee" + this.getNumber()+" [number=" + number + ", name=" + name + ", address="
					+ address + ", department=" + department + ", salary" ; 
		}
		public static int getNumber1() {
			return number1;
		}
		public void addCar(String make, String model, double engineSize, String engineType){
			switch(numCars){
				case 0: case 1:
					getCarArray()[numCars] = new Cars(make,model ,engineSize,engineType) ;
					numCars++ ;
					break;
				default:
					System.out.println("Two Cars given already") ;
					break;
			}
			
		}

		public Cars[] getCarArray() {
			return carArray;
		}

		public void setCarArray(Cars carArray[]) {
			this.carArray = carArray;
		}
		public void printCars(){
			switch(this.getNumCars()){
			case 0 :
				System.out.println(this.getName() + " has no cars") ;
				break;
			case 1:
				System.out.println(this.getName() + " drives a " + this.getCarArray()[0].getMake()) ;
				break;
			case 2:
				System.out.println(this.getName() + " drives a " + this.getCarArray()[0].getMake() + " and a " + this.getCarArray()[1].getMake()) ;
				break;
		}
		}
}

