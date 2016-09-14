package Lab5;

public abstract class Shape {
	private String name;
	
	public Shape(String name){
		this.name = name;
	}
	public void setName(String name){
		 this.name = name;
	}
	public String getName(){
		return name;
	}
	public static void shapeDetails(Shape[] shape){
		
		for(int i = 0; i < shape.length; i++){
			switch(shape[i].getName()){
				case "Circle" :
					Circle cyRef = (Circle) shape[i] ;
				    System.out.println(cyRef.getName());
				    System.out.println("------");
				    System.out.println("Circle (c1) radius: " + cyRef.getRadius());
					break;
				case "Square" :
					Square squRef = (Square) shape[i] ;
					System.out.println() ;
					System.out.println() ;
				    System.out.println(squRef.getName());
				    System.out.println("------");
				    System.out.println("Square (squ) length: " + squRef.getLength());
				    System.out.println("Square (squ) width: " + squRef.getWidth());
				    System.out.println("Square (squ) area: " + squRef.area());
					break;
				case "Sphere" :
					Sphere sphRef = (Sphere) shape[i] ;
					System.out.println() ;System.out.println() ;
				    System.out.println(sphRef.getName());
				    System.out.println("------");
				    System.out.println("Sphere (sph) radius: " + sphRef.getRadius());
				    System.out.println("Sphere (sph) area: " + sphRef.area());
				    System.out.println("Sphere (sph) volume: " + sphRef.volume());
				    break;
				case "Cylinder" :
					Cylinder cylRef = (Cylinder) shape[i] ;
					System.out.println() ;System.out.println() ;
					System.out.println(cylRef.getName());
					System.out.println("--------");
					System.out.println("Cylinder (cyl) radius: " + cylRef.getRadius());
					System.out.println("Cylinder (cyl) height: " + cylRef.getHeight());
					System.out.println("Cylinder (cyl) area: " + cylRef.area());
					break;
				case "Cone" :
					Cone coneRef = (Cone) shape[i] ;
					System.out.println() ;System.out.println() ;
				    System.out.println(coneRef.getName());
				    System.out.println("------");
				    System.out.println("Cone (cone) radius: " + coneRef.getRadius());
				    System.out.println("Cone (cone) height: " + coneRef.getHeight());
				    System.out.println("Cone (cone) area: " + coneRef.area());
				    System.out.println("Cone (cone) volume: " + coneRef.volume());
					break;
					
			}
		}
		
	}
	public abstract double area();
	public abstract double volume();
		
	
}
