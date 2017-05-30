//Quiz01 (p.187 - No.4) / 2017-05-30 KST
package quiz;

import java.util.Scanner;

class Phone {
	private String name;
	private String phoneNumber;
	
	public Phone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
}

class PhoneManager {
	private int customerNum;
	private Phone[] customersArray;
	
	public PhoneManager(int maxCustomers) {
		this.customersArray = new Phone[maxCustomers];
	}
	
	public int getMaxCustomers() {
		return this.customersArray.length;
	}
	
	public void newPhone(String name, String phoneNumber) {	// Making a new Phone()
		if(customerNum < this.customersArray.length)
			this.customersArray[customerNum++] = new Phone(name, phoneNumber);
		else
			System.out.println("최대 고객 수를 초과 했습니다.");
	}
	
	public void searchByName(String name) {	// Search by Name
		for(int i=0; i<customerNum; i++) {
			if(customersArray[i].getName().equals(name)) {
				System.out.println(name + "의 번호는 " + customersArray[i].getPhoneNumber() + "입니다.");
				return;
			}
		}
		
		System.out.println(name + " 이 없습니다.");	// There is no matched customer.
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sName = "";
		
		System.out.print("인원수>>");
		PhoneManager cs1 = new PhoneManager(scanner.nextInt());
		for(int i=0; i<cs1.getMaxCustomers(); i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로입력)>>");
			String name = scanner.next();
			String phoneNumber = scanner.next();
			cs1.newPhone(name, phoneNumber);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			sName = scanner.next();
			
			if(sName.equals("exit")) break;
			
			cs1.searchByName(sName);
		}
		
		scanner.close();
	}
}
