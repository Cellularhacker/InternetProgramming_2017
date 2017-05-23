//Quiz03:Eng2Kor.java (p.129-No.6) 2017-05-23 KST
package Quiz;

import java.util.Scanner;

public class StudentTest {
	private static int wordCheck(String[] array, String target) {
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String eng[] = { "student" , "love" , "java" , "happy" , "future" };
		String kor[] = { "학생" , "사랑" , "자바" , "행복한" , "미래" };
		
		String text = "";
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			text = scanner.next();
			if(text.equals("exit")) break;
			
			int result = wordCheck(eng, text);
			if(result == -1)
				System.out.println("그런 단어가 없습니다.");
			else
				System.out.println(kor[result]);
		} 
		scanner.close();
	}
}