
class Account {
	private String name;
	private int balance;
	private boolean minus;
	
	public Account(String name) {	//이름만 받는 생성자. 10번 Line의 생성자를 호출
		this(name, 0);
	}
	public Account(String name, int balance) {	//이름과 초기 예치금을 입력 받는 생성자. 13번 Line의 생성자를 호출 
		this(name, balance, false);
	}
	public Account(String name, int balance, boolean minus) {	//이름과 초기 예치금, 마이너스 금리여부를 입력받는 생성자.
		this.name = name;
		if(balance < 0) {	//초기 계좌 정생시 0원보다 작은 값은 존재할 수 없음, 0으로 잔고 초기화하고 반환.
			System.out.println("예금입력이 잘못되었습니다. 기본값으로 초기화 합니다.");
			this.balance = 0;
			return;
		}
		this.balance = balance;
		this.minus = minus;
	}
	
	private void setBalance(int balance) {	//예금 설정, 외부에서 직접 호출 할수는 없음. -setter
		this.balance = balance;
	}
	public String getName() {	//예금주 이름 반환 -getter
		return this.name;
	}
	public int getBalance() {	//예금액 반환 -getter
		return this.balance;
	}
	public boolean getMinus() {	//마이너스 사용 가능 여부 반환 -getter
		return this.minus;
	}
	
	public int deposit(int balance) {	//예금 입금
		setBalance(this.balance + balance);	//예금액과 입금액을 더하여 예금setter를 호출하여 더한 후, 입금액 수치를 반환.
		return balance;
	}
	public int withdraw(int balance) {	//예금 출금
		if(this.minus == false && (this.balance - balance) < 0) {	//마이너스 금리가 사용 불가능에 인출하려는 금액이 예금액보다 클 경우 에러를 출력.
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		setBalance(this.balance - balance);	//정상적일 경우 예금setter를 호출하여 출금액을 예금액에서 가감한 후, 출금액 수치를 반환.
		return balance;
	}
	
	public String toString() {	//toString 메소드.
		return "이름: " + this.name + ", 잔액: " + this.balance + ", 마이너스 금리 여부: " + minus;
	}
	
}

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("20164149 이동원\n");
		System.out.println("---------- 홍길동 계좌 ----------");
		Account a = new Account("홍길동", 10000);
		System.out.printf("%d원이 입금되었습니다.\n", a.deposit(20000));
		System.out.printf("%s님의 잔액은 %d입니다.\n", a.getName(), a.getBalance());
		System.out.printf("%d원이 출금되었습니다.\n", a.withdraw(40000));
		System.out.printf("%d원이 출금되었습니다.\n", a.withdraw(10000));
		System.out.printf("%s님의 잔액은 %d입니다.\n", a.getName(), a.getBalance());
		
		System.out.println("---------- 사오정 계좌 ----------");
		Account b = new Account("사오정");
		b.withdraw(1000);
		System.out.printf("%s님의 잔액은 %d입니다.", b.getName(), b.getBalance());
		
	}

}
