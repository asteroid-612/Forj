/*
 * 20171666 이수정
 * lab 3 
 * 1. 사용자에게 몇단인지 물어볼것
 * 2. 2개의 정수를 범위를 정해주기 위해 물어볼것.(scanner)> 구구단 보여주기.
 * 2-1. 2개의 정수의 크기에 따라서 보여주는 순서도 달리할것.
 * 3. 다른 구구단을 실행할 것인지 사용자에게 물어볼것.( zero=end, 1 or more=go)
 */
package hello;
import java.util.Scanner;

class Multipletable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection = 1;
		
		while (selection >= 1) { //0 인지 더 입력하는지에 따른 반복 
			
			Scanner input = new Scanner(System.in);
			int whattable = 0;
			int going = 0;
			int stop = 0;
			int result = 0;
			
			System.out.print("Please enter first number of multiplication table: ");
			whattable = input.nextInt();
			System.out.print("Please enter number to start: ");
			going = input.nextInt();
			System.out.print("Please enter number to stop: ");
			stop = input.nextInt();
			if (going >= stop)  // going이 더 큰 경우 > going에서 빼면서.
				while (going >= stop) {
					result = whattable * going;
					System.out.printf("%d * %d = %d\n", whattable, going, result);
					going -= 1;
				}
			else  // stop이 더 큰 경우 > going에서 더하면서.
				while (going <= stop) {
					result = whattable * going;
					System.out.printf("%d * %d = %d\n", whattable, going, result);
					going += 1;
				}
		System.out.print("Enter 1 or more= restart, 0= end: ");
		selection = input.nextInt();
		}
	System.out.print("Your multiplication table ended.");
	}
}
