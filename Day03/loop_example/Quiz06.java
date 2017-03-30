//Quiz06 (2017-03-28)
import java.util.Scanner;
public class Quiz06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 ~ 99 사이의 정수를 입력하시오 : ");
		int val1 = scanner.nextInt();
		if(val1 < 1 || val1 > 99) {
			System.out.println("^ 위의 글자를 잘 읽어 주세요.");
			scanner.close();
			return;
		}
		
		String result = "";
		if((val1 - (val1 / 10) * 10) % 3 == 0)  result = "박수 짝";
		if((val1 / 10) % 3 == 0) {
			if(result == "") result = "박수 짝";
			else result += "짝";
		}
		System.out.println(result);
		scanner.close();
	}
}