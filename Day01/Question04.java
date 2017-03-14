//Question04 (p.90)
import java.util.Scanner;
public class Question04 {
	public static void main(String[] args) {
		System.out.print("돈의 액수를 입력하세요>>");
		
		Scanner scanner = new Scanner(System.in);
		int balance = scanner.nextInt();
		
		/* Using Array to save amounts.*/
		int billArray[] = new int[9];
		String forRes = "";
		
		for(int i=0, am=50000, i_bal=balance;i<9;i++) {
			billArray[i] = i_bal/am;
			i_bal%=am;
			
			//dividing with different units.
			if(i<7 && i%2==0) am /= 5;
			else if(i<7 && i%2==1) am /= 2;
			else am /= 10;
			
			//Adding to Response;
			if(billArray[i] == 0) continue;	//There is no the bill or the coin, so skip adding it to res.
			if(i>=0 && i<4) forRes += am + "원: " + billArray[i] + "장, "; //In case of bill
			else if(i>=4 && i<8) forRes += am + "원: " + billArray[i] + "개, "; //In case of coin and not last one.
			else forRes += "개"; // In case of last one.
		}
		
		/*Hard Coding*/
		int fiveMan = balance / 50000;
		int man = (balance % 50000) / 10000;
		int fiveCheon = ((balance % 50000) % 10000) / 5000;
		int cheon = (((balance % 50000) % 10000) % 5000) / 1000;
		int fiveBaek = ((((balance % 50000) % 10000) % 5000) % 1000) / 500;
		int baek = (((((balance % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int fiveSip = ((((((balance % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int sip = (((((((balance % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		int il = (((((((balance % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10;
		
		System.out.println("(for)Reuslt " + forRes);
		System.out.println("(hard coding)Result "
				+ fiveMan + "장 / " + man + "장 / " + fiveCheon + "장 / " + cheon + "장 / "
				+ fiveBaek + "개 / " + baek + "개 / " + fiveSip + "개 / " + sip + "개 / " + il + "개");
	}
}