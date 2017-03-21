//Question 5 - p.90
import java.util.Scanner;
public class Question5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요>>");
		String grade = scanner.next();
		switch(grade) {
			case "A":
			case "B":
				System.out.println("Excellent");
				break;
			case "C":
			case "D":
				System.out.println("Good");
				break;
			case "F":
				System.out.println("Bye");
				break;
			default:
				System.out.println("What..?");
		}
		
		scanner.close();
	}
}