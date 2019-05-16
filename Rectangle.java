package hello;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int w, int h, Point loc) { // full argument
		super(loc);
		width = w;
		height = h;
	}
	public Rectangle() { // no argument
		this(100, 100, new Point(50, 50));
	}
	// get, set
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public String toString() { // to string
		return (super.toString()+" / Rectangle / height is " +this.getHeight() + 
				" / width is "+ this.getWidth());
	}
	
	public double computeArea() { // compute area
		return ((double)getWidth() * (double)getHeight());
	}
	
}
