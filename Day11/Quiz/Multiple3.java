//Quiz02:Multiple3.java (p.128-No.2) 2017-05-23 KST
package Quiz;

import java.util.Scanner;

public class Multiple3 {
	private static void printMultiple3(int[] array) {
		for(int k: array) 
			if(k %3 == 0) System.out.print(k + " ");
		System.out.println();
	}
	private static void inputArray(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 " + array.length + "개 입력>>");
		for(int i=0; i<array.length; i++)
			array[i] = scanner.nextInt();
		scanner.close();
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		inputArray(array);
		printMultiple3(array);
	}
}