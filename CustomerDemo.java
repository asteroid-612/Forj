/*
 * 이름: 이수정
 * 학번: 20171666
 * lab2
 * att,constructors,set method,get method,toString.
 */

package hello;

public class CustomerDemo {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1);
		Customer c2 = new Customer("Amy","010-1234");
		System.out.println(c2);
		Customer c3 = new Customer("Eve",39);
		System.out.println(c3);
		Customer c4 = new Customer(79);
		System.out.println(c4);
		Customer c5 = new Customer("Hyejoon","010-9879",21);
		System.out.println(c5);
		
		c1.setCustomername("정국");
		c2.setAge(17);
		c3.setPhonenumber("010-8621");
		c4.setCustomername("Evelin");
		c4.setPhonenumber("010-9790");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	
	}

}
