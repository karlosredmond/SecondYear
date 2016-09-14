package Lab5;

public class Employee1 {
	private int number ;
	private String name ;
	private String address ;
	private String department ;
	private double salary ;
	private String carReg ;
	
	public Employee1() {
	}
	
	public Employee1(int number, String name, String address) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.department = null ;
		this.salary = 0;
		this.carReg = null ;
	}
	public Employee1(int number, String name, String address,String department,double salary,String carReg) {
		
		this.number = number;
		this.name = name;
		this.address = address;
		this.department = department ;
		this.salary = salary;
		this.carReg = carReg ;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLastName() {
		return name;
	}
	public void setLastName(String lastName) {
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
	public String getCarReg() {
		return carReg;
	}
	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}
	public double taxPayable(){
		if(salary >20000)
			return ((salary - 20000) * 0.4) + 20000 * 0.2 ; 
		else
			return salary * 0.2 ;
	}
	
	public String print() {
		return "Employee1 [number=" + number + ", name=" + name + ", address="
				+ address + ", department=" + department + ", salary=" + salary
				+ ", carReg=" + carReg + "]";
	}
}
