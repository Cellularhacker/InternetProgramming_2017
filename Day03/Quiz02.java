//Quiz02 (2017-03-28)
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호 7번째 자리(뒤의 첫번째 자리)를 입력하세요 : ");
		int gender = scanner.nextInt();
		
		int age = 0;
		
		switch(gender){
			case 9: case 0:
				age = 1800; break;
			case 1: case 2:
				age = 1900; break;
			case 3: case 4:
				age = 2000; break;
			default:
				System.out.println("미래에서 온 자여.. 여긴 자네가 있을 곳이 아니라네...");
		}
		String genderS = "";
		if( (gender % 2) == 0) genderS = "여성";
		else genderS = "남성";
		
		System.out.println("당신은 " + age + "년대생 " + genderS + "입니다.");
		
		scanner.close();
	}
}