//Quiz02 (2017-04-04)
import java.util.Scanner;

class Q2Func {
	public boolean Pass1(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		if(avg>= 60)
			return true;
		else
			return false;
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세개의 점수를 정수형으로 입력하시오>>");
		Q2Func util = new Q2Func();
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		boolean result = util.Pass1(a, b, c);
		if(result)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		
		scanner.close();
	}
}