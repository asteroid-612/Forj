package nohello;

public abstract class Shape {
	protected Point position;
	// protected 는 private 과 public의 사이로, super 도 sub도 모두 접근 가능하지만
	// 다른 무관한 클래스에서는 접근할 수 잆는 attribute를 만들때 사용한다. 
	//constructor
	public Shape() {
		this(new Point(0, 0));
	}
	public Shape(Point p) {
		this.position = p;
	}
	public void setPosition(Point l) {
		position = l;
	}
	public Point getPosition() {
		return position;
	}
	public String toString() {
		return ("At" + this.getPosition() + "area = " + computeArea());
	}
	
	public abstract double computeArea();
	// abstract method 를 가진 클래스. 이 클래스는 instance를 만들 수 없음. 
	// 상속받은 class들에서 abstract method 를 만들 수 없음. 
}
