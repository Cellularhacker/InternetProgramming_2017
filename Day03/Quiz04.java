//Quiz04 (2017-03-28)
import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int gap = 'a' - 'A';
		System.out.print("영문자 1자를 입력하세요 : ");
		char val1 = scanner.next().charAt(0);

		scanner.close();
		System.out.print("\n" + val1 + " => ");
		
		if(val1 >= 'A' && val1 <= 'Z')
			val1 += gap;
		else if(val1 >= 'a' && val1 <= 'z')
			val1 -= gap;
		else {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		System.out.println(val1);
	}
}