//Quiz01.java (2017-04-11)
package Quiz;

import java.util.Scanner;
public class Quiz01 {
	public int maxNum(int num1, int num2, int num3) {
		int temp = 0;
		if(num2 >= num1 && num2 >= num3) {
			temp = num2;
			num2 = num1;
			num1 = temp;
			
		} else if(num3 >= num1 && num3 >= num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num3 >= num2) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		return num1;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz01 q1 = new Quiz01();
		
		System.out.print("첫번째 수 = ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 수 = ");
		int num2 = scanner.nextInt();
		System.out.print("세번째 수 = ");
		int num3 = scanner.nextInt();
		System.out.println("최대값 => " + q1.maxNum(num1, num2, num3));
		
		scanner.close();
	}
}