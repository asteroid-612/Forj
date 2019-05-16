package hello;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int r, Point c) {// full argument
		super(c);
		radius = r;
	}
	public Circle() {// no argument
		this(0, new Point(0, 0));
	}
	//get, set
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() { 
		return radius;
	}
	public String toString() { // to string
		return (super.toString()+" radius = "+ this.getRadius());
	}
	public double computeArea() { // compute area
		double r = (double) getRadius();
		return r*r*Math.PI;
	}
}
