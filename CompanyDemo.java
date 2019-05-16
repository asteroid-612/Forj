package nohello;
import java.io.*;
import java.util.Scanner;

public class CompanyDemo {
	public static void main(String[] args) throws IOException {
		int Personnum;
		int Customernum;
		int Employnum;
		double salary = 0.0;
		// 명수받기 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Person: ");
		Personnum = input.nextInt();
		System.out.print("Enter number of customer: ");
		Customernum = input.nextInt();
		System.out.print("Enter number of Employee: ");
		Employnum = input.nextInt();
		while (Customernum + Employnum > 10) {
			System.out.println("더해서 10을 넘지 않는 수를 입력하세요: ");
			int a = input.nextInt();
			Customernum = a;
			Employnum = a;
		}
		while (Customernum < 0 || Employnum <0) {
			System.out.print("Enter number over 0: ");
			int a = input.nextInt();
			if (a > 5) {
				System.out.print("You can't go over 5: ");
				a = input.nextInt();
			}
			Customernum = a;
			Employnum = a;
		}
		// 사람넣기 
		Person[] personList = new Person[Personnum + 10];
		for (int i = 1; i<Customernum+1; i++) {
			System.out.print("Enter customer phonenumber: ");
			String m = input.next();
			input.nextLine();
			Person p = new CustomerActivity(m);
			CustomerActivity cm = (CustomerActivity) p;
			cm.showActivity();
			personList[i] = p;
		}
		for (int i = Customernum+1; i<Employnum+Customernum+1; i++) {
			System.out.print("Enter employee number: ");
			int num = input.nextInt();
			Person e = new EmployeeActivity(num);
			personList[i] = e;
			EmployeeActivity em = (EmployeeActivity) e;
			em.showActivity();
			salary += em.getMonthlySalary();
		}
		System.out.println("Whole number of person is: " + Person.getTotalPersonNumber());
		System.out.println("Whole monthly Salary is: " + salary);
		// 파일쓰기 
		FileWriter fw = new FileWriter("person.txt", true);
		try {
		for (int i=1; i<personList.length - Personnum; i++) {
			if (personList[i] instanceof CustomerActivity){
				fw.write("1 " + personList[i].toString() + "\n");
				fw.flush();
			}
			else {
				fw.write("2 " + personList[i].toString() + "\n");
				fw.flush();
			}
			}
		}
		catch (NullPointerException e) {
			System.err.println("HANDLED");
		}
		finally {
			fw.close();
		}
	}
	}
 