package Lab5;

public class Sphere extends Circle {

	public Sphere(String name, double r) {
		super(name, r);
		// TODO Auto-generated constructor stub
	}
	public double area(){ 
		return 4* Math.PI * Math.pow(getRadius(), 2); }
	public double volume(){ 
	    	return  (Math.PI * Math.pow(getRadius(),3)* 4 / 3 );
		  }
}
