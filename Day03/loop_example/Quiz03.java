//Quiz03 (2017-03-28)
package loop_example;

import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 1부터 입력하신 숫자사이의 홀수의 개수를 알려드립니다. ===");
		while(true) {
			System.out.print("숫자를 입력하세요. (종료시 0을 입력하세요.) => ");
			int val1 = scanner.nextInt();
			if(val1 == 0) break;
			
			int count =0;
			for(int i=1;i<=val1;i++){
				if(i%2 == 1) count++;
			}
			System.out.println("1에서 " + val1 + "사이의 홀수의 개수는 " + count + "개 입니다.\n");
		}
		scanner.close();
	}
}