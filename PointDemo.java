/*
 * information about this class.
 */
package hello;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Point p1 = new Point();
			System.out.println(p1);
			
			Point p2 = new Point(130,150);
			System.out.println(p2);
			
			Point p3 = new Point(273);
			System.out.println(p3);
		
			/* 여러값으로 setting 해보기 */
			p1.setX(7);
			p1.setY(88);
			
			p2.setY(1500);
			
			p3.setX(533);
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
	}

}
