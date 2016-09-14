package Lab5;

public class Cylinder extends Circle
{
  private double height;

  public Cylinder(String name,double r, double h)
  { 
    super(name,r); 
    setHeight(h);
  }

  public void setHeight(double h)
  { height = h; }

  public double getHeight()
  { return height; }

  public double area()
  { return 2 * super.area() + 
       2 * Math.PI * getRadius() * height; }
  public double volume()
  { return Math.PI * Math.pow( getRadius(), 2 ) * getHeight();}
}
