//Question3 - p.89
import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("논리연산을 입력하세요>>");
		boolean left = scanner.nextBoolean();
		String logic = scanner.next();
		boolean right = scanner.nextBoolean();
	
		switch(logic) {
			case "OR":
				System.out.println(left || right);
				break;
			case "AND":
				System.out.println(left && right);
				break;
			default:
				System.out.println("Wrong Operator...");
		}
			
		scanner.close();
	}
}