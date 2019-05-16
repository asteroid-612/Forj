package hello;

public class ColorCircle extends Circle{
	private String color;
	
	public ColorCircle() { // no argument
		this(0, new Point(0,0),"green");
	}
	public ColorCircle(int r, Point c, String colors) { // full argument
		super(r, c);
		color = colors;
	}
	// get, set
	public void setColor(String g) {
		color = g;
	}
	public String getColor() {
		return color;
	}
	// to string
	public String toString() {
		return (super.toString() + " color is " + this.getColor());
	}
}
