//Quiz05 (2017-03-28)
import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력하시오 : ");
		int year = scanner.nextInt();
		
		String result = "";
		if(year %400 == 0) {
			result = "윤년";
		} else if (year % 100 == 0) {
			result = "평년";
		} else if (year % 4 == 0) {
			result = "윤년";
		} else result = "평년";
		
		System.out.println(result + "입니다.");
		
		scanner.close();
	}
}