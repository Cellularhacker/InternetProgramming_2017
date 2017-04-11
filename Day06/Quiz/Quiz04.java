//Quiz04 (2017-04-11)
package Quiz;

import java.util.Scanner;
public class Quiz04 {
	public void printAlphabet(char alphabet) {
		System.out.println("alphabet -> " + alphabet);
		char startChar = 'A';
		if(alphabet >= 'a' && alphabet <= 'z') {
			startChar = 'a';
		}
		
		for(int i=alphabet; i>=startChar;i--) {
			for(int j=startChar;j<=i;j++) {
				System.out.print( (char)j );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz04 q4 = new Quiz04();
		char ch = '\0';
		do {
			System.out.print("알파벳 한 문자를 입력하시오 >> ");
			ch = scanner.next().charAt(0);
		} while( !(((int)ch >= 'A' && (int)ch <= 'Z') || ((int)ch >= 'a' && (int)ch <= 'z')) );
		q4.printAlphabet(ch);
		
		scanner.close();
	}
}