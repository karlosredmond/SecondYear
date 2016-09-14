package Lab5;


	public class ShapeTest
	{
	   public static void main(String args[])
	   {
	     Circle c1, circleRef;

	     Cylinder cyl, cylRef;
	     Cone cone ;
	     Sphere sph ;
	     Square squ ;
	     
	     c1 = new Circle("Circle",5);
	     cyl = new Cylinder("Cylinder",10, 10);
	     cone = new Cone("Cone",15,15) ;
	     sph = new Sphere("Sphere" , 5) ;
	     squ = new Square("Square", 7) ;
	     
	     System.out.println("Circle");
	     System.out.println("------");
	     System.out.println("Circle (c1) radius: " + c1.getRadius());
	     System.out.println("Cylinder");
	     System.out.println("--------");
	     System.out.println("Cylinder (cyl) radius: " + cyl.getRadius());
	     System.out.println("Cylinder (cyl) height: " + cyl.getHeight());
	     System.out.println("Cylinder (cyl) area: " + cyl.area());
	     System.out.println("Cone");
	     System.out.println("------");
	     System.out.println("Cone (cone) radius: " + cone.getRadius());
	     System.out.println("Cone (cone) height: " + cone.getHeight());
	     System.out.println("Cone (cone) area: " + cone.area());
	     System.out.println("Cone (cone) volume: " + cone.volume());
	     System.out.println("Sphere");
	     System.out.println("------");
	     System.out.println("Sphere (sph) radius: " + c1.getRadius());
	     System.out.println("Sphere (sph) area: " + sph.area());
	     System.out.println("Sphere (sph) volume: " + sph.volume());
	     System.out.println("Square");
	     System.out.println("------");
	     System.out.println("Square (squ) length: " + squ.getLength());
	     System.out.println("Square (squ) width: " + squ.getWidth());
	     System.out.println("Square (squ) area: " + squ.area());
	     // Now treat a subclass object as a superclass object
	     // circleRef is a superclass reference to a subclass object
	     //circleRef = cyl;   // assign Cylinder object to circleRef
	     //System.out.println("Cylinder (cyl) radius: " +     circleRef.getRadius());

	     // we can only use the superclass methods on this subclass object
	     // so the following won't work:
	     // System.out.println("Cylinder height (via circleRef) : "  +
	     //	       circleRef.getHeight());

	     // Now cast circleRef to a subclass object. Remeber, circleRef 
	     // is not a reference to a Circle object, but a reference to a 
	     // Cylinder object.
	     // Following won't work:
	     // cylRef = circleRef;
	     // Must use a cast:

	     //cylRef = (Cylinder) circleRef;
	     //System.out.println("Cylinder radius (via cylRef) : " +     cyl.getRadius());
	     //System.out.println("Cylinder height (via cylRef): " + cyl.getHeight());


	     // Attempt to treat a Circle object as a subclass object
	     // Following won't work - this is like saying "all circle objects
	     // are cylinder objects" - but a circle object could also 
	     // be subclassed as a cone etc.

	     //cylRef = (Cylinder) c1;
	     // WRONG! can't treat a superclass object as a subclass object
	     // The above line will throw a ClassCastException
 }

}


