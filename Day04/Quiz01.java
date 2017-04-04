//Quiz01 (2017-04-04)
import java.util.Scanner;

class Func {
	public void Pass(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		if(avg>= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세개의 점수를 정수형으로 입력하시오>>");
		Func util = new Func();
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		util.Pass(a, b, c);
		
		scanner.close();
	}
}