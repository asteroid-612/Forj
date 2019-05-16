/*
 * 20171666 이수정
 * lab 3
 * 1.factorial 을 하기위한 하나의 양수를 입력하도록 묻기
 * 2. 하나의 양수를 읽기 (양수가 아니라면, 정확한 인풋을 하도록 계속 물어볼것)
 * 3. 계산 상황을 보여주도록, ex) 5! = 5 * 4 * 3 * 2 * 1 = 120
 * 4. 다시 시작할것인지 유저에게 물어볼것. ( zero = finish. one = continue to work ) 
 */

package hello;
import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) 
	{
		int selection = 1;
		
		while (selection == 1) {
			
			Scanner input = new Scanner(System.in);
			int positive = 0;
			int count = 1;
			int result = 1;
			
			System.out.print("Enter one number to start factorial: ");
			positive = input.nextInt();
			
			while (positive <= 0) {  // 양수가 아닌동안 다시 인풋 받기.
				System.out.print("Please enter one positive number: ");
				positive = input.nextInt();
			}
			
			System.out.printf("Number you entered to start is %d\n",positive);
			System.out.print(positive + "!" + "=" + positive + " ");
			if (positive == 1) {
				result = 1;
			}
			while (positive != count) {  // 카운트와 포지티브가 다를때.
				result *= positive;
				positive -= 1;
				System.out.print("*"+" "+ positive+" ");
			}
			System.out.printf("= %d\n",result);
			
			System.out.print("Enter 1= restart, 0= quit: ");
			selection = input.nextInt();
		}
		System.out.println("Your factorial is ended.");
	}
}