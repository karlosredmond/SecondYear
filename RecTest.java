/**
 * 
 */
package Lab3a;

/**
 * @author Karl
 *
 */
public class RecTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter length of Rectange 1 ") ;
		float length = Keyboard.readFloat() ;
		System.out.println("Enter width of Rectange 1 ") ;
		float width = Keyboard.readFloat() ;
		System.out.println(width) ;
		System.out.println(length) ;
		Rectangle rec1 = new Rectangle() ;
		rec1.setLength(length);
		rec1.setWidth(width);
		System.out.println("The length of the rectangle is" + rec1.getLength()) ;
		System.out.println("The width of the rectangle is" + rec1.getWidth()) ;
		System.out.println("The perimeter of the rectangle is" + rec1.perimeter()) ;
		System.out.println("The area of the rectangle is" + rec1.area()) ;
	}

}
