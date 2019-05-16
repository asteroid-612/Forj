package hello;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gradeList;
		Scanner input = new Scanner(System.in);
		
		int total;
		int a = 0;
		
		do { // 전체 학생에 대한 토탈넘버.
			System.out.print("Enter the total number of students: ");
			total = input.nextInt();
		} while (total<=0);
		
		gradeList = new int[total];
		
		// for loop을 통해 grade 를 입력받음. 
		for (int i=0; i<gradeList.length;) {
			int firstgrade;
			System.out.print("Enter grade: ");
			firstgrade = input.nextInt();
			while (firstgrade<=0) {  // grade가 양수인지?
				System.out.print("Please enter positive grade: ");
				firstgrade = input.nextInt();
			}
			gradeList[i] = firstgrade;
			i += 1;
		}
		for (int j=0; j<gradeList.length; j++) {
			a += gradeList[j];  // 평균을 구하기 위해 전부 더해준다.
		}
		// 학생 인덱스랑 점수 매치해서 출력 .
		System.out.printf("%s%10s%n", "Index","Grade");
		for (int index = 0; index<gradeList.length; index++)
			System.out.printf("%4d%10d%n", index, gradeList[index]);
		
		a = a / gradeList.length;  // 평균을 구해 다시 average(a)에 저장.
		System.out.printf("The average is %d",a); // 출력
	}

}
