/*
 * 이름: 이수정
 * 학번: 20171666
 * lab2
 * att,constructors,set method,get method,toString.
 */

package hello;

public class Customer {
	/*attributes*/
	private String customerName;
	private String phoneNumber;
	private int age;
	
	/*Constructors*/
	public Customer() { //no-argument constructor//
		customerName = "Null";
		phoneNumber = "Null";
		age = 0;
	}
	public Customer(String a, String b) {//full-argument//
		customerName = a;
		phoneNumber = b;
		age = 0;
	}
	public Customer(String a, int x) {
		customerName = a;
		phoneNumber = "Null";
		age = x;
	}
	public Customer(int x) {
		customerName = "Null";
		phoneNumber = "Null";
		age = x;
	}
	public Customer(String a, String b, int x) {
		customerName = a;
		phoneNumber = b;
		age = x;
	}
	/*set Method*/
	public void setCustomername(String a) {
		customerName = a;
	}
	public void setPhonenumber(String b) {
		phoneNumber = b;
	}
	public void setAge(int x) {
		age = x;
	}
	/*get Method*/
	public String getCustomername() {
		return customerName;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public int getAge() {
		return age;
	}
	
	/*toString*/
	public String toString() {
		return ("New customer's Name = "+this.getCustomername()+" /"+" Phonenumber = "+
				this.getPhonenumber()+" /"+" Age = "+this.getAge());
	}
}
