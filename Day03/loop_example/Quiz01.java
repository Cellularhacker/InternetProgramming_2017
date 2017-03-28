//Quiz01 (2017-03-28)
package loop_example;

import java.util.Scanner; 
public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 = ");
		int val1 = scanner.nextInt();
		System.out.print("두번째 수 = ");
		int val2 = scanner.nextInt();
		
		if(val2 > val1) { // Swap
			int temp = val1;
			val1 = val2;
			val2 = temp;
		}
		int result = 0;
		for(int i=val2;i<=val1;i++)
			result += i;
		
		System.out.println(val2 + "에서 " + val1 + "사이의 합은 " + result + "입니다.");
		
		scanner.close();
	}
}