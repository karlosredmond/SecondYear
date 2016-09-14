package Sample;

public class Manager {
	private String name;
	private String address;
	private float salary;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String address, float salary) {
		this.name=name;
		this.address = address;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", salary="
				+ salary ;
	}

}
