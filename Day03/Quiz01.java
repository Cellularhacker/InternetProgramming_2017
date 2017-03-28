//Quiz01 (2017-03-28)
import java.util.Scanner;
public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 = ");
		int a = scanner.nextInt();
		System.out.print("연산자(+, -, *, /, %) = ");
		char op = scanner.next().charAt(0);
		System.out.print("두 번째 수 = ");
		int b = scanner.nextInt();
		
		int result = 0;
		switch(op) {
			case '+':
				result = a + b; break;
			case '-':
				result = a - b; break;
			case '*':
				result = a * b; break;
			case '/':
				result = a / b; break;
			case '%':
				result = a % b; break;
			default:
				System.out.println("Error... Wrong Operator.");
		}
		System.out.println("\n" + a + ' ' + op + ' ' + b + " = " + result);
		
		scanner.close();
	}
}