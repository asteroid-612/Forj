/*
 * 이름: 이수정
 * 학번: 20171666
 * 2주차 첫번째 숙제
 * greeting, calculation, comparison.
 */

package hello;
import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args)
	{
		System.out.println("WELCOME! Nice to meet you in java!");
		
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		int sub;
		int mult;
		int divi;
		int remain;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.printf("Sum is %d%n", sum);
		sub = number1 - number2;
		System.out.printf("Subtraction is %d%n", sub);
		mult = number1 * number2;
		System.out.printf("Multiflcation is %d%n", mult);
		divi = number1 / number2;
		System.out.printf("Division is %d%n", divi);
		remain = number1 % number2;
		System.out.printf("Remainder is %d%n", remain);
		
		if (number1 == number2)
			System.out.println("The Input numbers are the same");
	}

}
