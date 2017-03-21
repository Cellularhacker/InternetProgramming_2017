//Bonus1 - p.91
import java.util.Scanner;
public class Bonus1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("식을 입력하세요>>");
		double left = scanner.nextDouble();
		String op = scanner.next();
		double right = scanner.nextDouble();
		
		switch(op) {
			case "+":
				System.out.println("연산결과 " + (left + right));
				break;
			case "-":
				System.out.println("연산결과 " + (left - right));
				break;
			case "*":
				System.out.println("연산결과 " + (left * right));
				break;
			case "/":
				System.out.println("연산결과 " + (left / right));
				break;
			default:
				System.out.println("연산결과 ... 그런거 읎어요!");
		}
		
		scanner.close();
	}
}