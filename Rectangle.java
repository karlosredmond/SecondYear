package Lab3a;

public class Rectangle {
	private float length ;
	private float width ;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = ( ( length >= 0.0f && length < 20.0f ) ? length : 1.0f ); 
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = ( ( width >= 0.0f && width < 20.0f ) ? width : 1.0f );
	}

	public Rectangle() {
		
		setWidth(1.0f) ;
		setLength(1.0f) ;
		// TODO Auto-generated constructor stub
	}

	public float perimeter() {
		return length + length + width + width ;
	}
	public float area() {
		return length * width ;
	}

}
