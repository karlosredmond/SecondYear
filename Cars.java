package Lab5;

public class Cars {
	private String make;
	private String model;
	private double engineSize;
	private String engineType;
	private String regNumber ;
	
	public Cars(String make, String model, double engineSize, String engineType){
		this.setMake(make);
		this.setModel(model);
		this.setEngineSize(engineSize) ;
		this.setEngineType(engineType);
		this.setRegNumber(null) ;
		}
	public Cars(String make, String model, double engineSize, String engineType, String regNumber){
			this.setMake(make);
			this.setModel(model);
			this.setEngineSize(engineSize) ;
			this.setEngineType(engineType);
			this.setRegNumber(regNumber) ;
			}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		
		if(regNumber == null)
			this.regNumber = "N\\A" ;
		else
			this.regNumber = regNumber;
	}
	@Override
	public String toString() {
		return "Car make : " + this.getMake() + ", model : " + this.getModel() + ", engineSize : "
				+ this.getEngineSize() + ", engineType : " + this.getEngineType() + ", regNumber : "
				+ this.getRegNumber();
	}
	

	
	
	
	

}
