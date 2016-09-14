package Lab5;

public class ShapeDrive {

	public static void main(String[] args){
		Circle c1 = new Circle("Circle",5);
	    Cylinder cyl = new Cylinder("Cylinder",10, 10);
	    Cone cone = new Cone("Cone",15,15) ;
	    Sphere sph = new Sphere("Sphere" , 5) ;
	    Square squ = new Square("Square", 7) ;
	    Shape[] shapeArray = new Shape[5];
	    Shape[] shapeArray2 = new Shape[5];
	    
	    shapeArray[0] = c1 ;
	    shapeArray[1] = cyl ;
	    shapeArray[2] = cone ;
	    shapeArray[3] = sph ;
	    shapeArray[4] = squ ;
	    
	   // Shape.shapeDetails(shapeArray) ;
	    shapeArray2[0] = c1 ;
	    shapeArray2[1] = cyl ;
	    shapeArray2[2] = cone ;
	    shapeArray2[3] = sph ;
	    shapeArray2[4] = squ ;
	    for(int i = 0 ; i < shapeArray2.length ; i++){
	    System.out.println(shapeArray[i].getName() + " area : " + shapeArray2[i].area() + "\n volume : " + shapeArray2[i].volume()) ;
	 //   for(Shape element : shapeArray2){
	   // 	System.out.println(shapeArray2.area());
	    //}
	    }
	}

}
