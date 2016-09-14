package Lab5;

public class Cone extends Cylinder {

	public Cone(String name,double r,double h) {
		super(name,r,h);
		
		// TODO Auto-generated constructor stub
	}
    public double area(){ 
    	return Math.PI * getRadius() * (getRadius()+(Math.sqrt(Math.pow(getRadius(), 2)+ Math.pow(getHeight(),2))));
	  }
    public double volume(){ 
    	return (Math.PI * Math.pow(getRadius(),2) * (getHeight() / 3));
	  }
	@Override
	public String toString() {
		return "Cone";
	}
    
}
