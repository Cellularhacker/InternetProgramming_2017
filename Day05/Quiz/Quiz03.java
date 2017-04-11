//Quiz03 (2017-04-11)
package Quiz;

import java.util.Scanner;
public class Quiz03 {
	public char convert(char alphabet) {
		int gap = 'a' - 'A';
		if(alphabet >= 'A' && alphabet <= 'Z')
			alphabet += gap;
		else if(alphabet >= 'a' && alphabet <= 'z')
			alphabet -= gap;
		else
			alphabet = '\0';
		
		return alphabet;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz03 q3 = new Quiz03();
		
		System.out.print("영문자 1자를 입력하세요 : ");
		char ch = scanner.next().charAt(0);
		char res = q3.convert(ch);
		if(res == '\0') 
			System.out.println("영문자가 아닙니다.");
		else
			System.out.println(ch + " => " +res);
		
		scanner.close();
	}
}