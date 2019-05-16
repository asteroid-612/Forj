// 20171666 이수정 5주차 과제 
package hello;
import java.util.Scanner;


public class CustomerDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cus_length = 0;
		System.out.print("Please input number of customer: ");
		cus_length = input.nextInt();
		Customer[] cus_list = new Customer[cus_length];
		
		String name;
		String phnb;
		int age;
		
		for(int i = 0; i<cus_list.length; i++) {
			System.out.print("Please enter name of customer: ");
			name = input.next();
			System.out.print("Please enter phone number: ");
			phnb = input.next();
			System.out.print("Please enter age: ");
			age = input.nextInt();
			Customer ci = new Customer(name,phnb,age);
			cus_list[i] = ci;
		}
		
		for (int j = 0; j<cus_list.length; j++) {
			name = cus_list[j].getCustomername();
			phnb = cus_list[j].getPhonenumber();
			age = cus_list[j].getAge();
			System.out.printf("index is %d. Name = ",j);
			System.out.print(name);
			System.out.print("/ Phonenumber = ");
			System.out.print(phnb);
			System.out.print("/ Age = ");
			System.out.println(age);
		}
	}

}
