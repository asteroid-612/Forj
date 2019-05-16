package hello;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle(int w, int h, Point loc) { // full
		super(loc);
		width = w;
		height = h;
	}
	public Triangle() { // no
		this(3,4, new Point(0,0));
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
	// to string
	public String toString() {
		return (super.toString() + " / Triangle / width is = "+ 
				this.getWidth()+ " / height is = "+ this.getHeight());
	}
	// compute area
	public double computeArea() {
		return((double)getWidth() * (double)getHeight() / 2 );
	}
}
