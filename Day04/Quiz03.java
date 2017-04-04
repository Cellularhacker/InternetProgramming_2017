//Quiz03 (2017-04-04)
import java.util.Scanner;

class Q3Func {
	public String Pass2(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		if(avg>= 60)
			return "합격";
		else
			return "불합격";
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세개의 점수를 정수형으로 입력하시오>>");
		Q3Func util = new Q3Func();
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println(util.Pass2(a, b, c) + "입니다.");
		
		scanner.close();
	}
}