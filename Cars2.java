package Lab5;

public class Cars2 extends Vehicles {
	private String make;
	private String model;
	private double engineSize;
	private String engineType;
	private String regNumber ;
	public Cars2() {
		super(0,0);
		setMake(null);
		setModel(null);
		setEngineSize(0.0) ;
		setEngineType(null);
		setRegNumber(null);
		// TODO Auto-generated constructor stub
	}

	public Cars2(int wheels, int passengers,String make,String model,double size,String type,String reg) {
		super(wheels, passengers);
		setMake(make);
		setModel(model);
		setEngineSize(size) ;
		setEngineType(type);
		setRegNumber(reg);
		
		// TODO Auto-generated constructor stub
	}
	public String drive() {
		return "Car moves";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = (make != null ? make: "N\\A");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = (model != null ? model : "N\\A");
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = (engineSize != 0.0 ? engineSize : 0);
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = (engineType != null ? engineType : "" );
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = (regNumber != null ? regNumber : "");
	}

}
