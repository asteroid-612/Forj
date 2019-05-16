package nohello;
// complete
public abstract class Person {
	String personName;
	int age;
	static int totalPersonNumber = 0; // 전체 명수 세어주는 static 변수 
	// constructor
	public Person() {
		this("A",20);
		totalPersonNumber ++; // increment
	}
	public Person(String a) {
		personName = a;
		age = 20;
	}
	public Person(int b) {
		age = b;
		personName = "Ga";
	}
	public Person(String a, int b) {
		personName = a;
		age = b;
		totalPersonNumber ++; // increment
	}
	// set method 
	public void setName(String a) {
		personName = a;
	}
	public void setAge(int b) {
		age = b;
	}
	// get method
	public String getName() {
		return personName;
	}
	public int getAge() {
		return age;
	}
	public static int getTotalPersonNumber() {
		return totalPersonNumber;
	}
	// abstract method show Activity
	public abstract void showActivity();
	// toString, 이름, 나이, 전체 명수를 보여준다. 
	public String toString() {
		return "Person's NAME = "+getName()+" Person's AGE = "+getAge()
				+ " Total Person NUMBER = " + getTotalPersonNumber()+ " ";
	}
}
