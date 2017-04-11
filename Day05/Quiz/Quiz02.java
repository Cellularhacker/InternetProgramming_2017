//Quiz02 (2017-04-11)
package Quiz;

import java.util.Scanner;
public class Quiz02 {
	public String sortNum(int num1, int num2, int num3) {
		int temp = 0;
		if(num2 >= num1 && num2 >= num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if(num3 >= num1 && num3 >= num2) {
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		if(num3 >= num2) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		return num1 + " >= " + num2 + " >= " + num3;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz02 q2 = new Quiz02();
		
		System.out.print("첫번째 수 = ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 수 = ");
		int num2 = scanner.nextInt();
		System.out.print("세번째 수 = ");
		int num3 = scanner.nextInt();
		System.out.println(q2.sortNum(num1, num2, num3));
		
		scanner.close();
	}
}