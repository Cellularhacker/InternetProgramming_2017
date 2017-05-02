
class Account {
	private String name;
	private int balance;
	private boolean minus;
	
	public Account(String name) {
		this(name, 0);
	}
	public Account(String name, int balance) {
		this(name, balance, false);
	}
	public Account(String name, int balance, boolean minus) {
		this.name = name;
		if(balance < 0) {
			System.out.println("예금입력이 잘못되었습니다. 트랜잭션을 종료합니다.");
			this.balance = 0;
			return;
		}
		this.balance = balance;
		this.minus = minus;
	}
	
	private void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return this.name;
	}
	public int getBalance() {
		return this.balance;
	}
	public boolean getMinus() {
		return this.minus;
	}
	
	public int deposit(int balance) {
		setBalance(this.balance + balance);
		return balance;
	}
	public int withdraw(int balance) {
		if(this.minus == false && (this.balance - balance) < 0) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		setBalance(this.balance - balance);
		return balance;
	}
	
	public String toString() {
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
