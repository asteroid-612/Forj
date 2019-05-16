package nohello;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
        int b;
        int large;
        int small;
       
        a = input.nextInt();
        b = input.nextInt();
        if (a >= b){
            large = a;
            small = b;
        }
        else{
            large = b;
            small = a;
        }
        while (small != 0){
            int temp = large % small;
            large = small;
            small = temp;
        }
        System.out.println(small);
		
	}

}
