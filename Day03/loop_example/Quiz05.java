//Quiz05 (2017-03-28)
package loop_example;

import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하시오 >>");
		int val1 = scanner.nextInt();
		for(int i=val1;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		scanner.close();
	}
}