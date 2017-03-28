// Quiz04 (2017-03-28)
package loop_example;

import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// Checking values that is between 0 ~ 100
		do {
			System.out.print("국어 = ");
			kor = scanner.nextInt();
		}while(kor < 0 && kor > 100);
		
		do {
			System.out.print("영어 = ");
			eng = scanner.nextInt();
		}while(eng < 0 && eng > 100);
		
		do {
			System.out.print("수학 = ");
			math = scanner.nextInt();
		}while(math < 0 && math > 100);
		
		int total = kor + eng + math;
		double avg = (double)total / 3.0;
		
		String grade = "";
		switch((int)avg / 10) {
			case 10: case 9:
				grade = "A"; break;
			case 8:
				grade = "B"; break;
			case 7:
				grade = "C"; break;
			case 6:
				grade = "D"; break;
			case 5: case 4: case 3: case 2: case 1: case 0:
				grade = "F"; break;
			default:
				System.out.println("흠... 평균 값이 뭔가 잘못 되었군요.");
				scanner.close();
				return;
		}
		System.out.println("\n총점 = " + total);
		System.out.printf("평균 = %.2f\n", avg);
		System.out.println("학점 = " + grade + "학점");
		
		
		scanner.close();
	}
}
