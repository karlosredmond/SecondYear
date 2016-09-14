package Lab5;

public class Trucks extends Cars2 {
	private int lowGears;
	private int highGears;
	private String cargo ;
	
	public Trucks() {
		super(0,0,null,null,0.0,null,null);
		// TODO Auto-generated constructor stub
	}
	public Trucks(int wheels, int passengers,String make,String model,double size,String type,String reg,int hGears,int lGears,String cargo) {
		super(wheels,passengers,make,model,size,type,reg);
		setLowGears(lGears) ;
		setHighGears(hGears) ;
		setCargo(cargo) ;
		// TODO Auto-generated constructor stub
	}
	public int getLowGears() {
		return lowGears;
	}
	public void setLowGears(int lowGears) {
		this.lowGears = lowGears;
	}
	public int getHighGears() {
		return highGears;
	}
	public void setHighGears(int highGears) {
		this.highGears = highGears;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
