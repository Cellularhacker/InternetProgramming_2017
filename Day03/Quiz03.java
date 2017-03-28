//Quiz03 (2017-03-28)
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 = ");
		int a = scanner.nextInt();
		System.out.print("두 번째 수 = ");
		int b = scanner.nextInt();
		System.out.print("세 번째 수 = ");
		int c = scanner.nextInt();
		
		int temp = 0;
		if((b >= a) && (b >= c)) {
			temp = a;
			a = b;
			b = temp;
		} else if ((c >= a) && (c >= b)) {
			temp = a;
			a = c;
			c = temp;
		}
		if(c >= b) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a + " >= " + b + " >= " + c);
		
		scanner.close();
	}
}