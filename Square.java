package Lab5;

public class Square extends Shape {
	public double length;
	public double width ;
	public Square(String name, double measure) {
		super(name);
		setLength(measure);
		setWidth(measure);
		
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
