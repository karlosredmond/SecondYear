package Lab5;

public class Circle extends Shape{
	  private double radius;

	  public Circle(String name,double r)
	  {   super(name) ;
		  setRadius(r); }

	  public double getRadius()
	  { return radius; }

	  public void setRadius(double r)
	  { radius = r; }

	  public double area()
	  { return Math.PI * Math.pow(radius, 2); }

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
