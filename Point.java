/*
 * 이름: 이수정
 * 학번: 20171666
 * lab 1
 * point Class 정의 습득 
 */
package hello;

public class Point {
	/*attribute*/
	private int x;
	private int y;
	
	/*contributors*/
	
	public Point() {
		x = 0;
		y = 0;
	}
    
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int a) {
		this.x = a;
		this.y = a;
	}
	/* set methods */
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	/*get methods */
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	/* toString */
	public String toString() {
		return("(x,y)=("+this.getX()+","+this.getY()+")");
	}
}//end of class.
